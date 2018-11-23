case class Book(isbn:String)
val frankenstein=Book("978-0486282114")

case class Message(sender: String, recipient: String, body: String)
val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

println(message1.sender)  // prints guillaume@quebec.ca
//message1.sender = "travis@washington.us"  // this line does not compile

val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3  // true
println(messagesAreTheSame)