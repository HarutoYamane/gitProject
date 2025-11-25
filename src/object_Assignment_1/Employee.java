package object_Assignment_1;

public class Employee {
	String name;
	
	void work() {
		System.out.println(name + "は働いています。");
	}
}
	
class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "山田太郎";
		emp.work();
	}
}
