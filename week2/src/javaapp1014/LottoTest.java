package javaapp1014;

public class LottoTest {

	public static void main(String[] args) {
		//로또 번호 6개를 저장할 배열을 생성
		//로또 번호는 정수
		int [] lotto = new int [6];
		
		//입력받기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("로또 번호 6개를 순서대로 입력하세요.");
		sc.nextLine();
		
		
		
		//lotto 배열에 저장된 데이터를 출력
		for(int temp:lotto) {
			System.out.printf("%5d", lotto[temp]);
		}

		
		
		
		
		

	}

}
