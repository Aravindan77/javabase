 package DSA;


public class ArrList {
int capacity=5;
int top=-1;
String arr[]=new String[capacity];
		
void push(String data) {
			if(top>=capacity) {
				System.out.println("Stck is OverFlow");
				return;
			}
			arr[++top]=data;
		}
	
String pop() {
	if(top==-1) {
		System.out.println("Stack is UnderFlow");
	}
	return arr[top--];
}

String peek() {
	if(top==-1) {
		System.out.println("UnderFlow");
	}
	return arr[top];
}

int size() {
	return top+1;
}

int capacity() {
	return capacity;
}


}
