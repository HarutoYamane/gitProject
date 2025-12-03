package object_Assignment_5;

public abstract class Employee {
	
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
