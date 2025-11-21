package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// Q1
		byte byteNum = 0; // byte型変数の宣言し初期値を設定
		short shortNum = 0; // short型変数の宣言し初期値を設定
		int intNum = 0; // int型変数の宣言し初期値を設定
		long longNum = 0L; // long型変数の宣言し初期値を設定
		float floatNum = 0.0f; // float型変数の宣言し初期値を設定
		double doubleNum = 0.0; // double型変数の宣言し初期値を設定
		char letter = '\u0000'; // char型変数の宣言し初期値を設定
		String letters = null; // String型変数の宣言し初期値を設定
		boolean isBoolean = false; // boolean型変数の宣言し初期値を設定
		
		// Q2
		byteNum = 10; // byteNum変数に値を代入
		shortNum = 100; // shortNum変数に値を代入
		intNum = 1000; // intNum変数に値を代入
		longNum = 10000L; // longNum変数に値を代入
		floatNum = 9.5f; // floatNum変数に値を代入
		doubleNum = 10.5; // doubleNum変数に値を代入
		letter = 'a'; // letter変数に値を代入
		letters = "ハロー"; // letters変数に値を代入
		isBoolean = true; // isBoolean変数に値を代入
		
		// Q3		
		System.out.println(longNum + byteNum + intNum + shortNum); // 各変数を使った計算と出力
		System.out.println((int)(floatNum + doubleNum)); // 各変数を使った計算と出力
		System.out.println(letter + " " + letters + " " + isBoolean); // 各変数を使った計算と出力
		System.out.println((int)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum)); // 各変数を使った計算と出力
		System.out.println(byteNum * shortNum * intNum * longNum); // 各変数を使った計算と出力
		System.out.println(10.5 / 100); // double型の計算と出力
		System.out.println(10 - 100); // int型の計算と出力
		
		System.out.println(); // 改行
		
		// Q4
		String name = "山田太郎"; // nameに文字列"山田太郎"を代入
		System.out.println("こんにちは、" + name + "さん！"); // name変数を使って挨拶を出力
		
		System.out.println(); // 改行
		
		// Q5
		int age = 25; // ageにint型整数25を代入
		System.out.println("年齢: " + age + "歳"); // age変数を使って年齢を出力
		
		System.out.println(); // 改行
		
		// Q6
		int num1 = 10; // num1に整数10を代入
		int num2 = 5; // num2に整数5を代入
		int sum = num1 + num2; // num1とnum2の和をsumに代入
		System.out.println(sum); // sum変数を使って和を出力
		
		System.out.println(); // 改行
		
		// Q7
		int score = 80; // scoreに整数80を代入
		score += 20; // scoreに20を加算
		System.out.println("最終スコア: " + score); // score変数を使って最終スコアを出力
		
		System.out.println(); // 改行
		
		// Q8
		double price = 99.99; // priceに小数99.99を代入
		System.out.println("整数価格: " + (int)price); // priceを整数に変換して出力
		
		System.out.println(); // 改行
		
		// Q9
		String numStr = "123"; // numStrに文字列"123"を代入
		System.out.println("変換後の値: " + (Integer.parseInt(numStr) + 10)); // numStrを整数に変換して10を加算し出力
		
		System.out.println(); // 改行
		
		// Q10
		int num = 50; // numに整数50を代入
		System.out.println("得点: " + Integer.toString(num) + "点"); // numを文字列に変換して出力
		
		System.out.println(); // 改行
		
		// Q11
		int a = 10; // aに整数10を代入
		int b = 20; // bに整数20を代入
		System.out.println(a < b); // aがbより小さいかを比較してtrue or falseを出力
		
		System.out.println(); // 改行
		
		// Q12
		int x = 15; // xに整数15を代入
		String result = (x >= 10) ? "OK" : "NG"; // xが10以上なら"OK"、そうでなければ"NG"をresultに代入
		System.out.println(result); // result変数を使って結果を出力
		
		System.out.println(); // 改行
		
		// Q13
		String text = "私はJavaが好きです。Javaは楽しい!"; // textに文字列を代入
		System.out.println(text.replace("Java", "Python")); // text内の"Java"を全て"Python"に置換して出力
	}
}
