package DSA;

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;
}

class process {
    DoubleNode head;
    DoubleNode tail;

    void insertBegin(int data) {
        DoubleNode newnode = new DoubleNode();
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

    void insertEnd(int data) {
        DoubleNode newnode = new DoubleNode();
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

    void display() {
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
