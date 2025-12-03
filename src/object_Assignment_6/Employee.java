package object_Assignment_6;

public sealed abstract class Employee permits FullTimeEmployee, ContractEmployee {
	
	private String id; // 社員ID
	private String name; // 社員名
	
	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
