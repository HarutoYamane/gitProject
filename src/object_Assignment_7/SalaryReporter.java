package object_Assignment_7;

import java.util.ArrayList;
import java.util.List;

public class SalaryReporter  {
	public static void main(String[] args) {
		// 社員リストを作成
		List<Payable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("佐藤太郎", 150)); // 正社員を追加
		employees.add(new FullTimeEmployee("山田二郎", 160)); // 正社員を追加
		employees.add(new ContractEmployee("田中花子", 130)); // 契約社員を追加
		employees.add(new ContractEmployee("井上優子", 150)); // 契約社員を追加
		
		// 各社員の給与を表示
		employees.forEach(item -> {
			int Money = item.calculateSalary(); // 給与を計算して格納する
			System.out.println("給料:" + Money + "円");
		});
	}
}
