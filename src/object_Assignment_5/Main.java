package object_Assignment_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 社員リストをEmployee型で作成
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("E001", "佐藤太郎"));
		employees.add(new FullTimeEmployee("E002", "山田二郎"));
		employees.add(new ContractEmployee("E003", "田中花子"));
		employees.add(new ContractEmployee("E004", "井上優子"));
		
		// 各社員の給料を計算して表示(10時間労働で設定)
		employees.forEach(item -> {
			int wage = item.calculateDailyWage(10);
			System.out.println("社員ID:" + item.id + ", 名前:" + item.name + ", 給料:" + wage + "円");
		});
	}
}
