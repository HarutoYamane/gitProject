package curriculum_D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

enum Winner {
	PLAYER,
	DAEMON
}

class Battle {
	
	private Winner winner; // 勝者フィールド(enum Winner型)
	
	// バトルの結果をテキストファイルに保存するメソッド
	public void battleLog() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("resources/battle_log.txt", true))) {
		    bw.write("勝者： " + this.winner); // 勝者を書き込む
		    bw.newLine(); // 改行
		    this.winner = null; // winnerフィールドを初期化
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	// プレイヤーとDaemonが戦闘し、勝者の文字列を返すメソッド
	public void battle(Character player, Character daemon) {
		while (true) {
			// プレイヤーが先攻か判定するboolean型変数
	        boolean playerFirst = decideOrder(player.getSp(), daemon.getSp());
	        if (playerFirst) {
	            if (player.attackTurn(daemon)) {
	            	this.winner = Winner.PLAYER;
	            	break;
	            }
	            if (daemon.attackTurn(player)) {
	            	this.winner = Winner.DAEMON;
	            	break;
	            }
	        } else {
	            if (daemon.attackTurn(player)) {
	            	this.winner = Winner.DAEMON;
	            	break;
	            }
	            if (player.attackTurn(daemon)) {
	            	this.winner = Winner.PLAYER;
	            	break;
	            }
	        }
	    }
	}
	
	// プレイヤーが先攻か判定するメソッド
	private boolean decideOrder(int player_Sp, int daemon_Sp) {
	    if (player_Sp > daemon_Sp) return true;
	    if (player_Sp < daemon_Sp) return false;
	    return Math.random() < 0.5;
	}
}
