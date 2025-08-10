package sample;
import java.util.Scanner;
import java.util.Arrays;
public class Ssort {
	
	void bubblesort(int arr[]) {
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
	//to find the third largest number
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,2,8,6,4,7};
		Ssort r=new Ssort();
		 r.bubblesort(arr);
		System.out.println(Arrays.toString(arr));
		int b=sc.nextInt();
		System.out.println("Enter index:");
		
}
}
