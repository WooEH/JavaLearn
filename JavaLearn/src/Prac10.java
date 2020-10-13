//import java.util.Scanner;
//
//public class Prac10 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
//		int arr[] = new int[num];
//		
//		for(int i=0;i<arr.length;i++) {
//			int num1 = (int)(Math.random()*100+1);
//			
//			if(i>=1) {
//				for(int j=0;j<i;j++) {
//					if(arr[j]==num1) {
//						continue;
//					}
//				}
//			}
//			
//			arr[i] = num1;
//		}
//		
//		int cnt = 0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			
//			cnt++;
//			if(cnt % 10==0)
//				System.out.println();
//		}
//		s.close();
//	}
//
//}
