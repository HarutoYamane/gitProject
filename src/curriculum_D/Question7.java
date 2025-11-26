package curriculum_D;

public class Question7 {

	public static void main(String[] args) {		
		// プレイヤーとDaemonのインスタンスをCharacter型で生成
		Character player = new Player();
		Character daemon = new Daemon();
		// battleメソッドを持つBattleクラスのインスタンスを生成
		Battle battle = new Battle();
		 // 勝者をwinner変数に代入する
		battle.battle(player, daemon);
		// winner変数の値をバトルログに書き込むメソッドを実行
		battle.battleLog();
	}
}
