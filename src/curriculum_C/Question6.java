package curriculum_C;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		// PlayerクラスとCPUクラスのインスタンスを生成
		Player player = new Player();
		CPU cpu = new CPU();
		// Zyankenクラスのインスタンスを生成
		Zyanken zyanken = new Zyanken();
		// ジャンケンゲームを開始
		zyanken.playGame(scanner, player, cpu);
		// Scannerを閉じる
		scanner.close();
	}
}




