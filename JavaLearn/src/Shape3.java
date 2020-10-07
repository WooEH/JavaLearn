//class Shape {
//	protected String name;
//	public void paint() {
//		draw();
//	}
//	
//	public void draw() {
//		System.out.println(name);
//	}
//}
//public class Shape3 extends Shape{
//	protected String name;
//	
//	public void draw() {	//요거 실행됨. 동적바인딩인듯.
//		name = "Circle";
//		super.name = "Shape";
//		super.draw();
//		System.out.println(name);
//	}
//	
//	public static void main(String[] args) {
//		Shape b = new Shape3();
//		b.paint();
//
//	}
//
//}
