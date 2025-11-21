package curriculum_B;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		// Q1
		// 整数型配列arrayを宣言し、初期値を設定
		int[] arrays = {1, 2, 3, 4, 5};
		// 拡張for文を使って配列の要素を1つずつ表示する
		for(int array : arrays) {
			System.out.println(array);
		}
		
		System.out.println(); // 改行
		
		// Q2
		// 文字列型配列numbersを宣言し、初期値を設定
		int[] numbers = {10, 20, 30, 40, 50};
		// 通常のfor文を使って配列の要素を1つずつ表示
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(); // 改行
		
		// Q3
		// 整数型配列numsを宣言し、初期値を設定
		int[] nums = {3, 5, 7, 9, 11};
		int sum = 0;
		// 拡張for文を使って配列の要素の合計を計算し、表示する
		for(int num : nums) {
			sum += num;
		}
		System.out.println(sum);
		
		System.out.println(); // 改行
		
		// Q4
		// 整数型配列valsを宣言し、初期値を設定
		int[] vals = {12, 7, 9, 21, 5, 18};
		// 配列の要素の最大値と最小値を格納する変数を宣言し、初期化
		int max = vals[0];
		int min = vals[0];
		for (int val : vals) {
			// 最大値と最小値を更新する
			if (max < val) {
				max = val;
			}
			if (min > val) {
				min = val;
			}
		}
		// 最大値と最小値を表示する
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
		
		System.out.println(); // 改行
		
		// Q5
		int[] datas = {1, 2, 3, 4, 5};
		for (int i = 0; i < datas.length; i++) {
			datas[i] = datas[i] * 2;
		}
		for (int data : datas) {
			System.out.println(data);
		}
		
		System.out.println(); // 改行
		
		// Q6
		// 整数型配列scoresを宣言し、初期値を設定
		int[] scores = {4, 7, 10, 15, 20};
		// Scannerクラスのインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("数値を入力してください: ");
			// input変数に入力値を代入
			int input = scanner.nextInt();
			for (int i = 0; i < scores.length; i++) {
				if (scores[i] == input) {
					System.out.println("結果：" + input + "は含まれています");
					break;
				}
				else if (i == scores.length - 1) {
					System.out.println("結果：" + input + "は含まれていません");
				}
			}
		  // 例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値ではありません");
		} catch (Exception e) {
			System.out.println("エラー発生");
		} finally {
			// バッファをクリア
			scanner.nextLine();
		}
		
		System.out.println(); // 改行
		
		// Q7
		// 二次元配列arrayを宣言し、初期値を設定
		int[][] array = {{1, 2}, {3, 4}, {5, 6}}; 
		// 拡張for文を使って二次元配列の要素を1つずつ表示する
		for(int[] subArray : array) {
			for(int element : subArray) {
				System.out.println(element);
			}
		}
		
		System.out.println(); // 改行
		
		// Q8
		// 二次元配列numberArraysを宣言し、初期値を設定
		int[][] numberArrays = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		// 合計値を格納する変数を宣言し、初期化
		int result = 0;
		// 二次元配列の要素の合計を計算し、表示する
		for (int[] subArray : numberArrays) {
			for (int element : subArray) {
				result += element;
			}
		}
		System.out.println("合計値: " + result);
		System.out.println(); // 改行
		
		// Q9
		// 二次元配列valArraysを宣言し、初期値を設定
		int[][] valArrays = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		// 配列の要素の最大値と最小値を格納する変数を宣言し、初期化
		int maxVal = valArrays[0][0];
		int minVal = valArrays[0][0];
		for (int[] subArray : valArrays) {
			for (int element : subArray) {
				// 最大値と最小値を更新する
				if (maxVal < element) {
					maxVal = element;
				}
				if (minVal > element) {
					minVal = element;
				}
			}
		}
		System.out.println("最大値: " + maxVal);
		System.out.println("最小値: " + minVal);
		System.out.println(); // 改行
		
		// Q10
		// 三次元配列SuperArraysを宣言し、初期値を設定
		int[][][] SuperArrays = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		// 三次元配列の要素を1つずつ表示する
		for (int[][] array2D : SuperArrays) {
			for (int[] array1D : array2D) {
				for (int element : array1D) {
					System.out.println(element);
				}
			}
		}
		// Scannerクラスのインスタンスをクローズ
		scanner.close();
	}
}
