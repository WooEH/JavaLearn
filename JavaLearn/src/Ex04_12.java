//import java.util.Scanner;
//
//class CurrencyConverter {
//	private static double rate;
//	
//	public static double toDollar(double won) {
//		return won/rate;
//	}
//	
//	public static double toKWR(double dollar) {
//		return dollar * rate;
//	}
//	
//	public static void setRate(double r) {
//		rate =r;
//	}
//}
//
//public class Ex04_12 {
//
//	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		System.out.print("환율(1달러)>> ");
//		double rate = s1.nextDouble();
//		
//		CurrencyConverter.setRate(rate);
//		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
//		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
//		s1.close();
//	}
//
//}
