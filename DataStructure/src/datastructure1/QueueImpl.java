package datastructure1;

public class QueueImpl {
	static int[] queue;
	static int front;
	static int rear;
	static void createQueue(int size) {
		queue = new int[size];
		System.out.println("queue has been created with size : " + size);
	}
	static void enqueue(int ele) {
		if(rear == queue.length) {
			System.out.println("Queue is full");
		}
		else {
			queue[rear] = ele;
			rear++;
			System.out.println(ele + " has been inserted into queue");
		}
	}
	public static void main(String[] args) {
		createQueue(6);
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		enqueue(10);
	}
}
