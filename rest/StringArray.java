package b6.rest;

public class StringArray {

	String[] array;
	int count;
	int size;
	public StringArray(int size) {
		this.size = size;
		this.array= new String[size];
		this.count = 0;
	}
	public String solution() {
		
	String sol = "";
		for(int i=0;i<count;i++) {
			String mystr = array[i];
			int len = mystr.length();
			sol = sol + mystr.charAt(len-1);
		}
		return sol;
		}
	public void add(String value)
	{
		if(count<size) {
			array[count] = value;
			count += 1;
		}
		else {
			System.out.println("Cannot add more elements");
		}
	}
}
