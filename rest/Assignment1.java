package b6.rest;
import java.lang.Math;
public class Assignment1 {

int x = 10;
private int n;

public String add(int x, int y) {
	return x+y+"";
}
public Assignment1(int n) {
	this.n = n;
}
public boolean isPrime() {
	if(n == 0) {
		return false;
	}
	if(n == 1) {
		return false;
	}
	if(n == 2) {
		return true;
	}
	for(int i=2;i<Math.sqrt(n)+1;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
public int even() {
	if(n%2==0) {
		return 1;
	}
	else {
		return 0;
	}
}
public int reverse(){
	int rem =0;
	
	int rev = 0;
	while(n>0) {
		rem = n%10;
		rev = rev*10+rem;
		n = n/10;
		
	}
	return rev;
	
	}
public boolean armstrong() {
	
	int len = 0;
	int temp = n;
	while(temp>0) {
		temp = temp/10;
		len+=1;
	}
	int sum=0;
	int rem = 0;
	while(n>0) {
		rem = n%10;
		sum += Math.pow(rem, len);
		n = n/10;
	}
	if(sum == n) {
		return true;
	}
	else {
		return false;
	}
//	return sum;
	
}
public long  factorial() {
	long MOD = 1000000000+7;
	long fact = 1;
	for(int i = 1;i<=n;i++) {
		fact =  (fact%MOD * i%MOD)%MOD;
	}
	return fact;
}


public int sum(int... val) {
	int sum = 0;
	for(int i:val) {
		sum += i;
	}
	return sum;
}
public int[] stringToIntegerArray(String value) {
	String[] words = value.split(",");
	int[] arr = new int[words.length];
	for(int i=0;i<words.length;i++) {
		arr[i] = Integer.parseInt(words[i]);
	}
	return arr;
	
}
}
