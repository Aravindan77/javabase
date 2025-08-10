package sample;
import java.util.*;
public class ArrBasic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String arr[]= {"arun","kavi","dev"};
	System.out.println(arr);
	String arr2[]=new String[3];
	System.out.println("Enter name");
	for(int i=0;i<=arr.length;i++) {
		arr2[i]=sc.nextLine();
	}
	System.err.println(Arrays.toString(arr2));
}
}
