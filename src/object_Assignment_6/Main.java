package object_Assignment_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 社員リストをBillable型で作成
		List<Billable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("E001", "佐藤太郎"));
		employees.add(new FullTimeEmployee("E002", "山田二郎"));
		employees.add(new ContractEmployee("E003", "田中花子"));
		employees.add(new ContractEmployee("E004", "井上優子"));
		
		// 各社員の給料を計算して表示(10時間労働で設定)
		employees.forEach(item -> {
			int wage = item.costForDay(10);
			System.out.println("給料:" + wage + "円");
		});
	}
}
