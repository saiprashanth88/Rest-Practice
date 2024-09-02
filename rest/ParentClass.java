package b6.rest;

public class ParentClass {
	int salary;
	int value = 100;
	private static final double pi = 3.12;
	public double area() {
		return value*pi*2;
	}	
public ParentClass(int salary) {
	this.salary = salary;
}

}
