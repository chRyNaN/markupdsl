# markupdsl
A Kotlin DSL Library of the open news and blog format
[![](https://jitpack.io/v/chRyNaN/markupdsl.svg)](https://jitpack.io/#chRyNaN/markupdsl)

This Kotlin library allows for DSL creation of items from the open news and blog [markup](https://github.com/chRyNaN/markup) library.

## Building the Library
**Kotlin Common Project:**
```groovy
implementation 'com.github.chRyNaN.markupdsl:markupdsl-common:VERSION'
```
**JVM Project:**
```groovy
implementation 'com.github.chRyNaN.markupdsl:markupdsl-jvm:VERSION'
```
**JS Project:**
```groovy
implementation 'com.github.chRyNaN.markupdsl:markupdsl-js:VERSION'
```

## Using the Library
Articles and their Content can be created using a DSL.
```kotlin
article(articleId) {
    title = "My Article"
    description = "An Article that is really good"
    
    content {
        headerOne("The Start")
        
        text {
            plain("This is Plain Text.") + bold("This is Bold Text.") + "This is also Plain Text."
        }
    }
}
```