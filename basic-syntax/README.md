This folder includes the sample code to illustrate
the basic syntax of the language.
## About the syntax


**Variables**

values, keyworded "val" are read only, and the value type is not rewuired when assigned immediatly
```kotlin
val a=5
val b: Int=5
```

variables, keyworded "var" can be reassigned to other values

```kotlin
var x=4
x+=1

```


**function defining**
```kotlin
//sample function returning multiplication of 3 numbers
fun tripleMultiply(a: Int, b: Int, c: Int): Int {
  return a*b*c
}

//functions can also have *Unit* as return type if there is no 
//meaningful return value, but can be emitted entirely
fun tripleMultiply(a: Int, b: Int, c: Int) {
  println("multiplication of $a * $b * $c is ${a*b*c}")
}
```





