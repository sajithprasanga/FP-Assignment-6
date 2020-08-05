object Q1 extends App{
	val p1 = Point(2,4);
	val p2 = Point(4,6);
	
	println(p1+p2);
}


case class Point(a:Int,b:Int){

	def x: Int = a;
	def y: Int = b;

	def  +(that : Point) = Point(this.x+that.x , this.y+that.y);
}