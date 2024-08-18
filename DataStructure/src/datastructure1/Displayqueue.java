//package datastructure1;
//
//public class Displayqueue {
//	static int[] queue;
//	static int front;
//	static int rear;
//
//	static void createQueue(int size) {
//		queue = new int[size];
//		System.out.println("queue has been created with size : " + size);
//	}
//
//	static void enqueue(int ele) {
//		if (rear == queue.length) {
//			System.out.println("Queue is full");
//		} else {
//			queue[rear] = ele;
//			rear++;
//			System.out.println(ele + " has been inserted into queue");
//		}
//
//	}
//
//	static void display() {
//		if (rear == 0) {
//			System.out.println("Queue is empty ....!!");
//		} else {
//			for (int i = front; i < rear; i++) {
//				System.out.println(queue[i] + "");
//			}
//			System.out.println();
//		}
//
//	}
//
//	public static void main(String[] args) {
//		createQueue(6);
//		display();
//		enqueue(10);
//		enqueue(20);
//		enqueue(30);
//		enqueue(40);
//		enqueue(50);
//		display();
//		enqueue(10);
//	}
//
//}


//package datastructure1;
//
//public class Displayqueue {
//	static int[] queue;
//	static int front;
//	static int rear;
//	static void createQueue(int size) {
//		queue = new int[size];
//		System.out.println("queue has been created with size : " + size);
//	}
//	
//	static void display() {
//		if (rear == 0) {
//			System.out.println("Queue is empty ....!!");
//		} else {
//			for (int i = front; i < rear; i++) {
//				System.out.println(queue[i] + "");
//			}
//			System.out.println();
//		}
//
//	}
//	static void enqueue(int ele) {
//		if (rear == queue.length) {
//			System.out.println("Queue is full");
//		} else {
//			queue[rear] = ele;
//			rear++;
//			System.out.println(ele + " has been inserted into queue");
//		}
//
//	}
//	static void dequeue() {
//		if (rear == 0) {
//			System.out.println("Queue is empty ....!!");
//		} else {
//			System.out.println(queue[front]+" got deleted from the queue");
//			for (int i = front; i < rear-1; i++) {
//				queue[i] = queue[i+1];
//			}
//			rear--;
//			queue[rear] = 0;
//		}
//
//	}
//	public static void main(String[] args) {
//		createQueue(6);
//		enqueue(10);
//		enqueue(20);
//		enqueue(30);
//		enqueue(40);
//		enqueue(50);
//		enqueue(60);
//		dequeue();
//		dequeue();
//		display();
//	}
//}


package datastructure1;

import java.util.Scanner;

public class Displayqueue {
	static int[] queue;
	static int front;
	static int rear;
	static void createQueue(int size) {
		queue = new int[size];
		System.out.println("queue has been created with size : " + size);
	}
	
	static void display() {
		if (rear == 0) {
			System.out.println("Queue is empty ....!!");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i] + "");
			}
			System.out.println();
		}

	}
	static void enqueue(int ele) {
		if (rear == queue.length) {
			System.out.println("Queue is full");
		} else {
			queue[rear] = ele;
			rear++;
			System.out.println(ele + " has been inserted into queue");
		}

	}
	static void dequeue() {
		if (rear == 0) {
			System.out.println("Queue is empty ....!!");
		} else {
			System.out.println(queue[front]+" got deleted from the queue");
			for (int i = front; i < rear-1; i++) {
				queue[i] = queue[i+1];
			}
			rear--;
			queue[rear] = 0;
		}
	static boolean isfull() {
			return rear==queue.length;
		}
		static boolean isEmpty() {
			return rear==0;
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		
	}
}
