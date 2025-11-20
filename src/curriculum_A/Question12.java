package curriculum_A;

//条件演算子（三項演算子）を使用してください。
//int 型の変数 x に 15 を代入 x が 10 以上なら "OK"、そうでなければ "NG" を出力 

public class Question12 {

	public static void main(String[] args) {
		int x = 15;
		String result = (x >= 10) ? "OK" : "NG";
		System.out.println(result);
	}
}
