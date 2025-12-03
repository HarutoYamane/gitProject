package object_Assignment_4;

public final class FullTimeEmployee extends Employee {
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
