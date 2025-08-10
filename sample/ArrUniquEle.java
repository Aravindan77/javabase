package sample;
import java.util.*;
public class ArrUniquEle {
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
	
	void dist(int arr[]) {
		int arr1[]=new int[arr.length];
		int ind=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				 arr1[ind++]=arr[i];
			}
		}
		arr1[ind++]=arr[arr.length-1];	
		
	}
	public static void main(String[] args) {
		
	
int arr[]= {2,3,4,5,6,7,3,4,2,6,8,11,32,1,2};
ArrUniquEle r=new ArrUniquEle();
  r.bubblesort(arr);
  r.dist(arr);
System.out.println(Arrays.toString(arr));
	}

}
