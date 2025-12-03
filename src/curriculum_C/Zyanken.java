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
				int input = Integer.parseInt(scanner.nextLine()); // プレイヤーの手を入力し代入
				player.setNumber(input); // プレイヤーの手を設定
			} catch (NumberFormatException e) {
				System.out.println("数値以外が入力されました。もう一度試してください。");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("0,1,2 以外の数値が入力されました。もう一度試してください。");
				continue;
			} catch (Exception e) {
				System.out.println("想定外の例外が発生しました。");
				break;
			} 
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
			System.out.println(); // 改行
		}
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
