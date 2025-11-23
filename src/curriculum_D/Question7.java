package curriculum_D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question7 {

	public static void main(String[] args) {		
		// Characterインスタンスの生成
		Character character = new Character();
		// Daemonのステータスをテキストファイルから読み込むメソッドを実行
		character.loadDaemon();
		 // 勝者をwinner変数に代入する
		String winner = character.battle();
		// winner変数の値をバトルログに書き込むメソッドを実行
		character.battleLog(winner);
	}
}

class Character {
	private int player_Hp; //プレイヤーHPフィールド
	private int player_At; //プレイヤーATフィールド
	private int player_Sp; //プレイヤーSPフィールド
	private int daemon_Hp; //DaemonのHPフィールド
	private int daemon_At; //DaemonのATフィールド
	private int daemon_Sp; //DaemonのSPフィールド
	
	// プレイヤーステータスを初期化するコンストラクタ
	public Character() {
		this.player_Hp = (int)(Math.random() * 100) + 1; // 1から100のランダムな数値を生成
		this.player_At = (int)(Math.random() * 50) + 1; // 1から50のランダムな数値を生成
		this.player_Sp = (int)(Math.random() * 30) + 1; // 1から30のランダムな数値を生成
		}
	
	// Daemonのステータスをテキストファイルから読み込むメソッド
	public void loadDaemon() {
		try (BufferedReader br = new BufferedReader(new FileReader("resources/daemon_status.txt"))){
			String line;
			// ファイルから1行ずつ読み込み、表示する
			for (int i = 1; (line = br.readLine()) != null; i++) {
				switch(i) {
					case 2: this.daemon_Hp = Integer.parseInt(line); break; // DaemonのHPを代入
					case 3: this.daemon_At = Integer.parseInt(line); break; // DaemonのATを代入
					case 4: this.daemon_Sp = Integer.parseInt(line); break; // DaemonのSPを代入
				}
			}
		} catch (IOException e) {
			e.printStackTrace(); // IO例外が発生した場合、スタックトレースを表示
		} catch (Exception e) {
			e.printStackTrace(); // その他の例外が発生した場合、スタックトレースを表示
		}
	}
	
	// バトルの結果をテキストファイルに保存するメソッド
	public void battleLog(String winner) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("resources/battle_log.txt", true))) {
		    bw.write("勝者： " + winner); //勝者を書き込む
		    bw.newLine(); // 改行
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	// プレイヤーとDaemonが戦闘し、勝者の文字列を返すメソッド
	public String battle() {
		while (true) {
			// プレイヤーが先攻か判定するboolean型変数
	        boolean playerFirst = decideOrder();
	        if (playerFirst) {
	            if (playerTurn()) return "player";
	            if (daemonTurn()) return "daemon";
	        } else {
	            if (daemonTurn()) return "daemon";
	            if (playerTurn()) return "player";
	        }
	    }
	}
	
	// プレイヤーが先攻か判定するメソッド
	private boolean decideOrder() {
	    if (player_Sp > daemon_Sp) return true;
	    if (player_Sp < daemon_Sp) return false;
	    return Math.random() < 0.5;
	}
	
	// プレイヤーが攻撃するメソッド
	public boolean playerTurn() {
		daemon_Hp = daemon_Hp - player_At;
		return daemon_Hp <= 0; // daemonのHPが0以下ならtrueを返す
	}
	
	// Daemonが攻撃するメソッド
	public boolean daemonTurn() {
		player_Hp = player_Hp - daemon_At;
		return player_Hp <= 0; // playerのHPが0以下ならtrueを返す
	}
}
