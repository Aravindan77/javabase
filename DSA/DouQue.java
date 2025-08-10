package DSA;


class  Dque{
	int front=-1;
	int rear=-1;
	int capacity=5;
	int size=0;
	
	String arr[]=new String[capacity];
	
	
	boolean isEmpty() {
		return (size==0)? true:false;
	}
	
	boolean isFull()
	{
		return size==capacity;
	}
	
	void add(String data) {
		if(isFull()) {
			System.out.println("Stackm is full");
			return;
		}
		
		if(isEmpty()) {
			front=rear=0;
		}
		else {
			rear=(rear+1)%capacity;
		}
		arr[rear]=data;
		size++;
	}
	
	
	void addFirst(String data) {
		
		if(isFull()) {
			System.out.println("Array is full");
			return;
		}
		
		if(isEmpty()) {
			front=rear=0;
		}
		else {
			front=(front-1+capacity)%capacity;
		}
		arr[front]=data;
		size++;
	}
	
	String pollLast() {
		String data=arr[front];
		if(front==rear) {
			front=rear=-1;
		}
		else {
			rear=(rear-1+capacity)%capacity;
		}
		size--;
		return data;
	}
	
	String poll() {
		String data=arr[rear];
		if(rear==front) {
			rear=front=-1;
		}
		else {
			front=(front+1)%capacity;
		}
		size--;
		return data;
	}
	
	
}

public class DouQue {
	public static void main(String[] args) {
		Dque r=new Dque();
		r.add("1");
		r.add("2");
		r.addFirst("3");
		r.addFirst("4");
		r.add("5");
		r.add("6");
		String data=r.poll();
		System.out.println((data==null)?"UnderFlow":data);
		data=r.poll();
		System.out.println((data==null)?"UnderFlow":data);
		data=r.pollLast();
		System.out.println((data==null)?"UnderFlow":data);
		
	}
}
