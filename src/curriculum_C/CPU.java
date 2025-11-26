package curriculum_C;

class CPU {
	private int number;
	
	// ランダムに0から2の数値を生成して返すメソッド
	public int getNumber() {
		number = (int)(Math.random() * 3); // 0から2のランダムな数値を生成
		return number;
	}
}
