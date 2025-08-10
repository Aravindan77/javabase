package sample;

public class Max {
public static void main(String[] args) {
	int num=5921;
	int max=0;
	while(num!=0) {
		int rem=num%10;
		if(max<rem) {
			max=rem;
		}
		num=num/10;
	}
	System.out.println("The max number is "+max);
}
}
