package b6.rest;

public class ChildClass extends ParentClass {

	int value = 20;
	public double area() {
		return value*4;
	}
	public ChildClass(int salary) {
		super(salary);
	}
	
	public int annualSalary() {
		return salary*12;
	}
	
	

}
