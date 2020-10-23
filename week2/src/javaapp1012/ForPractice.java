package javaapp1012;

public class ForPractice {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 6-i; j++) {
				System.out.printf("*");
			}
			
			System.out.printf("\n");

		}
		
		System.out.println("=====================");
		
		for(int k=1; k<= 5; k++) {
			if(k<=3) {
				for(int l=1; l<=k; l++) {
					System.out.printf("*");
				}
			}else {
				for(int l=1; l<=6-k; l++) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		
		System.out.println("=====================");
		
		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {

				for (int j = 1; j <= i - 1; j++) {
					System.out.printf(" ");
				}
				for (int k = 1; k <= 4 - i; k++) {
					System.out.printf("*");
				}

			} else {

				for (int j = 1; j <= 5 - i; j++) {
					System.out.printf(" ");
				}
				for (int k = 1; k <= i - 2; k++) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}

	}

}
