//import java.util.Scanner;
//
//class Dictionary {
//	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
//	private static String[] eng = { "love", "baby", "money", "future", "hope" };
//	public static String kor2eng(String word) {
//		int ind = -1;
//		for(int i=0;i<kor.length;i++) {
//			if(word.equals(kor[i])) {
//				ind = i;
//				break;
//			}
//		}
//		
//		if(ind != -1) {
//			return eng[ind];
//		}else {
//			return word + "는 저의 사전에 없습니다.";
//		}
//	}
//}
//
//public class Prac14 {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		while(true) {
//			String search = s.next();
//			
//			if(search.equals("그만")) {
//				break;
//			}
//			
//			System.out.println(Dictionary.kor2eng(search));
//		}
//		
//		
//		s.close();
//	}
//
//}
