package b6.rest;

public class Student {
public int id;
public String name;
public String gender;
public Student(int id, String name, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}

}
