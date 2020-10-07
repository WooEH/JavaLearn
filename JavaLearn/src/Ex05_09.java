//interface PhoneInterface {
//	int TIMEOUT = 10000;
//	void sendCall();
//	void receiveCall();
//	default void printLogo() {
//		System.out.println("**Phone**");
//	}
//}
//
//interface MobilePhoneInterface extends PhoneInterface {
//	void sendSMS();
//	void receiveSMS();
//}
//
//interface MP3Interface {
//	public void play();
//	public void stop();
//}
//
//class PDA {
//	public int calculate(int x, int y) {
//		return x + y;
//	}
//}
//
//class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
//	//PhoneInterface 추상 메소드 오버라이딩
//	public void sendCall() {
//		System.out.println("전화 걸기");
//	}
//	public void receiveCall() {
//		System.out.println("전화 받기");
//	}
//	
//	//MobilePhoneInterface overriding section
//	public void sendSMS() {
//		System.out.println("문자 보내기");
//	}
//	public void receiveSMS() {
//		System.out.println("문자 받기");
//	}
//	
//	//MP3Interface overriding section
//	public void play() {
//		System.out.println("음악 틀기");
//	}
//	public void stop() {
//		System.out.println("음악 끄기");
//	}
//	
//	//요 클래스 메소드 추가
//	public void schedule() {
//		System.out.println("일정 관리");
//	}
//	
//	//default method overriding = possible
//	public void printLogo() {
//		System.out.println("**SMARTPHONE**");
//	}
//}
//
//public class Ex05_09 {
//	
//	public static void main(String[] args) {
//		SmartPhone s = new SmartPhone();
//		s.printLogo();
//		s.sendCall();
//		s.receiveCall();
//		s.play();
//		s.calculate(3, 5);
//		s.schedule();
//		s.stop();
//		s.sendSMS();
//		s.receiveSMS();
//		System.out.println(s.TIMEOUT);
//	}
//}
