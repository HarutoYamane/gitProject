package curriculum_B;

public class Question5 {
	 // Q1
	// Hello, World!と表示するメソッド
	 void helloWorld() {
		    System.out.println("Hello, World!");
		}
	 
	 // Q2
	 // 引数として受け取った整数を2倍にして返すメソッド
	 int doubleValue(int num) {
		    return num * 2;
		}
	 
	 // Q3
	 // 引数として受け取った整数が偶数かどうかを判定するメソッド（偶数ならtrue、奇数ならfalseを返す）
	 boolean isEven(int num) {
		    return num % 2 == 0;
	 }	 

	public static void main(String[] args) {
		// Question5クラスのインスタンスを生成
		Question5 q5 = new Question5();
		q5.helloWorld();
		
		System.out.println(); // 改行
		
		int num = 10;
		int result = q5.doubleValue(num);
		System.out.println(num + "の2倍は" + result + "です。");
		
		System.out.println(); // 改行
		
		int num1 = 7;
		int num2 = 10;
		System.out.println(num1 + "は" + (q5.isEven(num1) ? "偶数です。" : "奇数です。"));
		System.out.println(num2 + "は" + (q5.isEven(num2) ? "偶数です。" : "奇数です。"));
		
		System.out.println(); // 改行
	}
}
