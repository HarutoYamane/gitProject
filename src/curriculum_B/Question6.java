package curriculum_B;

//int 型変数 value を用意 コンソール入力でいずれか値を代入し
//value が 偶数 なら "偶数です" と表示
//value が 奇数 なら "奇数です" と表示

public class Question6 {

	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]); // コマンドライン引数を数値に変換
		
		if (value % 2 == 0) System.out.println("偶数です");
		else System.out.println("奇数です");

	}
}
