package javaapp1014;

public class SelectionSort {

	public static void main(String[] args) {
		//정렬할 매열을 생성
		int [] ar = {5, 1, 3, 2, 4};
		//데이터를 출력
		System.out.printf("초기값  :");
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}
		System.out.println();
		
		for(int i=0; i<ar.length-1; i++) {
			//
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.printf("%2dth pass:", i);
			for(int temp : ar) {
				System.out.printf("%5d", temp);
			}
			System.out.println();
		}
		
		//정렬결과 확인
		System.out.printf("정렬결과:");
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}
		System.out.println();
		
		//부등호의 방향을 바꾸면 정렬순서 반대
		for(int i=0; i<ar.length-1; i++) {
			//
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		//정렬결과 확인
		System.out.printf("정렬결과:");
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}

	}

}
