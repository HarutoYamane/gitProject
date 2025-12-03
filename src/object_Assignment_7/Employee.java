package object_Assignment_7;

public sealed class Employee permits FullTimeEmployee, ContractEmployee {
	
	private String name; // 社員名
	private int hours; // 勤務時間
	
	// コンストラクタ
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	// Nameを取得するメソッド
	public String getName() {
		return name;
	}
	
	// 勤務時間を取得するメソッド
	public int getHours() {
		return hours;
	}
}
