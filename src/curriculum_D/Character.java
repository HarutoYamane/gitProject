package curriculum_D;

sealed abstract class Character permits Player, Daemon {
	private int Hp; // HPフィールド
	private int At; // ATフィールド
	private int Sp; // SPフィールド
	
	// コンストラクタ
	public Character() {}
	
	public int getHp() { return Hp; } // Hpのゲッター
	public int getAt() { return At; } // Atのゲッター
	public int getSp() { return Sp; } // Spのゲッター
	public void setHp(int hp) { this.Hp = hp; } // Hpのセッター
	public void setAt(int at) { this.At = at; } // Atのセッター
	public void setSp(int sp) { this.Sp = sp; } // Spのセッター
	
	// キャラクターが攻撃する抽象メソッド
	public abstract boolean attackTurn(Character character);
}
