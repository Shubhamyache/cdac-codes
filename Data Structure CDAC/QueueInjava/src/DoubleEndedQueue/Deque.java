package DoubleEndedQueue;

public class Deque {
    private Node front;
    private Node rear;

    public Deque() {
        this.front = null;
        this.rear = null;
    }

    public void enqueueFront(int data) {
        Node newNode = new Node(data);
        newNode.next = front;
        front = newNode;

        if (rear == null) {
            rear = front;
        }
    }

    public void enqueueRear(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeueFront() {
        if (front == null) {
            return -1;
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public int dequeueRear() {
        if (rear == null) {
            return -1;
        }

        int data = rear.data;

        if (front == rear) {
            front = rear = null;
        } else {
            Node current = front;
            while (current.next != rear) {
                current = current.next;
            }

            current.next = null;
            rear = current;
        }

        return data;
    }
    
    public void display() {
    	Node moveNode = front;
    	while(moveNode!=null) {
    		System.out.println(moveNode.data);
    		moveNode = moveNode.next;
    	}
    }

    
}