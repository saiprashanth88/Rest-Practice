package b6.rest;

import javax.ws.rs.PathParam;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	
    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "<h1 style= color:red>Welcome to Cybersolve<h1>";
//    }
    public String getIt() {
    	  Assignment1 ob = new Assignment1(0);
        return ob.x+"";
    }
    @GET
    @Path("name/{v}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("v")String Uname) {
    	
    	return "hello "+Uname; 
    }
    @GET
    @Path("add/{x},{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("x")int x, @PathParam("y")int y) {
    	Assignment1 ob = new Assignment1(0);
    	return ob.add(x, y);
    }
    @GET   
    @Path("isPrime/{x}")
    
    public String prime(@PathParam("x")int x) {
    	Assignment1 ob = new Assignment1(x);
    	
    	if (ob.isPrime()){
    		return x + " is Prime Number" ;
    	}
    	else {
    		return x+ " is not a Prime Number";
    	}
    	
    }
    @GET
    @Path("evenodd/{x}")
    public String evenNum(@PathParam("x")int x) {
    	Assignment1 ob = new Assignment1(x);
    	if(ob.even()==1) {
    		return x +" is Even number";
    	}
    	else {
    		return x +" is Odd number";
    	}
    }
    @GET
    @Path("armstrong/{x}")
    public String armstrongNum(@PathParam("x")int x) {
    	Assignment1 ob = new Assignment1(x);
    	if(ob.armstrong()) {
    		return x +" is Armstrong number";
    	}
    	else {
    		return x +" is not Armstrong number";
    	}
//    	int s = ob.armstrong(x);
//    	if (s == x) {
//    		return x +" is Armstrong number";
//    	}
//    	else {
//    		return x +" is not Armstrong number";
//    	}
    }
    @GET
    @Path("rev/{x}")
    public String rev(@PathParam("x")int x) {
    	Assignment1 ob = new Assignment1(x);
    	return "The reverse of " +x+" is "+ ob.reverse();
    }
    @GET
    @Path("factorial/{x}")
    public String factorialNum(@PathParam("x")int x) {
    	Assignment1 ob = new Assignment1(x);
    	long    sol = ob.factorial();
    	return "The factorial of " +x+" is "+ sol;
    }
    @POST
    @Path("user")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getUserData(@FormParam("user_name")String userName) {
    	return "Hello " + userName;
    }
    
    @POST
    @Path("solution")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String arithOperations(@FormParam("operations")String operation, @FormParam("number")int number) {
    	Assignment1 ob = new Assignment1(number);
    	if(operation.equals("evenOdd")) {
    		int val = ob.even();
    		if(val==1) {
        		return number +" is Even number";
        	}
        	else {
        		return number +" is Odd number";
        	}
    	}
    	if(operation.equals("isPrime")) {
        	
        	if (ob.isPrime()){
        		return number + " is Prime Number" ;
        	}
        	else {
        		return number+ " is not a Prime Number";
        	}
    	}
    	if(operation.equals("factorial")) {
    		long    sol = ob.factorial();
        	return "The factorial of " +number+" is "+ sol;
    		
    	}
    	 if(operation.equals("reverse")) {
    		long    sol = ob.reverse();
        	return "The Reverse   of " +number+" is "+ sol;
    		
    	}
    	 if(operation.equals("armstrong")) {
    		boolean s = ob.armstrong();
        	if (s) {
        		return number +" is Armstrong number";
        	}
        	else {
        		return number +" is not Armstrong number";
        	}
    	}
    	else {
    		return "No operation found";
    	}

    	
    }
    
    
    @POST
    @Path("emp")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String empSal(@FormParam("emp_id")int empId, @FormParam("emp_name")String empName, @FormParam("emp_sal")int empSal) {
    	Employee ob1 = new Employee(0,"",0);
    	Employee ob = new Employee(empId, empName, empSal);
    	
    	
    	return ob.annualSalary()+" "+ob.empSalary + " "+ob1.empSalary;
    }
    @GET
    @Path("varargs/{val}")
    public String varargs(@PathParam("val")String value) {
    	
    	Assignment1 ob = new Assignment1(0);
    	int[] arr = ob.stringToIntegerArray(value);
    	return ob.sum(arr)+"";
    }
    
    @POST
    @Path("string")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String stringManipulations(@FormParam("operations")String operation, @FormParam("text")String text) {
    	StringManipulations ob = new StringManipulations(text);
    	if(operation.equals("vowelCount")) {
    		return ob.vowelCount()+"";
    	}
    	else if(operation.equals("wordCount")) {
    		return ob.wordCount()+"";
    	}
    	else if(operation.equals("vowelToUpper")) {
    		return ob.vowelToUpper()+"";
    	}
    	else if(operation.equals("indexOfEachVowel")) {
    		return ob.indexOfEachVowel()+"";
    	}
    	else if(operation.equals("stringArray")) {
    	String[] array= ob.stringArray();
    	String sol = "";
    	int i;
    	for(i=0;i<array.length-1;i++) {
    		sol = sol + array[i] + ", ";
    	}
    	sol = sol + array[i];
    	return sol;
    	}
    	else if(operation.equals("asciiValue")) {
    		return "The ascii value of "+ text.charAt(0)+" : "+ob.ascii();
    	}
    	else if(operation.equals("sumOfN")) {
    		return ob.Sum();
    	}
    	else if(operation.equals("getDay")) {
    		return text + " is "+ob.getDayOfWeek() ;
    		
    	}
    	else if(operation.equals("getCurrentTime")) {
    		return "The Current Time of the Zone " + text + " is " + ob.getCurrentTime();
    	}
    	return "";
    }
    
   
    
    
    @GET
    @Path("arrayOperations/{value}")
    public String addOperation(@PathParam("value")int value) {
    	ArrayOperations ob = new ArrayOperations(value);
    	ob.add(10);
    	ob.add(20);
    	ob.add(2);
    	return ob.print();
    }
    
    @GET
    @Path("arrayString/{value}")
    public String Stringarray(@PathParam("value")int value) {
    	StringArray ob = new StringArray(value);
    	ob.add("hello");
    	ob.add("world");
    	ob.add("Sai");
    	return ob.solution();
    }
    
    @GET
    @Path("parent/{salary}")
    public String myParent(@PathParam("salary")int value) {
    	ParentClass ob = new ChildClass(value);
    	ChildClass ob1 = new ChildClass(value);
    	ParentClass ob2 = new ParentClass(value);
    	
    	return ob.salary+"  " + ob1.annualSalary() +" "+ob2.area() +" "+ ob1.area();
    }
    @GET
    @Path("abstract")
    public String AbstractImplementation() {
    	AbstarctExample ob = new AbstarctExample();
    	return ob.print();
    }
    @GET
    @Path("getdate")
    public String getDate() {
    	Calender ob = new Calender();
    	return ob.getTime();
    }
    @GET
    @Path("getdatewithtime")
    public String getDateWithTime() {
    	Cal ob = new Cal();
    	return ob.getdatewithtime();
    }
    
    @GET
    @Path("getformateddate")
    public String getFormatedDate() {
    	Cal ob = new Cal();
    	return ob.getformateddate();
    }
    @GET
    @Path("gettimezone")
    public String getTimeZone() {
    	Cal ob = new Cal();
    	return ob.gettimezone();
    }
    
    @GET
    @Path("daysleft")
    public String daysleft() {
    	Calender cal = new Calender();
    	return cal.daysLeftInMonth();
    }
    
    
    @GET
    @Path("interface/{value}")
    public String interfaceImplementation(@PathParam("value")int value) {
    	InterfaceImplementation ob = new InterfaceImplementation();
    	return ob.lambdaExample(value)+"";
    	
    }
    @GET
    @Path("exp/{s}")
    public String exp(@PathParam("s")String s) {
    	Exceptions ob = new Exceptions(s);
    	return ob.exp();
    }
    @GET
    @Path("setDate")
    public String setDate() {
    	Calender ob = new Calender();
    	return ob.setDate();
    }
    
    @GET
    @Path("getCommon/{a}/{b}")
    public String getCommon(@PathParam("a")String a,@PathParam("b")String b) {
    	Collection ob = new Collection();
    	
    	
    	return ob.getCommon(a,b);
    }
    @GET
    @Path("sortString/{s}")
    public String sortString(@PathParam("s")String s) {
    	Collection ob = new Collection();
    	return ob.stringSort(s);
    }
    @GET
    @Path("removeDuplicates/{s}")
    public String removeDuplicates(@PathParam("s")String s) {
    	Collection ob = new Collection();
    	ArrayList<Integer> arr = ob.stringToAraryList(s);
    	return ob.removeDuplicates(arr);
    }
    
    @GET
    @Path("empSort")
    
    public String empSort() throws FileNotFoundException {
    	Collection ob = new Collection();
    	return ob.sortEmployees();
    }
    @GET
    @Path("example3")
    
    public String example3() throws FileNotFoundException {
    	Example3 ob = new Example3();
    	return ob.example3();
    }
    @GET
    @Path("example4")
    
    public String example4() throws FileNotFoundException {
    	Example3 ob = new Example3();
    	return ob.lineWordCount();
    }
    @GET
    @Path("example1")
    
    public String example1() throws FileNotFoundException {
    	Example3 ob = new Example3();
    	return ob.example1();
    }
    @GET
    @Path("fileToList")
    public String fileToList() throws FileNotFoundException {
    	Collection ob = new Collection();

    	return ob.linesToList().toString();
    }
    @GET
    @Path("shuffleString/{s}")
    public String shuffleString(@PathParam("s")String s) {
    	Collection ob = new Collection();
    	return ob.shuffling(s);
    }
    @GET
    @Path("setdesc/{s}")
    public String setdesc(@PathParam("s")String s) {
    	Collection ob = new Collection();
    	return ob.setDesc(s);
    }
    @GET
    @Path("genMap")
    public String genMap() {
    	genericMap<Integer, String> ob = new genericMap<>();
    	ob.put(1, "sai");
    	ob.put(2, "Prashanth");
    	ob.put(3, "Pranay");
    	return ob.printMap();
    }
    
}
