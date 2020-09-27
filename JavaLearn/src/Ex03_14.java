//import java.util.Scanner;
//
//public class Ex03_14 {
//
//	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		
//		int divided;
//		int divisor;
//		
//		System.out.print("나눠지는 수 : ");
//		divided = s1.nextInt();
//		
//		System.out.print("나누는 수 : ");
//		divisor = s1.nextInt();
//		
//		//divisor 에 0 넣으면 오류 발생해 강제 종료됨.
//		//System.out.println(divided/divisor);
//		
//		
//		//이렇게 하면 0으로 나눠도 강제 종료되지 않고 오류 메세지출력됨.
//		try {
//			System.out.println(divided/divisor);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		
//		s1.close();
//	}
//
//}
