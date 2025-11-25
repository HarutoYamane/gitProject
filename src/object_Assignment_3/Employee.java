package object_Assignment_3;

public class Employee {
	private String employeeId;
	private String name;
	
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		System.out.println("社員ID:" + emp.getEmployeeId() + ", " + "名前:" + emp.getName());
	}
}
