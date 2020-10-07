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
//public class Downcasting {
//
//	public static void main(String[] args) {
//		Person p = new Person("이재문");
//		
//		Student s = (Student)p;
//	
//		s.department = "Com";
//		s.grade = "A";
//	}
//
//}

//다운 캐스팅: 슈퍼 클래스의 객체를 서브 클래스 타입으로 변환하기
// 자동 형변환이 안 되기 때문에 명시적 형변환을 해주어야 한다.
//기능의 확장