package object_Assignment_7;

public final class FullTimeEmployee extends Employee implements Payable {
	
	private static final int MONTHLY_SALARY = 1200; // 時給
	
	// コンストラクタ
	public FullTimeEmployee(String name, int hours) {
		// スーパークラスのコンストラクタを呼び出す
		super(name, hours);
	}
	
	@Override
	public int calculateSalary() {
		return MONTHLY_SALARY * getHours();
	}
}
