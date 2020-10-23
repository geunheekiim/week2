package javaapp1015;

public class TemplateMain {

	public static void main(String[] args) {
		
		Template t = new Template();
		
		//1. Template 클래스의 disp는 고정된 문자열을 출력해주는 메소드
		// 원형은 static void disp()
		// 이 메소드를 호출해보세요.
		Template.disp();
		
		//2. Template 클래스의 oneArg는 문자열을 입력받아서 출력해주는 메소드
		// 원형은 static void oneArg(String)
		// 이 메소드를 호출해서 원하는 메시지를 출력해보세요.
		Template.oneArg("메시지를 출력하는 중입니다.");
		
		//3. Template 클래스의 memberDisp는 정수를 입력받아서 출력해주는 메소드
		// 원형은 void memberDisp(int)
		// 원하는 숫자를 입력해서 숫자를 출력해보세요.
		t.memberDisp(15);
		
		//4. Template 클래스의 returnMemberFunc는 문자열을 입력받아서 출력해주는 메소드
		// 원형은 int returnMemberFunc(int)
		// 원하는 숫자를 입력해서 제곱값을 구하고 출력해보세요.
		int n = t.returnMebberFunc(5);
		System.out.printf("제곱값:%d", n);

	}

}
