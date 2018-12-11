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


*functions*

```kotlin


```
