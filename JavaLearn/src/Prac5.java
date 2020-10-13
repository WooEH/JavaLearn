//import java.util.Scanner;
//
//public class Prac5 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 3개를 입력하시오>>");
//		int n1 = s.nextInt(), n2 = s.nextInt(), n3 = s.nextInt();
//		int flag = 0;
//		
//		int max = n1;
//		if(max < n2) {
//			max = n2;
//			flag = 1;
//		}
//		if(max < n3) {
//			max = n3;
//			flag = 2;
//		}
//		
//		if(flag == 0) {
//			if(max < n2 + n3) {
//				System.out.println("삼각형이 됩니다.");
//			}
//		}else if(flag == 1) {
//			if(max < n1 + n3) {
//				System.out.println("삼각형이 됩니다.");
//			}
//		}else if(flag == 2) {
//			if(max < n1 + n2) {
//				System.out.println("삼각형이 됩니다.");
//			}
//		}
//		s.close();
//	}
//
//}
