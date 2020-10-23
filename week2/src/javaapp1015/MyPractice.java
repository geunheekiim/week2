package javaapp1015;

import java.util.Scanner;

public class MyPractice {

	public static void main(String[] args) {
		//1.조건문을 활용해서 입력한 수만큼 값을 반복해서 출력할 것
		//2.어떤 수를 3,4,5,8로 나누었을 때 나누어 떨어지는 수에 특정한 동물의 이름 부여
		//3.동시에 나누어 떨어지느 숫자가 있다면 동물이름이 연속으로 나열되도록 할 것
		//4.하단에 출력된 동물의 이름을 count 해서 횟수를 나열하기
		
		//각 동물의 노출 횟수를 저장할 변수들을 생성
		int dCnt = 0;
		int cCnt = 0;
		int tCnt = 0;
		int sCnt = 0;
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		//입력값을 저장할 변수 생성
		int num = sc.nextInt();
		sc.close();
		System.out.println("===================");
		
		//입력한 수만큼 반복하여 출력
		for(int i=1; i<=num; i=i+1) {
			System.out.printf("%2d.", i);
			if( i % 3 == 0 ) {
				System.out.printf("강아지 ");
				dCnt = dCnt + 1;
			}if(i % 4 == 0) {
				System.out.printf("고양이 ");
				cCnt = cCnt+1;
			}if(i % 5 == 0) {
				System.out.printf("거북이 ");
				tCnt = tCnt+1;
			}if(i % 8 == 0) {
				System.out.printf("달팽이 ");
				sCnt = sCnt+1;
			}
			//줄바꿈
			System.out.println();
		}
		
		//각 동물들이 나온 횟수 출력
		System.out.printf("강아지:%2d회\n고양이:%2d회\n거북이:%2d회\n달팽이:%2d회\n", dCnt, cCnt, tCnt, sCnt);
	}

}
