package javaapp1015;

public class PracticeMain {

	public static void main(String[] args) {
		//Practice 인스턴스 2개 만들기
		//static{ }은 1개만 호출되어야 하고 { }은 2번 호출되어야 합니다.
		Practice p1 = new Practice();
		Practice p2 = new Practice();
		
		//Hello Java를 3번 출력
		p1.disp2( 7 );
		
		//Hello Kotlin을 출력
		System.out.println("Hello Kotlin");
		
		//Hello Java를 3번 출력
		p1.disp();
		
		//Practice 클래스에 있는 add 함수를 호출(실행)
		//public void add (int a, int b)
		//인스턴스를 생성합니다.
		Practice prac = new Practice();
		//정수 매개변수 2개를 요구하므로 2개를 대입해서 호출
		prac.add(10, 30);
		//위의 경우는 return 되는 데이터가 없기 때문에 이 결과를 가지고 다른작업을 수행할 수 없습니다.
		
		//Practice 클래스에 있는 addReturn 함수를 호출(실행)
		//public int addReturn (int a, int b)
		int r = prac.addReturn(11, 22);
		System.out.printf("a+b:%d\n", r);
		
		//return 받은 결과가 있으므로 이 결과를 가지고 다음 작업에 이용이 가능합니다.
		r = prac.addReturn(r, 44);
		System.out.printf("결과:%d\n", r);
		
		//static 메소드 호출 - 클래스 이름으로 호출 가능
		Practice.init();
		
		//Math 클래스에스는 0.0에서 1.0 사이의 랜덤한 숫자를 생성해주는 메소드가 존재
		//이 메소드의 원형은 아래와 같습니다.
		//static double random()
		//0.0에서 1.0 사이의 랜덤한 숫자를 1개 출력
		double random = Math.random();
		System.out.printf("%f\n", random);
		
		//Math 클래스에는 실수를 소수 첫째 자리에서 반올림 해주는 아래와 같은 함수가 존재
		//이 함수를 이용하여 6.78을 소수 첫째자리에서 반올림하여 출력
		//static long round(double a)
		long round = Math.round(6.78);
		System.out.printf("%d\n",round);
		
		prac.thisCheck(100);
		
	}

}
