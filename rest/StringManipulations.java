package b6.rest;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class StringManipulations {
public String input;
public StringManipulations(String input) {
	this.input = input;
}
public int vowelCount() {
	int ct=0;
	  for(int i=0;i<input.length();i++) {
		  if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E') {
			ct+=1;  
		  }
		  if(input.charAt(i)=='i'||input.charAt(i)=='I'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U') {
			  ct+=1;
		  }
	  }
	  return ct;  
}
public int wordCount(){
	String myString = input;
	return myString.split("\\s").length;
}
public String vowelToUpper() {
	String sol = "";
	for(int i=0;i<input.length();i++) {
		  if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E') {
			  sol+=Character.toUpperCase(input.charAt(i));
		  }
		  if(input.charAt(i)=='i'||input.charAt(i)=='I'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U') {
			  sol+=Character.toUpperCase(input.charAt(i));

		  }
		  else {
			  sol+=input.charAt(i);
		  }
	  }
	return sol;
}

public String indexOfEachVowel()
{
	String index = "";
	for(int i=0;i<input.length();i++) {
		  if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E') {
			  index =index +  input.charAt(i) + " : " + i+" ";
		  }
		  if(input.charAt(i)=='i'||input.charAt(i)=='I'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U') {
			  index = index + input.charAt(i) + " : " + i+ " ";
		  }
		  
	  }
	return index;
}
public String[] stringArray() {
	String myString = input;
	String[] words = myString.split("\\s");
	return words;
}
public String ascii() {
	char ch = input.charAt(0);
	return (int)ch+"";
}
public String Sum() {
	String myString = input;
	String[] words = myString.split("\\s");
	int len = words.length;
	double sum=0;
	for(int i = 0;i<len;i++) {
		sum += Float.parseFloat(words[i]);
	}
	return sum+"";
}
public String getDayOfWeek() {
	String date = input;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate localDate = LocalDate.parse(date, formatter);
    
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    return dayOfWeek.toString();
}
public String getCurrentTime() {
	String timeZone = input;
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
    
    return zonedDateTime.format(formatter);
}
public String[] arrayOfDate() {
    DateTimeFormatter dt = DateTimeFormatter.ISO_LOCAL_DATE;
    String s = dt.toString();
    String[] words =s.split("\\s+|:");

    return words;
}
public 	Character[] stringToArr() {
	String mystr = input;
	Character[] arr = new Character[mystr.length()];
	for(int i=0;i<mystr.length();i++) {
		arr[i] = mystr.charAt(i);
		
	}
	return arr;
	
}
}
