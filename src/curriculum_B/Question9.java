package curriculum_B;

//int 型変数 day を用意（コンソール入力で1～7 いずれか数値を代入）
//day 値に応じて曜日を表示
//1 → "月曜日"
//2 → "火曜日"
//3 → "水曜日"
//4 → "木曜日"
//5 → "金曜日"
//6 → "土曜日"
//7 → "日曜日"
//それ以外値なら "無効な入力です" と表示
//※Switch文を使用してください
//条件分岐中でも複数値ごとに異なる処理を実行

public class Question9 {

	public static void main(String[] args) {
		try {
		int day = Integer.parseInt(args[0]); // コマンドライン引数を数値に変換
		switch(day) {
		case 1:System.out.println("月曜日"); break;
		case 2:System.out.println("火曜日"); break;
		case 3:System.out.println("水曜日"); break;
		case 4:System.out.println("木曜日"); break;
		case 5:System.out.println("金曜日"); break;
		case 6:System.out.println("土曜日"); break;
		case 7:System.out.println("日曜日"); break;
		default:throw new Exception();
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("引数を1つ指定してください");
		} catch (Exception e) {
			System.out.println("無効な入力です");
		}
	}
}
