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

sample function returning multiplication of 3 numbers

```kotlin
fun tripleMultiply(a: Int, b: Int, c: Int): Int {
  return a*b*c
}
```

functions can also have *Unit* as return type if there is no meaningful return value, but can be emitted entirely

```kotlin
fun tripleMultiply(a: Int, b: Int, c: Int) {
  println("multiplication of $a * $b * $c is ${a*b*c}")
}
```

**Conditional Statements**

Standard if else format

```kotlin
if (grade>70){
  println("passed amazingly!")
} else if (grade>49){
  println("barely passed")
} else {
  println("failed")
}
```

**type checking**

*is* checks if an expression is of the specified type

```kotlin
if (grade is Int){
  grade+=10
} else{
  grade=null
}
```

**loops**

For loops can either directly or indrectly iterate through the lists.
A list can be created by using the *listOf* function

```kotlin
val grades=listOf(50,67,22,99)
for (grade in grades) {
  println("grade= $grade")
}

for (index in grades.indices) {
  println("grade at index $index = ${grades[index]}")
}
```

While loop

```kotlin
var count=0
while (count < 4){
  println(count)
  count++
}
```

**Ranges**

For ranges in kotlin, both the starting and ending bounds are inclusive

```kotlin
var sum=0
for (i in -2..4){
  sum+=i
}
//=> 7
```

It can also be used to see whether or not a number is in the desired range

```kotlin
if (grade in 0..100){
  println("valid grade")
}else{
  println("grade out of range")
}
```

**it**

Widely used for implicit naming of a single character where a lambda expression only has a single parameter.
The parameter will be implicitly deckared with *it*

```kotlin
val listInts= listOf(50,60,70,20,30)
println(listInts.filter{it>50})
//=> [60,70]
```
