package b6.rest;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection {
public String getCommon(String a, String b) { 
String[] a1 = a.split(",");
String[] b1 = b.split(",");

ArrayList<Integer> arr1 = new ArrayList<Integer>(a1.length);
ArrayList<Integer> arr2 = new ArrayList<Integer>(b1.length);
for(String i:a1) {
	arr1.add(Integer.parseInt(i));
}
for(String i:b1) {
	arr2.add(Integer.parseInt(i));
}
String s="";
for(Integer i:arr1) {
	for(Integer j:arr2) {
		if(i == j) {
			s+=i;
			s+=" ";
			break;
		}
	}
}
return s;
}

public ArrayList<Integer> stringToAraryList(String s) {
	String[] words = s.split(",");
	ArrayList<Integer> arr = new ArrayList<Integer>(words.length);
	for(String i : words) {
		arr.add(Integer.parseInt(i));
	}
	return arr;
}
public String stringSort(String s) {
	char c[] = s.toCharArray();
	Arrays.sort(c);
	String sol = "";
	for(char i:c) {
		sol+=i;
	}
	return sol;
}

public String removeDuplicates(ArrayList<Integer> arr) {
	String s="";
	HashSet<Integer> h = new HashSet<Integer>(arr);
	for(Integer i:h) {
		s+=i;
		s+=" ";
	}
	return s;
}



public String sortEmployees() throws FileNotFoundException {

	Scanner sc = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\employee.txt"));
	ArrayList<EmpCollection> list = new ArrayList<EmpCollection>();
	while(sc.hasNext()) {
		String lines = sc.nextLine();
		String[] words = lines.split(",");
		Integer val = Integer.parseInt(words[1]);
		if(val>25000) {
			EmpCollection ob = new EmpCollection(Integer.parseInt(words[0]),Integer.parseInt(words[1]),words[2],words[3],(int) ((int)val*0.1));
			list.add(ob);
		}
		else if(10000<=val && val<=25000) {
			EmpCollection ob = new EmpCollection(Integer.parseInt(words[0]),Integer.parseInt(words[1]),words[2],words[3],(int) ((int)val*0.15));
			list.add(ob);
		}
		else {
			EmpCollection ob = new EmpCollection(Integer.parseInt(words[0]),Integer.parseInt(words[1]),words[2],words[3],(int) ((int)val*0.2));
			list.add(ob);
		}
	}
	Collections.sort(list);
	
	
	return list.toString();
}

public ArrayList<String> linesToList() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\data.txt"));
    ArrayList<String> arr = new ArrayList<String>();
    while(sc.hasNext()) {
    	String s = sc.nextLine();
    	arr.add(s);
    }

	return arr;
}

public String shuffling(String s) {
	String sol = "";
	ArrayList<String> arr = new ArrayList<>();
	for(int i = 0;i<s.length();i++) {
		arr.add(Character.toString(s.charAt(i)));
		
	}
	 Collections.shuffle(arr);
	 for(String i:arr) {
		 sol+=i;
	 }
	 return sol;
}
public String setDesc(String s) {
	String[] w = s.split(",");
	Set<Integer> set = new HashSet<Integer>();
	for(String i : w) {
		set.add(Integer.parseInt(i));
	}
	ArrayList<Integer> arr = new ArrayList<Integer>(set);
	Collections.sort(arr, Collections.reverseOrder());
	return arr.toString();
	
}

}

