//
println(1+1)
val xx:Int = 1+1
println(xx)
//
var x=1+1
x= 3
println(x*x)
//
println({
    val x=1+1
    x+1
    })
    //
val f=(x:Int)=>x+1
println(f(2))
//
object obj{
    def main():Unit={
        println("main")
    }
}
obj.main()
//
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int 
    = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 9
//
def name: String = System.getProperty("user.name")
println("Hello, " + name + "!");
//
def getSquareString(input: Double): String = {
  val square = input * input
  square.toString
}

//
class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}
val greeter = new Greeter("Hello, ", "!")
greeter.greet("Scala developer") // Hello, Scala developer!

//

case class Point(x: Int, y: Int)

val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val yetAnotherPoint = Point(2, 2)

if (point == anotherPoint) {
  println(point + " and " + anotherPoint + " are the same.")
} else {
  println(point + " and " + anotherPoint + " are different.")
} // Point(1,2) and Point(1,2) are the same.

if (point == yetAnotherPoint) {
  println(point + " and " + yetAnotherPoint + " are the same.")
} else {
  println(point + " and " + yetAnotherPoint + " are different.")
} // Point(1,2) and Point(2,2) are different.


//
object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}
for(i<-Range(1 ,4000,2000)){
    println(IdFactory.create(),i,i*i,i*i*i)
}

//trait
// trait Greeter {
  // def greet(name: String): Unit
// }
trait tGreeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends tGreeter

class CustomizableGreeter(prefix: String, postfix: String) extends tGreeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter1 = new DefaultGreeter()
greeter1.greet("Scala developer") // Hello, Scala developer!

val customGreeter = new CustomizableGreeter("How are you, ", "?")
customGreeter.greet("Scala developer") // How are you, Scala developer?

//

object Main {
  def main(args: Array[String]): Unit =
    println("Hello, Scala developer!")
}