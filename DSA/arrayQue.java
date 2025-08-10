package DSA;
public class arrayQue {
  int capacity=5;
  int front=-1;
  int rear=-1;
  String q[]=new String[capacity];
  
  
  void add(String st) {
	  if(front==-1 && rear==-1) {
		  front=rear=0;
	  }
	  q[rear++]=st;
	  return;
  }
  
  
  
  
}
