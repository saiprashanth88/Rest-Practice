package b6.rest;

public class Exceptions {
String s;
public Exceptions(String s)
{
	this.s = s;
}
	public String exp() {
		
		 
		try {
			int k = Integer.parseInt(s);
//			System.out.println("Integer is Given");
			return "Integer";
		}
		catch(Exception e1)
		{

            try{
                Float k = Float.parseFloat(s);
//                System.out.println("Float is Given");
                return "Float";
            }
            catch(Exception e){
                try{
                    Double k = Double.parseDouble(s);
//                    System.out.println("Double is Given");
                    return "Double";
                }
            
                catch(Exception e2){
                    
                
//System.out.println("String is Given");
                	return "String";
		}
            }


	
    }
	}
}
