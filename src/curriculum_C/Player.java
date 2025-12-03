package curriculum_C;

class Player {
	private int number;
	
	// プレイヤーの手を設定するメソッド
	public void setNumber(int number) throws Exception {
		// 0、1、2以外の数値が入力された場合は例外をスロー
		if (number != 0 && number != 1 && number != 2) {
			throw new Exception();
		}
		this.number = number;
	}
	
	// プレイヤーの手を取得するメソッド
	public int getNumber() {
		return number;
	}
}