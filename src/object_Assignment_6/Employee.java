package object_Assignment_6;

import java.util.ArrayList;
import java.util.List;

interface Billable {
	// 日ごとのコストを計算するメソッドの宣言
	int costForDay(int hoursWorked);
}

public sealed abstract class Employee permits FullTimeEmployee, ContractEmployee {
	
	private String id; // 社員ID
	private String name; // 社員名
	
	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

final class FullTimeEmployee extends Employee implements Billable {
	public FullTimeEmployee(String id, String name) {
		// スーパークラスのコンストラクタを呼び出す
		super(id, name);
	}
	
	@Override
	// 日ごとのコスト計算の実装
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250; // 時給
		int overtime = Math.max(0, hoursWorked - 8); // 残業時間
		int regularHours = hoursWorked - overtime; // 通常勤務時間
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25); // コスト計算
	}
}

final class ContractEmployee extends Employee implements Billable {
	
	public ContractEmployee(String id, String name) {
		// スーパークラスのコンストラクタを呼び出す
		super(id, name);
	}	
	
	@Override
	// 日ごとのコスト計算の実装
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000; // 時給
		return hoursWorked * hourlyRate; // コスト計算
	}
}

class Main {
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


