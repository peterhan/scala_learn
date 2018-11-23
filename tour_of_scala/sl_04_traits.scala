trait HairColor
//
trait Iterator[A]{
    def hasNext:Boolean
    def next():A
}
class IntIterator(to:Int) extends Iterator[Int]{
    private var current=0
    override def hasNext:Boolean = current<to
    override def next():Int={
        if(hasNext){
            val t = current
            current +=1
            t
        } else 0
    }
}
val iterator = new IntIterator(10)
println(iterator.next())
println(iterator.next())

//

import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet with Iterator[Pet]{
    def hasNext:Boolean={
        true
    }
    def next():Pet={
        new Dog("nothing")
    }
}

val dog = new Dog("Harry")
val cat = new Cat("Sally")

val animals = ArrayBuffer.empty[Pet]
animals.append(dog)
animals.append(cat)
animals.foreach(pet => println(pet.name))  // Prints Harry Sally
