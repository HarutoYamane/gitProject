package curriculum_B;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
 public static void main(String[] args) {
	 
	// Q1
	// score変数を宣言し、75を代入
	int score = 75;
	// score が 60 より大きい場合に "合格です！" と表示する
	if (score > 60) {
		System.out.println("合格です！");
	}
	
	// Q2
	// age変数を宣言し、25を代入
	int age = 25;
	// age が 20 以上 30 以下の場合に "適正年齢です" と表示し、それ以外の場合に "対象外です" と表示する
	if (age >= 20 && age <= 30) {
		System.out.println("適正年齢です");
	}
	else {
		System.out.println("対象外です");
	}
	
	// Q3
	// age変数に18を代入
	age = 18;
	// age が 20 以上なら "成人です"、13 ~ 19なら "ティーンエイジャーです"、12 以下なら "子供です" と表示する
	if (age >= 20) {
		System.out.println("成人です");
	}
	else if (age >= 13 && age <= 19) {
		System.out.println("ティーンエイジャーです");
	}
	else if (age <= 12) {
		System.out.println("子供です");
	}
	
	// Q4
	// 変数 x, y, z にそれぞれ 30, 15, 50 を代入する
	int x,y,z;
	x = 30;
	y = 15;
	z = 50;
	
	// 3つの数値を比較し、一番大きい数値を表示する
	System.out.println(Math.max(x, Math.max(y, z)));
	
	// Q5
	// Scannerクラスのインスタンスを生成
	Scanner scanner = new Scanner(System.in);
	// コマンドライン引数で渡された値を数値に変換し、正数、0、負数を判定して表示する
	try {
		System.out.print("（正・負判定）数値を入力してください: ");
		// num変数に入力値を代入
		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println("正数です");
		}
		else if (num == 0) {
			System.out.println("0です");
		}
		else if (num < 0) {
			System.out.println("負数です");
		}
	// 例外処理
		// nextInt()はInputMismatchExceptionをスローする（NumberFormatExceptionではない）
    } catch (InputMismatchException e) {
    	System.out.println("数字ではありません");
    } catch (Exception e) {
    	System.out.println("エラー発生");
    } finally {
    	// バッファクリア（nextIntは数字のみを読み出しEnter入力が残る為、nextLine()でEnter入力を読み出し、完全に空にする）
		scanner.nextLine(); 
	}
	
	// Q6
	try {
		System.out.print("（偶数・奇数判定）数値を入力してください: ");
		// value変数に入力値を代入
		int value = scanner.nextInt(); // 
		// value が偶数か奇数かを判定して表示する
		if (value % 2 == 0) {
			System.out.println("偶数です");
		}
		else {
			System.out.println("奇数です");
		}
	// 例外処理
	} catch (InputMismatchException e) {
		System.out.println("数字ではありません");
	} catch (Exception e) {
		System.out.println("エラー発生");
	} finally {
		scanner.nextLine(); // バッファクリア
	}
	
	// Q7
	try {
		System.out.print("（評価判定）点数を入力してください: ");
		// score変数に入力値を代入
		score = scanner.nextInt();
		
		// score の値に応じて評価を表示する
		if (score >= 90) {
			System.out.println("優");
		}
		else if (score >= 70) {
			System.out.println("良");
		}
		else if (score >= 50) {
			System.out.println("可");
		}
		else {
			System.out.println("不可");
		}
	// 例外処理
	} catch (InputMismatchException e) {
		System.out.println("数字ではありません");
	} catch (Exception e) {
		System.out.println("エラー発生");
	} finally {
		scanner.nextLine(); // バッファクリア
	}
	
	// Q8
	// 入力値を判定し、入力がnullまたは空文字列の場合にメッセージを表示する
	try {
		System.out.print("文字列を入力してください: ");
		String input = scanner.nextLine();
		if (input == null || input.trim().isEmpty()) {
			System.out.println("入力が無効です");
		}
	} catch (Exception e) {
		System.out.println("エラー発生");
	} 
	
	// Q9
	try {
		System.out.print("曜日を表す数字を入力してください (1-7): ");
		// 入力値をday変数に代入する
		int day = scanner.nextInt();
		// day の値に応じて曜日を表示する
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
		// 例外処理	
	} catch(InputMismatchException e) {
		System.out.println("数字ではありません");
	} catch (Exception e) {
		System.out.println("無効な入力です");
	} finally {
		scanner.nextLine(); // バッファクリア
	}
	
	// Q10
	try {
		System.out.print("月を表す数字を入力してください (1-12): ");
		// 入力値をmonth変数に代入する
		int month = scanner.nextInt();
		// month の値に応じて季節を表示する
		switch(month) {
			case 12,1,2:System.out.println("冬"); break;
			case 3,4,5:System.out.println("春"); break;
			case 6,7,8:System.out.println("夏"); break;
			case 9,10,11:System.out.println("秋"); break;
			default:throw new Exception();
		}
		// 例外処理
	} catch (InputMismatchException e) {
		System.out.println("数字ではありません");
	} catch (Exception e) {
		System.out.println("無効な月です");
	} finally {
		scanner.nextLine(); // バッファクリア
	}
	// Scannerをクローズ（普通はfinallyブロックで閉じるべきだが、ここでは最後に閉じるので警告無視）
	scanner.close();
  }
}
