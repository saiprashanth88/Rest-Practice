package b6.rest;
import java.util.*;
enum Months{
	JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUNE(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
	int date;

	Months(int date)
	{
		this.date=date;
		
	}
	public int getDays() {
        return date;
    }
}
public class Calender {
public String getTime() {
	Calendar cal=Calendar.getInstance();
	return cal.getTime()+"";
}
public String setDate() {
	Calendar calndr = Calendar.getInstance(); 
	  
    // Displaying the month 
    System.out.println("The Current Month is: "
                       + calndr.get( 
                             Calendar.MONTH)); 

    // Replacing with a new value 
    calndr.set(Calendar.DATE, 32); 

    // Displaying the modified result 
    System.out.println("Altered Month is: "
                       + calndr.get( 
                             Calendar.MONTH)); 
    return calndr.getTime()+"";
}
public String daysLeftInMonth() {
	Calendar cal=Calendar.getInstance();
	int currentDay = cal.get(Calendar.DAY_OF_MONTH);
	 int currentMonth = cal.get(Calendar.MONTH);
	 Months currentEnumMonth = Months.values()[currentMonth];
	 int daysLeft = currentEnumMonth.getDays() - currentDay;
	 return daysLeft+"";
}

}

