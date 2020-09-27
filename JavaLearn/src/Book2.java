//import java.util.Scanner;
//
//class Book{
//	String title;
//	String author;
//	
//	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//	}
//}
//
//
//public class Book2 {
//	
//	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		Book[] book = new Book[3];
//		
//		for(int i=0;i<book.length;i++) {
//			System.out.print("제목: ");
//			String book_t = s1.nextLine();
//			
//			System.out.print("저자: ");
//			String book_a = s1.nextLine();
//			
//			book[i] = new Book(book_t, book_a);
//		}
//		
//		for(int i=0;i<book.length;i++) {
//			System.out.println(book[i].title + " " + book[i].author);
//		}
//		
//		s1.close();
//	}
//
//}
