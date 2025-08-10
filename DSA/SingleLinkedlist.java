package DSA;

class DoublNode {
    int data;
    DoublNode next;
    DoublNode prev;
}

public class SingleLinkedlist extends DoublNode{
    DoublNode head;
    DoublNode tail;

    public void insertBegin(int data) {
        DoublNode newnode = new DoublNode();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertEnd(int data) {
        DoublNode newnode = new DoublNode();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void insertMiddle(int data) {
        if (head == null) {
            insertBegin(data);
            return;
        }

        int count = 0;
        DoublNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        if (mid == 0) {
            insertBegin(data);
            return;
        }

        temp = head;
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        DoublNode newnode = new DoublNode();
        newnode.data = data;

        newnode.next = temp.next;
        newnode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newnode;
        } else {
            tail = newnode;
        }

        temp.next = newnode;
    }
    void deleteEnd() {
    	DoublNode temp=head;
    	if(head==null) {
    		System.out.println("Empty");
    	}
    	else {
    		tail=tail.prev;
    		head=head.prev=null;
    		tail.next=null;
    	}
    }

    public void display() {
        DoublNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "🐲🐾🐽");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
