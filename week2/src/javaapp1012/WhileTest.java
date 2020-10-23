package javaapp1012;

public class WhileTest {
	public static void main(String[] args) {
		
		//image1.png, image3.png, image5.png 출력
		//3번 출력
		//공통된 부분 image .png
		//패턴을 갖는 부분은 1, 3, 5
		
		int i = 1;
		while( i < 4 ) {
			System.out.println("image" + (i*2 -1) + ".png");
			i = i+1;
			
		}
		
		int j = 0;
		while( j < 3 ) {
			System.out.println("image" + (j*2 +1) + ".png");
			j = j+1;
			
		}
		
		int k = 0;
		while( k < 6 ) {
			System.out.println("image" + (k +1) + ".png");
			k = k+2;
		}
	}
}
