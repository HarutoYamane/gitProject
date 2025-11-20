package curriculum_A;

//String 型の変数 numStr に "123" を代入
//numStr を int 型に変換し、
//変換後の値: の後ろにnumStr + 10 した結果をコンソールに出力してください。

public class Question9 {

	public static void main(String[] args) {
		String numStr = "123";
		System.out.println("変換後の値: " + (Integer.parseInt(numStr) + 10));
	}
}
