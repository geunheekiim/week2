package javaapp1016;

public class MyLottoTest {

	public static void main(String[] args) {
		int [] lotto = new int [6];
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("1-45사이의 숫자를 중복되지 않게 입력하세요.");
		
		int len = lotto.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("(%d/6회):",i+1);
			lotto[i] = sc.nextInt();
			//1부터 45 사이인지 검사해서
			//1부터 45 사이가 아니면 경고 메시지를 출력하고
			//무효화 시키는 코드를 작성
			if(!(lotto[i] >= 1 && lotto[i] <= 45)) {
				System.out.println("범위를 초과했습니다. 다시 입력하세요.");
				i = i-1;
				continue;
			}
			
			//중복 검사
			//두번째 데이터부터 수행
			//첫번째부터 자신의 바로 이전 데이터까지 자신과 비교해서
			//값이 같은 데이터가 있으면 중복이므로 다시 입력하도록 메시지 출력
			
			//0 -> 안함
			//1 -> 0
			//2 -> 0,1
			//3 -> 0,1,2
			//4 -> 0,1,2,3
			//5 -> 0,1,2,3,4
			
			if(i > 0) {
				//중복된 데이터가 있는지 확인하기 위한 변
				boolean flag = false;
				for(int j=0; j<i-1; j=j+1) {
					//데이터가 중복되었으면 flag를 true로 변
					if( lotto[i] == lotto[j] ) {
						flag = true;
						break;
					}
				}
				//데이터가 중복되었다면
				if( flag == true ) {
					System.out.println("중복된 데이터입니다. 다시 입력하세요.");
					i=i-1;
					continue;
				}
			}
			
			
		}
		
		sc.close();
		
		//lotto 배열에 저장된 데이터를 출력
		for(int temp : lotto) {
			System.out.printf("%3d", temp);
		}

	}

}
