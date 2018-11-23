import scala.util.Random

object CustomerID {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) 
    else None
  }
}

val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
customer1ID match {
  case CustomerID(name) => println(name)  // prints Sukyoung
  case _ => println("Could not extract a CustomerID")
}

val customer2ID = CustomerID("Nico")
val CustomerID(name) = customer2ID
println(name)  // prints Nico
val name1 = CustomerID.unapply(customer2ID)
val CustomerID(name2) = "a--asdfasdfasdf"
println(name)
println(name1)
println(name2)
try{
    val CustomerID(name3) = "-asdfasdfasdf"
    println(name3)
}catch{
    case e: Exception => println("exception caught: " + e);
}finally {
    println("always execute")
}

