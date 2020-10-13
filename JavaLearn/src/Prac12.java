//import java.util.Scanner;
//
//class Day {
//	private String work;
//	public void set(String work) { this.work = work; }
//	public String get() { return work; }
//	public void show() {
//		if(work == null) {
//			System.out.println("없습니다.");
//		}else {
//			System.out.println(work + "입니다.");
//		}
//	}
//}
//
//public class Prac12 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		Day d[] = new Day[30];
//		
//		while(true) {
//			int menu = s.nextInt();
//			int day;
//			
//			if(menu==1) {
//				day = s.nextInt();
//				d[day].set(s.next());
//			}else if(menu == 2) {
//				day = s.nextInt();
//				d[day].show();
//			}else if(menu==3) {
//				break;
//			}
//		}
//		s.close();
//	}
//
//}
