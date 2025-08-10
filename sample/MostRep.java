package sample;
import java.util.Scanner;
public class MostRep {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	int max=0;
	System.out.println("Enter a no:");
	int num=sc.nextInt();
	while(num!=0) {
		int rem=num%10;
		arr[rem]++;
		num=num/10;
	}
	int ind=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
}
}
