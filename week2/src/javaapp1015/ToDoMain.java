package javaapp1015;

public class ToDoMain {

	public static void main(String[] args) {
		//Todo 인스턴스 생성
		ToDo todo1 = new ToDo();
		todo1.num = 1;
		todo1.date = "2020-10-16";
		todo1.content = "서점 가기";
		
		ToDo todo2 = new ToDo();
		todo2.num = 2;
		todo2.date = "2020-10-15";
		todo2.content = "종각 7시";
		
		//static 변수에 데이터 저장하기
		ToDo.nickname = "adam";
		
		System.out.printf("%10s%5d%15s%15s\n",ToDo.nickname, todo1.num, todo1.date, todo1.content );
		System.out.printf("%10s%5d%15s%15s\n",ToDo.nickname, todo2.num, todo2.date, todo2.content );

	}

}
