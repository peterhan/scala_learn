def factorial(x: Int): Int = {
   def fact(x: Int, accumulator: Int): Int = {
     if (x <= 1) accumulator
     else fact(x - 1, x * accumulator)
   }  
   fact(x, 1)
}

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(39))


val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val res = numbers.foldLeft(0)((m, n) => m + n)
print(res) // 55

numbers.foldLeft(0)(_ + _)