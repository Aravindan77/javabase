package sample;

import java.nio.file.FileSystem;
import java.util.Scanner;

public class Nprime {
	static boolean isPrime(int num) {
		for(int i=2;i<num/2;i++) {
		if (num%i==0) {
			return false;
		}
	}
		return true;
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no");
	int n=sc.nextInt();
	sc.close();
	int num=2;
	while(n!=0) {
	if(isPrime(num)) {
		n--;
		if(n==0) {
			break;
		}
	}
	num++;
	}
	System.out.println(num);
	}
}

