package curriculum_B;

//int 型変数 x, y, z に 30, 15, 50 を代入
//一番大きい数値を判定して表示

public class Question4 {

	public static void main(String[] args) {
		int x,y,z;
		x = 30;
		y = 15;
		z = 50;
		
		System.out.println(Math.max(x, Math.max(y, z)));
	}

}
