package curriculum_C;

import java.util.Scanner;

public class Zyanken {
	// プレイヤーが勝つまでループ
	void playGame(Scanner scanner, Player player, CPU cpu) {
		// プレイヤーが勝つまでfalseを維持する為の変数
		boolean found = false;
		while (!found) {
			try {
				System.out.print("グー(0)、チョキ(1)、パー(2)のいずれかの数値を入力してください: ");
				player.setNumber(scanner.nextInt()); // プレイヤーの手を入力
				int playerNumber = player.getNumber(); // プレイヤーの手を取得
				int cpuNumber = cpu.getNumber(); // CPUの手を取得
				
				System.out.println("あなたの手: " + changeHand(playerNumber));
				System.out.println("CPUの手: " + changeHand(cpuNumber));
				if (playerNumber == cpuNumber) {
					System.out.println("あいこです。もう一度試してください。");
				} else if ((playerNumber == 0 && cpuNumber == 1) ||
						   (playerNumber == 1 && cpuNumber == 2) ||
						   (playerNumber == 2 && cpuNumber == 0)) {
					System.out.println("あなたの勝ちです！");
					found = true; // プレイヤーが勝ったらループを終了
				} else {
					System.out.println("あなたの負けです。もう一度試してください。");
				}
			} catch (Exception e) {
				System.out.println("無効な入力です。0、1、2のいずれかの数値を入力してください。");
			} finally {
				System.out.println(); // 改行
				scanner.nextLine(); // バッファをクリア
			}
		}
		// Scannerを閉じる
		scanner.close();
	}
	
	public static String changeHand(int number) {
		switch (number) {
			case 0: return "グー";
			case 1: return "チョキ";
			case 2: return "パー";
			default: return "無効な手";
		}
	}
}
