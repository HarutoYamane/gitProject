package curriculum_D;

final class Player extends Character {
	
	// Playerクラスのコンストラクタ
	public Player() {
		super(); // スーパークラスのコンストラクタを呼び出す
		setPlayerStatus(); // Playerのステータスをランダムに設定するメソッドを実行
	}
	
	public void setPlayerStatus() {
		setHp((int)(Math.random() * 100) + 1); // 1から100のランダムな数値を生成
		setAt((int)(Math.random() * 50) + 1); // 1から50のランダムな数値を生成
		setSp((int)(Math.random() * 30) + 1); // 1から30のランダムな数値を生成
	}
	
	// キャラクターが攻撃するメソッドの実装
	@Override
	public boolean attackTurn(Character daemon) {
		// DaemonのHPをプレイヤーのAT分減少させる
		daemon.setHp(daemon.getHp() - this.getAt());
		// DaemonのHPが0以下ならtrueを返す（勝利）
		return (daemon.getHp() <= 0);
	}
}