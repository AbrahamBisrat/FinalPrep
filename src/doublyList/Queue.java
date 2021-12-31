package doublyList;

public class Queue {
	// this is bassically a line, first come first served;
	// I will be using the methods addLast() and remove(first);
	DoublyLinkedList que = new DoublyLinkedList();
	
	void enqueue(Girl anotherOne) {
		que.addLast(anotherOne);
	}
	Girl dequeue() {
		Girl temp = que.head.next.pussy;
		que.remove(que.head.next.pussy);
		return temp;
	}
	Girl peek() {
		return que.head.next.pussy;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node temp = que.head;
		int counter = 0;
		while(temp != null) {
			if(temp.pussy != null)
				s+= counter++ + " " + temp.pussy + " \n";
			temp = temp.next;
		}
		return s;
	}
}
