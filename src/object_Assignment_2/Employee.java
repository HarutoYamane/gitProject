package object_Assignment_2;

public class Employee {
	String emoployeeId;
	String name;
	
	void showInfo() {
		System.out.println("社員ID:" + emoployeeId + ", " + "名前:" + name);
	}
}

class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.emoployeeId = "E001";
		emp.name = "佐藤太郎";
		emp.showInfo();
	}
}
