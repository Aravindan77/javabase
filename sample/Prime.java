package sample;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=2;
	System.out.println("Enter a no:");
	int a=sc.nextInt();
	for(int i=2;i<=a/2;i++) {
		if(a%i==0) {
			count++;
			System.out.println(i+" Is a factor");
		}
	}
	System.out.println(a+" Is a factor");
	System.out.println(count+" Factor count" );
	if(count==2) {
		System.out.println(a+" is a prime");
}
}
}

