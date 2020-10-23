package javaapp1014;

public class StudentMain {

	public static void main(String[] args) {
		//Student 클래스의 인스턴스를 2개 생성
		Student student1 = new Student();
		Student student2 = new Student();
		
		//student1과 student2의 데이터 설정
		student1.num = 1;
		student1.name = "아담";
		student1.phone = "010";
		
		student2.num = 2;
		student2.name = "루시아";
		student2.phone = "011";
		
		//인스턴스 변수는 각각 소유하기 때문에
		//하나의 변경이 다른 하나에 영향을 주지 않습니다.
		System.out.printf("st1의 이름:%s\n", student1.name);
		System.out.printf("st2의 이름:%s\n", student2.name);
		
		//static이 붙은 변수는 클래스 이름으로도 접근이 가능
		Student.school = "아담 소프트";
		System.out.printf("st1의 학교:%s\n", student1.school);
		System.out.printf("st1의 학교:%s\n", student2.school);
		
		//student2의 학교는 변경하지 않았지만 static변수이기 때문에 다른 인스턴스의 값도 일괄적으로 변경되어 보입니다.
		student1.school = "트라이글로스픽쳐스";
		System.out.printf("st1의 학교:%s\n", student1.school);
		System.out.printf("st1의 학교:%s\n", student2.school);
		

	}

}
