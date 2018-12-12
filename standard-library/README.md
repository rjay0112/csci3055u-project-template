This folder contains the sample code to illustrate some useful
functionalities and data structures offered by the standard
library of the language.

# Data Structure Types

## Basics

### Numbers

Double- 64 bits, 
Float-  32 bits, 
Long-   64 bits, 
Int-    32 bits, 
Short-  16 bits, 
Bye-    8 bits

By default, double is chosen for decimals, to use float, it must be tagged with "f"
Longs can be tagged by a capital L.
Kotlin supports underscores to make numbers more human readable.
Furthermore, these number types have a wide range of conversions( toByte() , toShort() , toInt() , toLong() , toFloat() , toDouble() , toChar() )


```kotlin
val intExample = 1_000
val longExample = 1_234_567_890
val doubleExample = 6.55
val floatExample = 6.555f
val binaryExample = 0b01011110
```

### Characters

Defined by single quotes, characters can also be converted into an Int explicitally.

```kotlin
val c = 'b'
c.toInt()
//=>98
```

### Boolean

true or false, using || as OR , && as AND and ! as NOT

```kotlin
false||true     //=> true
false&&true     //=> false
!false          //=> true
```

### Arrays

get and set methods used through [ ]
An array can be created by using the built-int *arrayOf()* or *arrayOfNulls()*

```kotlin
    var vegetables = arrayOf("carrot", "broccili", "spinach", "zucchini")
    println(vegetables[0])  //=>carrot
    vegetables[0]="eggplant"
    println(vegetables[0]) //=>eggplant
```

### Strings

Strings are immutable in Kotlin, and can be accessed similarly to that of arrays through [ ]
This means they can also be iterated through a for-loop, to get each character.
Furthermore, strings can be concatenated using the *+* operator.
They can also be concatenated with other types, so long as the first is the string.

```kotlin
for (letter in "hello"){
  println(letter)
}
val fruit = "Apple " + 0.99
println(fruit + " cost")    //=> Apple 0.99 price
```

### String Templates

Strings are able to contain templates, that can hold expressions.  This is where the pieces of code are evaluated and then concatenated into the string.  All template expressions begin with *$*, and if followed by a variable name nothing mroe is required, but if followed by an expression, curly braces are required {}.

```kotlin
val price=1.22
println("I cannot believe this fruit costs $price")
println("With tax, the fruit costs ${price*1.13}")
```

### Sets

Similar formatting that of arrays, they can be initialized by using the *setOf* function.
By default, all lists, and sets are immutable, as well as containing no duplications.  

```kotlin
val setExample= setOf("apple","orange","pear","pear")
println(setExample)     => ["apple","orange","pear"]
```


# functions

## Immutable Collection Functions

### Sets

*Union, intersection, difference*

difference of sets for kotlin use the subtract function

```kotlin
val setEx = setOf(2,3,4)
//union
println(setEx.union(setOf(3,4,5,6)))            //=> [2,3,4,5,6]
//intersection
println(setEx.intersect(setOf(3,4,5,6)))        //=>[3,4]
//differemce
println(setEx.subtract(setOf(3,4,5,6)))       //=> [2]
```

### additional general transformation functions

*take*

takes specific elements in the lists, handy when you cannot directly change the size of the list, including the removal of items in the same list.

```kotlin
val listEx = listOf(1,2,3,4,5,6,7,8,9)

//take
listEx.take(2)      //=> [1.2]

//take last n elements
listEx.takeLast(2)  //=> [8,9]

//conditional take
listEx.takeWhile{ it < 4}   //=>[1,2,3]

//conditional take last
listEx.takeLastWhile {it > 6} //=>[7,8,9]
```

*drop*

similarly, the library includes a set of drop functions, to drop the selected elements of the list

```kotlin
val listEx = listOf(1,2,3,4,5,6,7,8,9)

//drop
listEx.drop(2)      //=> [3,4,5,6,7,8,9]

//drop last n elements
listEx.dropLast(2)  //=> [1,2,3,4,5,6,7]

//conditional drop
listEx.dropWhile{ it < 4}   //=>[4,5,6,7,8,9]

//conditional drop last
listEx.dropLastWhile {it > 6} //=>[1,2,3,4,5,6]
```

### Lambda Expressions

There are many different types of expressions that can be used on collections to modify to the desired results with ease.  These include *filter* *sortedBy* *map* *forEach* 

```kotlin
val veggies = listOf("celery","carrot","peas","eggplant")
veggies.filter{it.startsWith("c")}          //=> ["celery","carrot"] 
veggies.sortedBy{it}                        //=>["carrot","celery","eggplant","peas"]
veggies.map{it.toUpperCase()}               //=>["CELERY", "CARROT", "PEAS", "EGGPLANT"]
veggies.forEach{println("A veggie is $it)}
//=> "A veggie is celery"
//      ....
//=> "A veggie is eggplant"

```
