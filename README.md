# _What is Kotlin?_

- Ryan Jay
- ryan.jay@uoit.net

## About the language

> - History

Kotlin was first released in 2011 by JetBrains, after a year of prior development, and was meant as a Java Virtual Machine(JVM) language.  The motivation for the creation of this language was that the creators felt that there was no other language that had the features they required besides scala, but they wanted something with a faster compile time similar to that of java.  Similar to how Java was named after an island, Kotlin was named after Kotlin Island, by St. Petersburg. 
The language was designed to be strong enogh to be used in industry and is object-oriented.  It is meant to be a better version of Java, but still be interoperable.

The first officially stable release was Kotlin v1.0 on February 15, 2016, meaning any further versions will be aimed to be backwards compatible to this version.

The next version v1.2 was released on November 28, 2017 and the big feature added was the ability to share code between Java Virtual Machine, and Javascript platforms.  
The most recent version v1.3 was released on October 29, 2018, and implemented [coroutines](https://en.wikipedia.org/wiki/Coroutine), for [asynchronous programming](https://visualstudiomagazine.com/articles/2011/03/24/wccsp_asynchronous-programming.aspx), meaning flow control can be passed back and forth between routines.


> - Some interesting features

**Java Interoperablility**

Kotlin offers interoperability with java, with backwards compatibility for Java 6 and 7.  

**Well formed library**

The standard Kotlin Library is small and is aimed at the extensions made to the Java standard library.  This small but precise library reduces runtime overhand, and allows for optimizations that can be specifically aimed at Android development.

**Not everything needs to be in a class**

Kotlin allows users to define objects and functions at the top level, taking away the required function inside of the file name class, a nice addition for quick simple tests

**Open source**

Kotlin is an open source programming language, off of the baseline of the initial build by Jetbrains.

## About the syntax

The syntax can be found in the [basic syntax](https://github.com/rjay0112/csci3055u-project-template/tree/master/basic-syntax) folder

## About the tools

Kotlin has its own compiler *kotlinc*, and can ahve many different options for compiling, including key features such as *-d* which is for the output name and type.  *-include-runtime* makes the output file runnable and includes the runtime library for kotlin

```kotlin
$ kotlinc exampleProgram.kt -include-runtime -d exampleProgram.jar
```

Kotlin can be interpreted to both java to run on the JVM, as well as javascript.

## About the standard library

The standard library examples can be found in the [standard-library](https://github.com/rjay0112/csci3055u-project-template/tree/master/standard-library) folder

## About open source library

*Android*

Kotlin has been widely used for the development of Android applications, including big companies like Pinterest and Evernote.  There is also a wide variety of open source libraries that can help in this development.

https://github.com/metalabdesign/AsyncAwait  Used for writing asynchronous code for Android development

https://github.com/TouK/bubble  Used to obtain screen orientation

https://github.com/denisidoro/krouter  used for controlling and rerouting Android activity within the application

*Data Science*

There have been a wide variety of open source libraries added to Kotlin to aid in the development of using kotlin for data science.

https://github.com/thomasnield/kotlin-statistics Used for advanced statistic functions like variance and standard deviation

https://github.com/holgerbrandl/krangl Used for modifications of tabular data

https://github.com/sekwiatkowski/Komputation Used for neural networks

https://github.com/MarcinMoskala/KotlinDiscreteMathToolkit Used for discrete mathemtic functions including permutations and combinations

# Analysis of the language

Kotlin is a largely object-oriented language, but can also be seen as a way to support functional programming.  Kotlin allows for a mixture of OOP and FP, and can be demonstrated by the availability to use features such as FP function types and lambdas, as well as higher-order functions.  It also does support the ability to do procedural programming as well.
Furthermore, becauase Kotlin allows for access to java classes, and with this, we can use functionality such as [reflections](https://kotlinlang.org/docs/reference/reflection.html) to give a workaround for meta-programming, but does not currently support macros.

Kotlin allows for symbols defined at higher scopes to be modified in lower scopes, but functions can also access variables and parameters that were defined in outer scopes, with a good example being list modifications, where the function calls outside of itself to the list.  
Similar to the majority of other languages, Kotlin uses lexical scoping, as it is easier for humans to read as well as any analysis tools.

A good example to see the constructs in place for functional programming can be seen in the [collections](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html) part of the standard library.  By detault, values are immutable, and can be seen through the lists, sets and maps for example.  Kotlin is also very leniant and allows for all of these types to also have mutable versions, that can be made on the creation of the variable.
Kotlin is statically typed, but because it can be interpreted into Javascript code, it allows for the usage of dynamic typing, but by doing so, makes it so that your kotlin code is no longer supported for JVM.

Finally, we can talk about the strengths and weaknesses of kotlin.
The strengths of the language are that it is very similar to java, making a switch over for companies and developers fairly simple, as well as being easy to maintain because of its support by a large number of IDE's including Intellij and android studio.  Furthermore, it is a clean and compact language, as well as giving different variable types like mutable and immutable, or var vs val to more clearly define what wee want to do with those types.  Kotlin also requires less code on average to do the same thing in java.

The cons of kotlin are that there is a limited amount of resorces and people who may have already fixed the issue you may be having, as well as reportedly having a wide range of fluctuation in compilation time.  Furthermore, because of the smaller community, it can be harder to learn to program in, and there are also very few experts for the language.
