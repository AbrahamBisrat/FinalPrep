package singlyList;

public class Node {
	Node next;
	Dog dog;
	Node(Dog dog){
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "Node : " + dog;
	}
}
