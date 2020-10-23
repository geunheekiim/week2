package javaapp1013;

public class Fibonacci {

	public static void main(String[] args) {
		//정수를 입력받아서 정수 번째 피보나치 수열의 값 구하기
		
		//정수 입력받기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("구하고자 하는 수열의 위치는?");
		int n = sc.nextInt();

		//필요한 변수를 생성
		int n1 = 1;			//이전 첫번째 항의 값 저장
		int n2 = 1;			//이전 두번째 항의 값 저장
		int result = 1;		//피보나치 수열의 값 저장
		
		//첫번째와 두번째는 고정이므로 세번째 부터 계산
		for(int i = 3; i<=n; i++) {
			//이전 2개 항의 값을 더하여 result를 구함
			result = n1 + n2;
			//이전 2개 항의 값을 변경
			//이전 2개 항의 값을 자기 뒤의 값으로 변경
			n2 = n1;
			n1 = result;
		}
		//출력 - 10번째: 55, 11번째: 89
		System.out.printf("%d번째 값: %d\n", n, result);
		
		//입력 객체 사용이 종료되었으므로 정리
		sc.close();
		
	}

}
