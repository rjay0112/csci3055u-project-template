import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import tornadofx.*

class charNodes {
    var count: Int
    var symbol: String
    var leftChild:charNodes?=null
    var rightChild: charNodes?=null

    constructor(count: Int, symbol: String){
        this.count=count
        this.symbol=symbol
    }
    constructor(count: Int,symbol: String,leftChild:charNodes,rightChild:charNodes){
        this.count=count
        this.symbol=symbol
        this.leftChild=leftChild
        this.rightChild=rightChild
    }


}

fun findPrefix(node:charNodes, prefix:String, totalList:ArrayList<String>): ArrayList<String>{
    if (node.leftChild==null) {
        totalList.add("${node.symbol}                      $prefix")
        return totalList
    }else{
        val leftList=findPrefix(node.leftChild!!,prefix+"0",totalList)
        val rightList=findPrefix(node.rightChild!!,prefix+"1",totalList)
        val newList= ArrayList<String>()
        newList.addAll(leftList)
        newList.addAll(rightList)
        return newList
    }
}

fun main(args: Array<String>){
    launch<MyApp>(args)
}

class MyApp: App(MyView::class)

class MyView: View("Huffman's Prefix Codes Algorithm"){
    override val root=hbox {
        
        val testString = "hello how are you doing today"


        var countArray = IntArray(256)
        for (character in testString) {
            var index = character.toInt()
            countArray[index] += 1
        }
        var listSize = 0
        for (i in countArray.indices) {
            if (countArray[i] > 0) {
                listSize++
            }
        }
        var tupleArray = arrayOfNulls<charNodes>(listSize)

        var counter = 0
        for (i in countArray.indices) {
            if (countArray[i] > 0) {
                tupleArray[counter] = charNodes(countArray[i], i.toChar().toString())
                counter++
            }
        }
        vbox{
            barchart("Character occurance counts", CategoryAxis(), NumberAxis()) {

                series("characters") {
                    for (item in tupleArray) {
                        data(item?.symbol, item?.count)
                    }
                }
            }
            label("TEXT TO ANALYZE: \"$testString\"")
        }
        tupleArray.sortBy({ it?.count })

        for (i in tupleArray.indices - 1) {
            val low1 = tupleArray[0]
            val low2 = tupleArray[1]
            val combined = charNodes(low1?.count!! + low2?.count!!, low1.symbol + low2.symbol, low1, low2)
            tupleArray[0] = charNodes(1000000, "null")
            tupleArray[1] = combined
            tupleArray.sortBy({ it?.count })
        }
        val totalledNode = tupleArray[0]

        var prefList=arrayListOf("")
        var test=findPrefix(totalledNode!!, "",prefList)

        listview<String>{
            items.add("character        prefix code")
            for (item in test.distinct()){
                if(item != ""){
                    items.add(item)
                }
            }
        }
    }
}
