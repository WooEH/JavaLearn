//class Point {
//	private int x, y;
//	public Point(int x, int y) {
//		this.setX(x);
//		this.setY(y);
//	}
//	
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//}
//
//public class Ex06_01 {
//
//	public static void print(Object obj) {
//		System.out.println(obj.getClass().getName()); //클래스 명
//		System.out.println(obj.hashCode());	//해시코드 출력
//		System.out.println(obj.toString());	//객체를 문자열로 바꿔 출력
//		System.out.println(obj); //객체 출력
//	}
//	
//	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		print(p);
//	}
//}