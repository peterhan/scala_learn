class User
val user1 = new User
println(user1)

class Point(var x:Int=0,var y:Int=0){
    def move(dx:Int,dy:Int):Unit={
        x = x + dx
        y = y + dy
    }
    override def toString:String=s"{$x,$y}"
}
val point2= new Point(2,3)
val point1= new Point
println(point1.x)
println(point1)

class Point2{
    private var _x=0
    private var _y=0
    private val bound=100
    def x=_x
    def x_=(newValue:Int):Unit={
        if (newValue<bound) _x =newValue
    }
    def y= _y
    def y_=(newValue:Int):Unit={
        if (newValue<bound) _y =newValue else printWarning

    }
    private def printWarning = println("Warning:Out of bounds")
    
}
val point3 =  new Point2
point3.x=99
point3.y =101


class Point4(val x: Int, val y: Int)
val point4 = new Point4(1, 2)
println(point4.x) 
//point4.x = 3  // <-- does not compile

class Point5(x: Int, y: Int)
val point5 = new Point5(1, 2)
println(point5) 
//point.x  // <-- does not compile