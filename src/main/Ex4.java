package main;

public class Ex4 {

	public static void main(String[] args) {
		
		// 정수형 변수는 양수 or 음수 or 0 저장 가능
		byte b = 10; // 1byte
		short s = 10;
		int i = 10; // 4byte
		long l = 10; 
		l = 12345678900l; //long타입에는 식별자를 붙여야함! (끝에 l)
		// int형 범위(숫자범위)를 넘어가면 식별자를 붙여야함
		
		// 서로 다른 타입의 변수끼리 계산 가능
		System.out.println(s + b); // short + byte
		// short + byte -> int + int(컴퓨터가 int로 변환 후 값 계산)
		
		
		
	}

}
