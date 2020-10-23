package javaapp1016;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
//		//인스턴스 생성
//		//프로그램 내에서 인스턴스를 1개만 만드는 경우
//		//인스턴스 이름을 클래스 이름으로 하는 첫글자를 소문자로 변경
//		//User()는 생성자를 호출하는 것 입니다.
//		User user = new User();
//		user.setNum(1);
//		user.setId("qwertg");
//		user.setPw("1234");
//		user.setNickname("하둘셋어이");
//		user.setName("김근희");
//		
//		User user1 = new User(2, "qwertg2", "5678", "하둘셋어이2", "김근희2");
//		System.out.println(user1);
//		
//		//속성의 값을 가져올 때는 get 메소드를 이용
//		System.out.printf("%s\n", user.getId());
//		//전체를 확인 - toString을 호출해서 출력
//		System.out.println(user);
		
		
		//3개의 User 인스턴스를 저장할 배열을 생성
		User [] users = new User[3];
		
		users[0] = new User(1, "qwertg1", "1234", "하둘셋어이1", "김근희1");
		users[1] = new User(2, "qwertg2", "5678", "하둘셋어이2", "김근희2");
		users[2] = new User();
		User user = new User();
		user.setNum(3);
		user.setId("qwertg3");
		user.setPw("9101");
		user.setNickname("하둘셋어이3");
		user.setName("김근희3");
		users[2] = user;
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]);
		}
		
		for(User temp : users) {
			System.out.println(temp);
		}
		
		Scanner sc = new Scanner(System.in);
		
	}

}