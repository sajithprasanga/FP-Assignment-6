object Q2 extends App{
	val p1 = Point(2,4);

	val p3 = p1.move(3,5);
	println(p3);

	
}

case class Point(a:Int , b:Int){
	def x: Int = a;
	def y: Int = b;

	def move (dx:Int , dy:Int) = Point(this.x+dy,this.y+dy);
}