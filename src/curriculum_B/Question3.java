package curriculum_B;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Q1
		// for 文を使って 1 から 10 までの数字を 1 つずつ表示
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println(); // 改行
		
		// Q2
		// for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		for (int i = 2; i <=20; i+=2) {
			System.out.println(i);
		}
		
		System.out.println(); // 改行
		
		// Q3
		// for 文を使って 10 から 1 まで カウントダウンして表示
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println(); // 改行
		
		// Q4
		// sum変数を宣言し、初期値を0に設定
		int sum = 0;
		// for 文を使って 1 から 100 までの合計を計算し、計算結果を表示する
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1から100までの合計は " + sum + " です。");
		System.out.println(); // 改行
		
		// Q5
		// for 文を使って、星印の三角形1つずつ増やして表示する
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(); // 改行
		
		// Q6
		// 変数iを宣言し、初期値を1に設定
		int i = 1;
		// while 文を使って 1 から 10 までの数字を 1 つずつ表示
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(); // 改行
		
		// Q7
		// 変数iに2を代入
		i = 2;
		// while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		while(i <= 20) {
			System.out.println(i);
			i += 2;
		}
		
		System.out.println(); // 改行
		
		// Q8
		// 変数iに10を代入
		i = 10;
		// while 文を使って 10 から 1 まで カウントダウンして表示
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println(); // 改行
		
		// Q9
		// 変数iに1を代入、sumに0を代入
		i = 1;
		sum = 0;
		// while 文を使って 1 から 100 までの合計を計算し、計算結果を表示する
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1から100までの合計は " + sum + " です。");
		System.out.println(); // 改行
		
		// Q10
		// Scannerインスタンスを生成
		Scanner scanner = new java.util.Scanner(System.in);
		// int型変数inputNumberを宣言
		int inputNumber;
		
		try {
			while (true) {
				System.out.print("数値を入力してください（終了するには0を入力）：");
				// inputNumber変数にユーザーからの入力を代入する
				inputNumber = scanner.nextInt();
	
				if (inputNumber == 0) {
					System.out.println("終了しました");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("数字ではありません");
		} catch (Exception e) {
			System.out.println("無効な入力です");
		} finally {
			scanner.nextLine();
		}
		
		System.out.println(); // 改行
		
		// Q11
		// for 文を使って 九九 の表を表示する
		for (i = 1; i <= 9; i++) {
			String formatI = String.format("%02d", i);
			for (int j = 1; j <= 9; j++) {
				// 桁を揃えるために2桁表示にフォーマット
				String formatJ = String.format("%02d", j);
				System.out.print(formatI + " " + "*" + " " + formatJ + " = " + String.format("%02d", i * j));
				if (j < 9) {
					// 各段の間に区切りを入れる
					System.out.print(" || ");
				}
			}
			// 各段の後に改行を入れる
			System.out.println(); 
		}
		
		System.out.println(); // 改行
		
		// Q12
		System.out.print("検索したい商品名を「、」区切りで入力してください：");
		// 全角カンマで分割
		String[] inputItem = scanner.nextLine().split("、"); 
		
		// Randomインスタンスを生成
		Random rand = new Random();
		// テレビとディスプレイの合計在庫数を管理する変数
		int totalStock = 0; 
		
		for(String item : inputItem) {
			// 1から11までのランダムな在庫数
			int stock = rand.nextInt(11) + 1;
			switch(item) {
				case "テレビ", "ディスプレイ":
				    String output = item.equals("テレビ") ? "テレビ" : "ディスプレイ";
					if (totalStock == 0) {
					    System.out.println(output + "の残り台数は" + stock + "台です。");
					    totalStock += stock;
					} else {
						System.out.println(output + "の残り台数は" + (11 - totalStock) + "台です。");
					}
					break;
				case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":
					System.out.println(item + "の残り台数は" + stock + "台です。");
					break;
				default:
					System.out.println("『" + item + "』は指定の商品ではありません");
			}	
		}
		// Scannerをクローズ
		scanner.close();
	}
}
