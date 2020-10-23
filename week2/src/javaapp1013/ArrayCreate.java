package javaapp1013;

public class ArrayCreate {

	public static void main(String[] args) {
		/*
		 * 이름(문자열 - String) 배열과 점수(정수 - int) 배열을 생성해서 데이터를 3개씩 삽입 
		 * 이름은 배열을 생설할 때 바로 초기화를 할 것이고 점수는 배열을 생성한 후 값을 대입
		 * 배열의 데이터를 전부 접근해서 출력
		 */
		
		//이름 배열을 생성과 동시에 초기화
		String [] names = {"이천웅","박용택","유강남"};
		double [] height = {182.2, 183.6, 179.5};
		
		//점수 3개를 저장할 수 있는 배열을 만들고 값을 대입
		int [] scores = new int[3];
		scores[0] = 95;
		scores[1] = 88;
		scores[2] = 98;
		
//		System.out.printf("이름은 %s이고 점수는 %d점 입니다.\n", names[0], scores[0]);
//		System.out.printf("이름은 %s이고 점수는 %d점 입니다.\n", names[1], scores[1]);
//		System.out.printf("이름은 %s이고 점수는 %d점 입니다.\n", names[2], scores[2]);
		

		int n = names.length;
		
		for(int i=0; i<n; i++) {
			System.out.printf("이름: %s 키: %.1fcm 점수:%d\n",names[i], height[i], scores[i]);
		}

		
		//빠른 열거
		for(String name:names) {
			System.out.printf("이름: %s\n", name);
		}
		
	}

}
