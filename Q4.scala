object Q4 extends App{
	val p1 = Point(2,4);
	
	val p3 = p1.move();
	println(p3);
}

case class Point(a: Int , b: Int){
	def x: Int = a;
	def y: Int = b;

	def move() = Point(this.y,this.x);

} 
