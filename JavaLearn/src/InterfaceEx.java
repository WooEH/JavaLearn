//interface PhoneInterface {
//	public static final int TIMEOUT = 10000;	//int TIMEOUT이라고 써도 됨. 변수가 안되니까
//	public abstract void sendCall();	//public abstract 빼도 같은 기능.
//	void receiveCall();
//	default void printLogo() {	//default 메소드 : 코드 작성되어있음. 인터페이스 구현 클래스에 자동 상속. public만 가능.
//		System.out.println("**Phone**");
//	}
//	
//	//private 메소드 : 여기다가 구현해야함. 인터페이스 내의 다른 함수(getter, setter와 유사)로만 호출 가능.
//	//static 메소드 : public, private 다 가능. 생략시 public
//}
//
//interface MobilePhoneInterface extends PhoneInterface {
//	void sendSMS();
//	void receiveSMS();
//}
//
//interface MP3Interface {
//	void play();
//	void stop();
//}
//
//interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {	//다중 상속 가능
//	void playMP3RingTone();	//이거 implements 하는 클래스는 상속된 추상 메소드랑 이 메소드도 다 오버라이딩 해줘야 함.
//}
//
////implements도 여러개 동시에 할 수 있는데 그러면 각각의 추상 메소드 다 오바라이딩 해줘야함. 그리고 자기 것도 추가할 수 있음.
//class SamsungPhone implements PhoneInterface {
//	public void sendCall() {	//무조건 public 으로 오버라이딩 해야함.
//		System.out.println("전화걸기");
//	}
//	
//	public void receiveCall() {
//		System.out.println("전화받기");
//	}
//	
//	public void flash() {
//		System.out.println("전화기 후레쉬 키기");
//	}
//}
//public class InterfaceEx {
//
//	public static void main(String[] args) {
//		SamsungPhone s = new SamsungPhone();
//		
//		s.printLogo();
//		s.sendCall();
//		s.receiveCall();
//		s.flash();
//
//	}
//
//}
