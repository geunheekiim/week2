package javaapp1016;

//String msg 변수와 disp 메소드를 소유한 Base 클래스
class Base{
	public String msg = "상위 클래스의 msg";
	
	public Base(String msg) {
		this.msg = msg;
	}
	
	public void disp() {
		System.out.println("상위 클래스의 메소드");
	}
}

//Base 클래스를 상속받은 Derive 클래스
class Derive extends Base {
	public String msg = "하위 클래스의 msg";
	
	public Derive() {
		super( "" );
	}
	
	public void print() {
		System.out.println("하위클래스의 msg: " + msg);
		System.out.println("상위 클래스의 msg: " + super.msg);
	}
	
	@Override
	//상위 클래스에 disp()라는 메소드가 있지만 하위 클래스에서 다시 만드는 것을 Overriding 이라고 합니다.
	public void disp() {
		System.out.println("하위 클래스의 메소드");
	}
}

public class InheritanceMain {

	public static void main(String[] args) {
		//Derive 클래스의 객체를 생성
		Derive derive = new Derive();
		//Derive 클래스에는 disp가 없지만
		//Base 클래스를 상속받으므로 disp 사용 가능
		derive.disp();
		derive.print();
		
		//상위클래스 타입의 참조형 변수에는 하위클래스 타입의 인스턴스를 대입할 수 있습니다.
//		Base base = derive;
//		
//		//하위클래스 타입의 변수에 상위클래스 타입의 인스턴스는 대입할 수 없습니다.
//		//강제 형 변환을 이용해야만 합니다.
//		derive = base;	// 따라서 이 구문은 에러
//		
//		derive = (Derive)base;	//형 변환하여 사용은 가능하나 발생하는 오류에 대한 책임은 프로그래머에게 있습니다.
//		
//		//이 구문은 문법적인 에러는 없지만 실행하면 예외가 발생합니다.
//		//위의 base에는 Derive가 들어있는데
//		//Base가 들어있습니다.
//		//위의 경우처럼 원래는 하위 클래스 타입이었는데 상위에 저장했다가 되돌리는 것은 가능하지만
//		//원래 상위 타입인 경우는 실행 도중 예외가 발생합니다.
//		//ClassCastException
//		derive = (Derive)(new Base(""));
		
		//다형성
		Base b = new Base("");		//상위클래스의 인스턴스를 대입
		b.disp();					//상위클래스의 메소드가 호출됨
		
		b = new Derive();			//하위클래스의 인스턴스를 대입
		b.disp();					//하위클래스의 메소드가 호출됨
		
	}

}
