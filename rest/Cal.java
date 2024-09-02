package b6.rest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

 
public class Cal implements Calander{
 
	@Override
	public String getdate() {
		LocalDate today = LocalDate.now();
        return "Todays Date: "+today.toString();
	}
 
	@Override
	public String getdatewithtime() {
	    LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a");
	    return "Todays Date with time : "+now.format(formatter);
	}
	@Override
	public String getformateddate() {
		LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Todays Date after formatting : "+today.format(formatter);
	}
 
	@Override
	public String gettimezone() {
		ZoneId systemZoneId = ZoneId.systemDefault();
        return "Zone : "+systemZoneId.toString(); 
	}
}
