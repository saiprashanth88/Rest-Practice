package b6.rest;

public class ArrayOperations {

int size;
int[] array;
int count;
public ArrayOperations(int size) {
	this.size = size;
	this.array = new int[size];
	this.count = 0;
	
}

public void add(int value)
{
	if(count<size) {
		array[count] = value;
		count += 1;
	}
}

public String print() {
	String sol="";
	for(int i = 0;i<size;i++) {
		if(array[i] == 0) {
			break;
		}
		sol = sol + array[i] + " ";
	}
	return sol;
}
}