package curriculum_C;

class Player {
	private int number;
	
	// プレイヤーの手を設定するメソッド
	public void setNumber(int number) {
		// 0、1、2以外の数値が入力された場合は例外をスロー(int型は整数なので、実質0or1or2かのチェック)
		if (number < 0 || number > 2) {
			throw new IllegalArgumentException();
		}
		this.number = number;
	}
	
	// プレイヤーの手を取得するメソッド
	public int getNumber() {
		return number;
	}
}