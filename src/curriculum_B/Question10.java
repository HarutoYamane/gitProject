package curriculum_B;

//int 型変数 month を用意（コンソール入力で1～12 いずれか数値を代入）
//month 値に応じて季節を表示
//12, 1, 2 → "冬"
//3, 4, 5 → "春"
//6, 7, 8 → "夏"
//9, 10, 11 → "秋"
//それ以外値なら "無効な月です" と表示

public class Question10 {

	public static void main(String[] args) {
		try {
		int month = Integer.parseInt(args[0]); // コマンドライン引数を数値に変換
		switch(month) {
		case 12,1,2:System.out.println("冬"); break;
		case 3,4,5:System.out.println("春"); break;
		case 6,7,8:System.out.println("夏"); break;
		case 9,10,11:System.out.println("秋"); break;
		default:throw new Exception();
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("引数を1つ指定してください");
		} catch (Exception e) {
			System.out.println("無効な月です");
		}
	}
}
