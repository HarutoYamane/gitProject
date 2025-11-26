package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
