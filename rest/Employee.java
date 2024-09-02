package b6.rest;

public class Employee {

	private int empId;
	private String empName;
	public static int empSalary;
	public Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int annualSalary() {
		return empSalary*12;
	}
}
