package javaapp1014;

public class User {
	//properties
	//public 이면 클래스 내부의 메소드에서 사용이 가능하고
	//클래스 외부의 인스턴스를 이용해서도 접근 가능
	public int  num;
	//클래스 내부의 메소드에서만 사용이 가능
	private String name;
	
	//methods
	public void disp() {
		System.out.println(name);
		System.out.println("메소드");
	}
}
