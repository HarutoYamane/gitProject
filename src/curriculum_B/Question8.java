package curriculum_B;

// コンソール入力が null また空文字（""）ときに「入力が無効です」と表示する処理を作成してください

public class Question8 {

	public static void main(String[] args) {
		if (args[0].equals("null") || args[0].isEmpty()) { //nullが代入された場合、文字列として"null"のヒープインスタンスが作られる。
			System.out.println("入力が無効です");
		}
	}
}