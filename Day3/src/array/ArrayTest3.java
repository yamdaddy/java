package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] n = { 100, 200, 300 };
		// 이미 알고 있는 경우, 대괄화 쓰고 쭉 쓰면 됨 -> 근데 사이즈를 조절할 수 없다

		System.out.println(n[0]);
		System.out.println(n.length);

		double[] eye = { 1.0, 2.0, 0.4 };
		for (int j = 0; j < eye.length; j++) {
			System.out.println(eye[j]);
		}

		System.out.println("");
		// 간단히 하려면 foreach 를 쓰면 됨 -> 어짜피 배열을 쓰게 되면 0에서 시작해서 1씩 증가하므로,
		// 굳이 설정해줄 필요는 없음
		for (double d : eye) {
			System.out.println(d);
		}

		// 예제 - 친구 3명을 배열에 넣고 프린트
		// 중간에 포멧팅이 필요한 경우... Shift + Ctrl + f

		System.out.println("");

		String[] names = { "Hoon", "Suziee", "Yam" };
		for (String s : names) {
			System.out.println(s);
		}

		int[] number = new int[100];
		number[0] = 100;
		number[54] = 200;
		number[99] = 300;
		System.out.println(number[0]);
		System.out.println(number[number.length - 1]);

		String[] t = new String[100];
		t[0] = "hello";
		t[1] = "java";
		t[t.length - 1] = "spring";

		System.out.println(t.length);

	}

}
