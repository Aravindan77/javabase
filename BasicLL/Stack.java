package BasicLL;

public class Stack {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (top == null) {
            return Integer.MIN_VALUE; // Stack underflow
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    // Peek operation
    int peek() {
        if (top == null) {
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

    // Size operation
    int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
