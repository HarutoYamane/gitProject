package curriculum_B;

//int 型変数 score にコンソール入力で 0 から 100 いずれか数値を代入し
//90 以上なら "優"
//70 以上なら "良"
//50 以上なら "可"
//50 未満なら "不可" を表示

public class Question7 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		
		if (score >= 90) System.out.println("優");
		else if (score >= 70) System.out.println("良");
		else if (score >= 50) System.out.println("可");
		else System.out.println("不可");
	}
}
