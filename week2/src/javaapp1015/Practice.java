package javaapp1015;

public class Practice {
	// static 초기화
	static {
		System.out.println("맨 처음 한 번만 호출됩니다.");
	}

	// instance 초기화
	{
		System.out.println("인스턴스를 만들 때마다 호출됩니다.");
	}

	// Hello Java를 3번 출력해주는 메소드
	public void disp() {
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
	}

	// Hello Java를 n번 출력해주는 메소드
	public void disp2(int n) {
		for (int i = 0; i < n; i = i + 1) {
			System.out.println("Hello Java" + "(" + (i + 1) + ")");
		}
	}
	
	//2개의 정수를 받아서 합을 구하고 출력해주는 메소드
	public void add(int a, int b) {
		System.out.printf("a+b:%d\n", a+b);	
	}
	
	//2개의 정수를 받아서 합을 구한 후 리턴해주는 메소드
	public int addReturn(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//static 메소드
	public static void init() {
		System.out.printf("static 메소드는 클래스 이름으로 호출이 가능합니다.\n");
	}
	
	
	public int x = 10; //인스턴스 변수
	
	public void thisCheck (int x) {
		//이름만 기재하면 메소드 안에서 찾아보고 없으면 메소드 바깥에서 찾습니다.
		System.out.printf("local x:%d\n", x);
		//this를 붙이면 안에서는 찾지 않고 메소드 외부에서부터 찾습니다.
		System.out.printf("this x:%d\n", this.x);
	}
	
}
