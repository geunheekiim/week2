package javaapp1015;

public class MyLottoTest {

	public static void main(String[] args) {
		
		
//		//오름차순 테스트
//		int [] ar = {51,43,2,81,33};
//		for(int i=0; i<ar.length; i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				if(ar[i] > ar[j]) {
//					int temp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = temp;
//				}
//			}
//			System.out.println(ar[i]);
//		}
		
		
		//로또 번호 6개를 저장할 배열을 생성
		//로또 번호는 정수
		int [] lotto = new int [6];
		
		//입력받기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("로또 번호 6개를 순서대로 입력하세요.");
		
		
		//숫자를 6번 입력받기
		for(int i=0; i<6; i=i+1) {
			lotto[i] = sc.nextInt();
			
			//입력받은 값이 1-46 사이인지 확인 후 아닐경우 메시지 출력 및 이전단계로 복원
			if(lotto[i] >= 1 && lotto[i] <=46) {
			} else {
				System.out.println("범위를 초과했습니다. 다시 입력해주세요.");
				i=i-1;
			}
			
			//입력받은 값이 이전에 입력받았던 값과 중복인지 확인 후 중복이면 메시지 출력 및 이전단계로 복원
			for(int j=0; j<i; j=j+1) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복된 값입니다. 다시 입력해주세요");
					i=i-1;
				}
				
				//오름차순으로 정렬
				if(lotto[i] < lotto[j]) {
					int temp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = temp;
				}
			}
		}
		sc.close();

		//lotto 배열에 저장된 데이터를 출력
		System.out.println("당신의 번호는:");
		for(int temp:lotto) {
			System.out.printf("%-3d", temp);
		}
		System.out.println();
		
		
		
		
		

	}

}
