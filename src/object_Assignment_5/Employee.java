package object_Assignment_5;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
	
	protected String id; // 社員ID
	protected String name; // 社員名
	
	// コンストラクタ
	public Employee(String id, String name) {
	this.id = id;
	this.name = name;
	}
	
	// 抽象メソッド: 日給計算
	public abstract int calculateDailyWage(int hoursWorked);
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
	// スーパークラスのコンストラクタを呼び出す
	super(id, name);
	}
	
	@Override
	// 日給計算の実装
	public int calculateDailyWage(int hoursWorked) {
	int hourlyRate = 1250;
	int overtime = Math.max(0, hoursWorked - 8);
	int regularHours = hoursWorked - overtime;
	return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
	}
}

class ContractEmployee extends Employee {
	
	public ContractEmployee(String id, String name) {
	// スーパークラスのコンストラクタを呼び出す
	super(id, name);
	}	
	
	@Override
	// 日給計算の実装
	public int calculateDailyWage(int hoursWorked) {
	int hourlyRate = 1000;
	return hoursWorked * hourlyRate;
	}
}

class Main {
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
