//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Ex03_17 {
//
//	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		
//		System.out.println("정수 3개를 입력하세요.");
//		int sum=0, n=0;
//		
//		for(int i=0;i<3;i++) {
//			System.out.print(">>");
//			
//			try {
//				n = s1.nextInt();
//			}
//			catch(InputMismatchException e) {
//				System.out.println("정수를 입력하라고");
//				s1.next();
//				i--;
//				continue;
//			}
//			
//			sum+=n;
//		}
//		
//		System.out.println(sum);
//		s1.close();
//	}
//
//}
