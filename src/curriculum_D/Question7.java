package curriculum_D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

final class Daemon extends Character {
	
	// Daemonクラスのコンストラクタ
	public Daemon() {
		super(); // スーパークラスのコンストラクタを呼び出す
		loadDaemon(); // Daemonのステータスをテキストファイルから読み込むメソッドを実行
	}
	
	// Daemonのステータスをテキストファイルから読み込むメソッド
	public void loadDaemon() {
		try (BufferedReader br = new BufferedReader(new FileReader("resources/daemon_status.txt"))){
			String line;
			// ファイルから1行ずつ読み込み、表示する
			for (int i = 1; (line = br.readLine()) != null; i++) {
				switch(i) {
					case 2: setHp(Integer.parseInt(line)); break; // DaemonのHPを代入
					case 3: setAt(Integer.parseInt(line)); break; // DaemonのATを代入
					case 4: setSp(Integer.parseInt(line)); break; // DaemonのSPを代入
				}
			}
		} catch (IOException e) {
			e.printStackTrace(); // IO例外が発生した場合、スタックトレースを表示
		} catch (Exception e) {
			e.printStackTrace(); // その他の例外が発生した場合、スタックトレースを表示
		}
	}
	
	// キャラクターが攻撃するメソッドの実装
	@Override
	public boolean attackTurn(Character player) {
		// PlayerのHPをDaemonのAT分減少させる
		player.setHp(player.getHp() - this.getAt());
		// PlayerのHPが0以下ならtrueを返す（勝利）
		return (player.getHp() <= 0);
	}
}

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
