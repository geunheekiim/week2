package javaapp1012;

public class ForTest {

	public static void main(String[] args) {
		//1부터 100까지 더한 합을 for를 이용해서 출력
		int sum = 0;
		for(int i=0; i<101; i=i+1) {
			sum = sum + i;
		}
		System.out.println("sum: " + sum);
		
		//1부터 100까지 홀수를 더한 합을 for를 이용해서 출력
		int sum2 = 0;
		for(int j=0; j<101; j=j+2) {
			sum2 = sum2 + j;
		}
		System.out.println("sum2: " + sum2);

	}

}
