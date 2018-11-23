// def foldLeft[B](z:B)(op:(B,A)=>B):B
val numbers=List(1,2,3,4,5,6,7,8,9,10)
var numbers1= numbers:+11
println(numbers1)
val res  = numbers.foldLeft(0)((m,n)=>m+n)
println(res)

// numbers.foldLeft(0,{(m, n) => m+n})

println(numbers.foldLeft(0)(_+_))
val numberFunc=numbers.foldLeft(List[Int]())_
println(numberFunc)
val squares=numberFunc((xs,x)=>xs:+x*x)
println(squares.toString())

val cubes=numberFunc((xs,x)=>xs:+x*x*x)
println(cubes.toString())

numbers.foldLeft(0)((sum,item)=>sum+item)
numbers.foldRight(0)((sum,item)=>sum+item)

numbers.foldLeft(0)(_+_)
numbers.foldRight(0)(_+_)

(0/:numbers)(_+_)
(numbers:\0)(_+_)