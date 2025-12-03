package object_Assignment_4;

public class Main {
	public static void main(String[] args) {
		// FullTimeEmployeeインスタンスをEmployee型として生成
		Employee fullEmployee = new FullTimeEmployee("1", "山田");
		// partTimeEmployeeインスタンスをEmployee型として生成
		Employee partEmployee = new PartTimeEmployee("2", "佐藤");
		System.out.println("正社員の給与： " + fullEmployee.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与： " + partEmployee.calculateDailyWage(9) + "円");
	}
}
