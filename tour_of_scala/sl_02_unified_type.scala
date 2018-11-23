// Any 
    // AnyVal
        // Double
        // Float
        // Long
        // Int
        // Short
        // Byte
        // Unit
        // Boolean
        // Char
    // AnyRef          Null        Nothing
        // List
        // Option
        // YourClass
        
val list: List[Any] = List(
  "a string",
  732,  // an integer
  'c',  // a character
  true, // a boolean value
  () => "an anonymous function returning a string"
)

list.foreach(element => println(element))
println()
for(elm <-list){
    println(elm)
}

val x: Long = 987654321
val y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)

val face: Char = '☺'
val number: Int = face  // 9786


val x: Long = 987654321
val y: Float = x  // 9.8765434E8
val z: Long = y  // Does not conform