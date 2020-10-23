package javaapp1012;

public class Star {

	public static void main(String[] args) {
		/*
		 		1 ***** 1-5
		 		2 ***** 1-5
		 		3 ***** 1-5
		 		4 ***** 1-5
		 		5 ***** 1-5
		 		별 5개를 출력하고 줄 바꿈 하는 것을 5번 수행
		 		가로 방향이 안쪽 반복문이 되고
		 		세로 방향이 바깥쪽 반복문이 됩니다.
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.println("========================");
		
		/*
 				1 *		1-1
 				2 **	1-2
 				3 ***	1-3
 				4 ****	1-4
 				5 *****	1-5
 				
 				* 이 하나씩 증가하는 구조
 		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
 				1 *****	1-5
 				2 ****	1-4
 				3 ***	1-3
 				4 **	1-2
 				5 *		1-1
 				
 				* 이 하나씩 감소하는 구조
 		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
 				1 *		1-1
 				2 **	1-2
 				3 ***	1-3
 				4 **	1-2
 				5 *		1-1
 				
 				3번째 줄 까지는 1개씩 늘어나고
 				4번째 줄 부터는 1개씩 줄어드는 구조
 				하나의 패턴이 아닌 경우에는 동일한 패턴이 적용되는 지점까지
 				분할을해서 해결
 		*/
		for (int i = 1; i <= 5; i++) {
			if(i<=3) {
				for(int j=1; j<=i; j++) {
					System.out.printf("*");
				}
			}else {
				for(int j=1; j<=6-i; j++) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
	}

}
