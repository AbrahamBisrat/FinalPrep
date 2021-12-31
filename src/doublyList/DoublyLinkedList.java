package doublyList;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable<Girl>{
	Node head = new Node();
	Node tail = new Node();
	int size;
	
	public DoublyLinkedList() {
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	void add(Girl newGirl) {// add is next to head, unless explicitly expressed
		Node temp = new Node(newGirl);
		if(head.next == tail) {
			temp.next = tail;
			temp.prev = head;
			head.next = temp;
			tail.prev = temp;
			size++;
			return;
		}
		temp.next = head.next;
		temp.prev = head;
		head.next.prev = temp;
		head.next = temp;
		size++;
	}
	void addFirst(Girl newAss) {
		Node temp = new Node(newAss);
		temp.next = head.next;
		temp.prev = head;
		head.next.prev = temp;
		head.next = temp;
		size++;
	}
	void addLast(Girl newLady) {
		if(newLady.equals(null))
			return;
		Node temp = new Node(newLady);
		temp.next = tail;
		temp.prev = tail.prev;
		tail.prev.next = temp;
		tail.prev = temp;
		size++;
	}
	void remove(Girl bitchLady) {
		Node temp = head;
		while(temp != null) {
			if(temp.next.pussy.name.equals(bitchLady.name) && temp.next.pussy.age == bitchLady.age) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
		}
	}
	Girl getBitch(int bitchIndex) {
		Node temp = head;
		int counter = 0;
		while(temp != null) {
			if(counter == bitchIndex+1) {
				return temp.pussy;
			}
			counter++;
			temp = temp.next;
		}
		return null;
	}
	boolean lookUp(Girl lostGirl) {
		Node temp = head.next;
		System.out.println(temp.pussy);
		int count = 0;
		while(temp.next != null) {
			System.out.println(count++ + " " + temp.pussy);
			if(temp.pussy.name.equals(lostGirl.name) && temp.pussy.age == lostGirl.age) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node temp = head.next;
		int counter = 0;
		while(temp != null) {
			if(temp.pussy!=null) 
				s += counter++ + " " + temp.pussy + "\n";
			temp = temp.next;
		}
		return s;
	}
	
	@Override
	public Iterator<Girl> iterator() {
		// TODO Auto-generated method stub
		return new myFlipper();
	}
	
	class myFlipper implements Iterator<Girl>{
		
		int pos = 0;
		
		@Override
		public boolean hasNext() {
			return pos < size;
		}

		@Override
		public Girl next() {
			return getBitch(pos++);
		}
		
	}
	
}



	
