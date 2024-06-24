package main;

public class Ex9 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b; //b변수의 값을 i변수에 복사(=변수에 변수를 대입한다)
		System.out.println(i);
		
		float f = 10.0f;
		double d = f;
		System.out.println(d);
		
		//정수형과 실수형 (float이 더 정밀(실수라)해서 int형이 float형으로 자동 형변환 됨)
		int iNum = 1;
		float fNum = iNum;
		System.out.println(fNum);
		
		//연산 중에 자동 형변환 되는 경우
		//컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환함
		//이 때 iNum이 float형으로 자동으로 형 변환 됨
		System.out.println(iNum + fNum); //2.0
		
	}

}
