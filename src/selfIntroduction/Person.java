package selfIntroduction;

class Person{
	  // インスタンスフィールドを定義
	  private static int count = 0; // 人数をカウントする静的フィールド
	  String name; // 名前
	  int age; // 年齢
	  double height; // 身長
	  double weight; // 体重
	  
	  // デフォルトコンストラクタを定義
	  Person() {
		  count++;
	  }

	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  Person(String name, int age, double height, double weight) {
		count++; // 人数をカウントアップ
		this.name = name; // 名前をフィールドにセット
	    this.age = age; // 年齢をフィールドにセット
	    this.height = height; // 身長をフィールドにセット
	    this.weight = weight; // 体重をフィールドにセット
	  }
	  
	  // BMIを計算して返すメソッドを定義
	  double bmi() {
		  return weight / (height * height);
	  }
	  
	  // 自己紹介を表示するメソッドを定義
	  void print() {
		  System.out.println("名前は" + this.name + "です。");
		  System.out.println("年齢は" + this.age + "歳です。");
		  System.out.println("BMIは" + String.format("%.2f", bmi()) + "です。");
		  System.out.println("合計" + count + "人です。");
	  }
	}
