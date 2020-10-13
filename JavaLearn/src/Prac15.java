//import java.util.Scanner;
//
//class Add {
//	int a, b;
//	public void setValue(int a, int b) {
//		this.a = a; this.b = b;
//	}
//	
//	public int calculate() {
//		return a + b;
//	}
//}
//
//class Sub {
//	int a, b;
//	public void setValue(int a, int b) {
//		this.a = a; this.b = b;
//	}
//	
//	public int calculate() {
//		return a - b;
//	}
//}
//
//class Mul {
//	int a, b;
//	public void setValue(int a, int b) {
//		this.a = a; this.b = b;
//	}
//	
//	public int calculate() {
//		return a * b;
//	}
//}
//
//class Div {
//	int a, b;
//	public void setValue(int a, int b) {
//		this.a = a; this.b = b;
//	}
//	
//	public int calculate() {
//		return a / b;
//	}
//}
//
//public class Prac15 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		int n1 = s.nextInt(), n2 = s.nextInt();
//		char op = s.next().charAt(0);
//		
//		if(op == '+'){
//			Add add = new Add();
//			add.setValue(n1, n2);
//			System.out.println(add.calculate());
//		}else if(op == '-') {
//			Sub sub = new Sub();
//			sub.setValue(n1, n2);
//			System.out.println(sub.calculate());
//		}else if(op == '*') {
//			Mul mul = new Mul();
//			mul.setValue(n1, n2);
//			System.out.println(mul.calculate());
//		}else if(op == '/') {
//			Div div = new Div();
//			div.setValue(n1, n2);
//			System.out.println(div.calculate());
//		}
//		s.close();
//	}
//
//}
