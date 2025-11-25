package object_Assignment_4;

sealed abstract class Employee permits FullTimeEmployee, PartTimeEmployee {
	private String name;
	private String employeeId;
	
	// コンストラクタでemployeeIdとnameを初期化
	Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// employeeIdを返すメソッド
	public String getEmployeeId() {
		return employeeId;
	}
	
	// nameを返すメソッド
	public String getName() {
		return name;
	}
	
	// 抽象メソッドcalculateDailyWageを定義
	public abstract int calculateDailyWage(int hoursWorked);
}

final class FullTimeEmployee extends Employee {
	// 時給1200円をHOURLY_RATEに代入
	private static final int HOURLY_RATE = 1200;
	
	FullTimeEmployee(String id, String name) {
		// Employeeクラスのコンストラクタを呼び出し
		super(id, name);
	}
	
	// calculateDailyWageメソッドを実装
	public int calculateDailyWage(int hoursWorked) {
		// hoursWorkedが8時間以上なら、残業代と分けて計算する
		if (hoursWorked > 8) {
			return (int)((8 * HOURLY_RATE) + ((hoursWorked - 8) * (HOURLY_RATE * 1.25)));
		}
		return hoursWorked * HOURLY_RATE;
	}
}

final class PartTimeEmployee extends Employee {
	// 時給1000円をHOURLY_RATEに代入
	private static final int HOURLY_RATE = 1000;
	
	PartTimeEmployee(String id, String name) {
		// Employeeクラスのコンストラクタを呼び出し
		super(id, name);
	}
	
	// calculateDailyWageメソッドを実装
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
		
	}
}

class Main {
	public static void main(String[] args) {
		// FullTimeEmployeeインスタンスをEmployee型として生成
		Employee fullEmployee = new FullTimeEmployee("1", "山田");
		// partTimeEmployeeインスタンスをEmployee型として生成
		Employee partEmployee = new PartTimeEmployee("2", "佐藤");
		System.out.println("正社員の給与： " + fullEmployee.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与： " + partEmployee.calculateDailyWage(9) + "円");
	}
}
