package curriculum_B;

// int 型変数 age に 25 を代入
// age が 20 以上 30 以下なら "適正年齢です" と表示
// それ以外場合 "対象外です" と表示

public class Question2 {

	public static void main(String[] args) {
		int age = 25;
		if (age >= 20 && age <= 30) System.out.println("適正年齢です");
		else System.out.println("対象外です");

	}

}
