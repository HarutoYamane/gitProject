package object_Assignment_6;

public final class ContractEmployee extends Employee implements Billable {
	
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
