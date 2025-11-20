package curriculum_B;

//int 型変数 num を用意 コンソール入力でいずれか値を代入し
//num 値が 0 より大きけれ "正数です" と表示
//num 値が 0 なら "0 です" と表示
//num 値が 0 より小さけれ "負数です" と表示

public class Question5 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
		
			if (num > 0) System.out.println("正数です");
			else if (num == 0) System.out.println("0です");
			else if (num < 0) System.out.println("負数です");
	} catch (NumberFormatException e) {
	    System.out.println("数字ではありません");
	} catch (Exception e) {
		System.out.println("エラー発生");
	}
	}
}
