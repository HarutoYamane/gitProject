package object_Assignment_4;

public final class PartTimeEmployee extends Employee {
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
