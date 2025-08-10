package DSA; 

class List {
   Cnode head=null;
   Cnode end=null;
   
   void insert(int data) {
	   Cnode newnode=new Cnode(data);
	   if(end==null && head==null) {
		   head=end=newnode;
		   return;
	   }
	   end.next=newnode;
	   end=newnode;
   }
   
   void disp() {
	   Cnode current=head;
	   while(head!=null) {
		   System.out.println(current.data);
		   current=current.next;
	   }
   }
}

public class QueList {
	public static void main(String[] args) {
		List r=new List();
		r.insert(5);
		r.disp();
	}
}
