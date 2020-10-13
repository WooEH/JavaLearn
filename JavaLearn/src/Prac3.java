//import java.util.Scanner;
//
//public class Prac3 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("금액을 입력하시오>>");
//		int mon = s.nextInt();
//		
//		System.out.println("오만원권 " + mon / 50000 + "매");
//		mon -= mon/50000 *50000;
//		System.out.println("만원권 " + mon / 10000 + "매");
//		mon -= mon/10000 *10000;
//		System.out.println("천원권 " + mon / 1000 + "매");
//		mon -= mon/1000 * 1000;
//		System.out.println("백원 " + mon / 100 + "개");
//		mon -= mon/100 * 100;
//		System.out.println("오십원 " + mon / 50 + "개");
//		mon -= mon/50 * 50;
//		System.out.println("십원 " + mon / 10 + "개");
//		mon -= mon/10 * 10;
//		System.out.println("일원 " + mon % 10 + "개");
//		
//		s.close();
//	}
//
//}
