package singlyList;

public class SinglyLinkedList {
	Node head;
	int size = 0;
	
	
	void add(Dog newDog) {
		Node temp = new Node(newDog);
		if(head == null) {
			head = temp;
			size++;
			return;
		}
		temp.next = head;
		head = temp;
		size++;
		return;
	}
	void removeByValue(Dog delDog) {
		Node temp = new Node(delDog);
		if(size == 0 || delDog.equals(null))
			return;
		if(head.dog.equals(delDog)) {
			head = head.next;
			size--;
			return;
		}
		temp.next = head;
		while(temp != null) {
			if(temp.next.dog.equals(delDog)) {
				System.out.println("embrace " + temp.next.dog);
				System.out.println("connect to this instead " + temp.next.next.dog);
				
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
		}
	}
	void addFirst(Dog firstDog) {
		if(firstDog.equals(null))
			return;
		Node temp = new Node(firstDog);
		temp.next = head;
		head = temp;
		size++;
	}
	void addLast(Dog lastDog) {
		Node temp = new Node(lastDog);
		Node addNode = new Node(lastDog);
		if(size == 0 || head == null) {
			head = temp;
			size++;
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = addNode;
		if(temp.next.equals(addNode))
			System.out.println("addNode " + addNode);
		
		size++;
	}
	@Override
	public String toString() {
		String s="";
		Node temp = head;
		int counter = 0;
		while(temp != null) {
			s+=counter++ + " " + temp.dog + "\n";
			temp = temp.next;
		}
		return s;
	}
}





