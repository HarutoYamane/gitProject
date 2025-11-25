package object_Assignment_7;

import java.util.ArrayList;
import java.util.List;

interface Payable {
	// 給与を計算するメソッドの宣言
	int calculateSalary();
}

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

final class FullTimeEmployee extends Employee implements Payable {
	
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

final class ContractEmployee extends Employee implements Payable {
	
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

class Main {
	public static void main(String[] args) {
		// 社員リストを作成
		List<Payable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("佐藤太郎", 150)); // 正社員を追加
		employees.add(new FullTimeEmployee("山田二郎", 160)); // 正社員を追加
		employees.add(new ContractEmployee("田中花子", 130)); // 契約社員を追加
		employees.add(new ContractEmployee("井上優子", 150)); // 契約社員を追加
		
		// 各社員の給与を表示
		employees.forEach(item -> {
			int Money = item.calculateSalary(); // 給与を計算して格納する
			System.out.println("給料:" + Money + "円");
		});
	}
}
