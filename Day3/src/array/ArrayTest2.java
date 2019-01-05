package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] names = new String[5]; // new 라는 명령어를 통해 만드는거

		names[0] = "김아무개"; // index 는 0부터 시작
		names[1] = "이아무개";
		names[2] = "박아무개";
		names[3] = "정아무개";
		names[4] = "송아무개";

		System.out.println(names.length); // length -> 갯수 세기
		System.out.println(names[names.length - 1]); // 마지막 위치값은 length - 1 이 됨 -> 0부터 시작하기때문에 일어나는 일

		// 예제 - double 로 시력 3개를 만들고, 첫번쌔 시력과 마지막 시력을 프린트

		double[] eyes = new double[3];

		eyes[0] = 1.0;
		eyes[1] = 2.0;
		eyes[2] = 0.8;

		System.out.println(eyes[0]);
		System.out.println(eyes[eyes.length - 1]);

	}

}
