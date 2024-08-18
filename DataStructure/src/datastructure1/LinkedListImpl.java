package datastructure1;

public class LinkedListImpl {
	Node head;
	void insert(int ele) {
		Node n = new Node(ele);
		if(head == null) {
			head = n;
			
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
}
