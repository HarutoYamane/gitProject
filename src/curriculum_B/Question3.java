package curriculum_B;

//int 型変数 age に 18 を代入
//age が 20 以上なら "成人です" と表示
//age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
//age が 12 以下なら "子供です" と表示

public class Question3 {

	public static void main(String[] args) {
		int age = 18;
		
		if (age >= 20) System.out.println("成人です");
		else if (age >= 13 && age <= 19) System.out.println("ティーンエイジャーです");
		else if (age <= 12) System.out.println("子供です");

	}

}
