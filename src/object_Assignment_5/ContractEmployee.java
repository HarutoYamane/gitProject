package object_Assignment_5;

public class ContractEmployee extends Employee {
	
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
