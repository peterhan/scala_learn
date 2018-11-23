/*
class Foo[+A] // A covariant class
class Bar[-A] // A contravariant class
class Baz[A]  // An invariant class

*/
// List[Dog] List(Animal)
abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal
//The Scala standard library has a generic immutable sealed abstract class List[+A]

def printAnimalNames(animals: List[Animal]): Unit = {
  animals.foreach { animal =>
    println(animal.name)
  }
}

val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

printAnimalNames(cats)
// Whiskers
// Tom

printAnimalNames(dogs)
// Fido
// Rex

// contravariant ====================================================
abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}


val myCat: Cat = Cat("Boots")

def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)

}

val catPrinter: Printer[Cat] = new CatPrinter
val animalPrinter: Printer[Animal] = new AnimalPrinter

printMyCat(animalPrinter)
printMyCat(catPrinter)


// invariant

class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(value: A): Unit = {
    _value = value
  }
}

val catContainer: Container[Cat] = new Container(Cat("Felix"))
// val animalContainer: Container[Animal] = catContainer
// animalContainer.setValue(Dog("Spot"))
// val cat: Cat = catContainer.getValue // Oops, we'd end up with a Dog assigned to a Cat


//other
//Function1 represents a function with one argument, where the first type parameter T represents the argument type, and the second type parameter R represents the return type. A Function1 is contravariant over its argument type, and covariant over its return type. For this example we’ll use the literal notation A => B to represent a Function1[A, B]
trait Function1[-T, +R]
abstract class SmallAnimal extends Animal
case class Mouse(name: String) extends SmallAnimal