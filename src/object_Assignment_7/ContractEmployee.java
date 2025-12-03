package object_Assignment_7;

public final class ContractEmployee extends Employee implements Payable {
	
	private static final int MONTHLY_SALARY = 1000; // 時給
	
	// コンストラクタ
	public ContractEmployee(String name, int hours) {
		// スーパークラスのコンストラクタを呼び出す
		super(name, hours);
	}
	
	@Override
	public int calculateSalary() {
		return MONTHLY_SALARY * getHours();
	}
}
