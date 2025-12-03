package object_Assignment_5;

public class FullTimeEmployee extends Employee {
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
