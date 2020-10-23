package javaapp1015;

public class Lotto {

	public static void main(String[] args) {
		int [] lotto = new int [6];
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int len = lotto.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("1-45사이의 숫자를 중복되지 않게 입력하세요.");
			lotto[i] = sc.nextInt();
		}
		
		sc.close();
		
		//lotto 배열에 저장된 데이터를 출력
		for(int temp : lotto) {
			System.out.printf("%3d", temp);
		}

	}

}
