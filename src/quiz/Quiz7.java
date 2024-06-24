package quiz;

public class Quiz7 {

	public static void main(String[] args) {

		// 다음 코드를 보고 주석에 예상결과를 작성하세요.
		double d = 1.2;
		float f = 0.9f;
		
		int i = (int) d; // 실수형(double) d가 int형으로 형변환 되어 1로 변경
		System.out.println(i);
		int i2 = (int) f; // 실수형(float) f가 int형으로 형변환 되어 0으로 변경
		System.out.println(i2);
		int i3 = (int) d + (int) f; // 형변환된 1과 형변환된 0이 더해져 1이나옴
		System.out.println(i3);
		int i4 = (int) (d + f); // d와 f를 더하면 2.1이기에 2.1이 정수형으로 변환되어 나옴
								// 형변환보다 우선순위가 높은게 () 임 계산 후 형변환 진행됨
		System.out.println(i4);

	}

}
