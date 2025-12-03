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
