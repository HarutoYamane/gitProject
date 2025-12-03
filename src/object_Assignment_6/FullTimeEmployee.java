package object_Assignment_6;

public final class FullTimeEmployee extends Employee implements Billable {
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
