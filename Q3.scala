import math.{ sqrt, pow }

object Q3 extends App{
	val p1 = Point(4,1);
	val p2 = Point(2,4);
	
	val p3 = p1.distance(p2);
	println(p3);

}


case class Point(a: Double , b: Double){
	def x: Double = a;
	def y: Double = b;

	def distance (that: Point):Double = { sqrt((this.x-that.x)*(this.x-that.x) + (this.y-that.y)*(this.y-that.y)) } 
}