package javaapp1012;

public class DoWhileTest {

	public static void main(String[] args) {
		//1부터 100까지 더하기를 do ~ while로 해결
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i = i+1;
		}while(i < 101);
		
		System.out.println("sum: "+sum);
		
		//1부터 100까지 홀수의 합을 do~while로 해결
		
		int j = 1;
		int sum2 = 0;
		do {
			sum2 = sum2 + (j*2 -1);
			j = j + 1;
		}while(j < 51);
		
		System.out.println("sum2: "+sum2);
	}

}
