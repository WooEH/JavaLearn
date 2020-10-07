//class Person {
//	String name;
//	String id;
//	
//	public Person(String name) {
//		this.name = name;
//	}
//}
//
//class Student extends Person {
//	String grade;
//	String department;
//	
//	public Student(String name) {
//		super(name);
//	}
//}
//
//public class Upcasting {
//
//	public static void main(String[] args) {
//		Person p;
//		
//		Student s = new Student("이재문");
//		p = s;
//		
//		System.out.println(p.name);
//		p.id = "하이루";
//		System.out.println(p.id);
//		
////		p.grade = "A";
////		p.department = "Com";	이거 오류 뜬다.
//	}
//
//}
//
////서브 클래스의 객체를 슈퍼 클래스 타입으로 변환하는 것.
//// 자동 변환됨. -> 객체 내의 슈퍼 클래스 멤버에만 접근 가능. 원래 지 거는 못 씀.