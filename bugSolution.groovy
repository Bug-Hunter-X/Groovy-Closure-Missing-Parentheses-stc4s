```groovy
def someMethod(Closure c) {
  //some code
  println "Closure executed with argument: "+ c
  c() // Executing the closure
}

someMethod({  //closure with parenthesis
  println "Inside the closure"
})
```