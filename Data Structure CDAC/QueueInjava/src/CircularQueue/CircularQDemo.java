package CircularQueue;

public class CircularQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQ c1 = new CircularQ(5);
		c1.EnQueue(10);
		c1.EnQueue(20);
		c1.EnQueue(30);
		c1.display();
		c1.DeQueue();
		c1.display();

	}

}
