package b6.rest;

public class EmpCollection implements Comparable<EmpCollection> {
	int id;
	int salary;
	String name;
	String dept;
	int bonus;
	public EmpCollection(int id, int salary, String name, String dept, int bonus) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
		this.bonus = bonus;
	}
	
	

	@Override
	public String toString() {
		return "EmpCollection [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + ", bonus="
				+ bonus + "]<br>";
	}



	@Override
	public int compareTo(EmpCollection e) {
		// TODO Auto-generated method stub
		return this.bonus-e.bonus;
	}
	
}
