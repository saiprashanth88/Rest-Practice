package b6.rest;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class files {
	public void file() throws FileNotFoundException {
ArrayList<Student> list = new ArrayList<Student>();
Scanner sc = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\student.txt"));

while(sc.hasNextLine()) {
	String line = sc.nextLine();
	String[] s = line.split(",");
	Student ob = new Student(Integer.parseInt(s[0]),s[1],s[2]);
	list.add(ob);	
	}
	
}
	
	}
