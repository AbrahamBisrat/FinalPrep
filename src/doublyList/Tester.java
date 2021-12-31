package doublyList;

public class Tester {
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.add(new Girl("Sarah Miller", 27));
		d.add(new Girl("Fatima ezz", 32));
		d.add(new Girl("Priya nepali", 23));
		d.addLast(new Girl("Pussy Girl ", 25));
		d.add(new Girl("winnie ", 35));
		System.out.println(d);
		Girl someGirl = new Girl("Pussy Girl ", 25);
		System.out.println(d.lookUp(someGirl));
		d.add(new Girl("Sweet pussy ", 19));
		System.out.println(d);
		
		d.remove(new Girl("Sweet pussy ", 19));
		System.out.println(d);
		
		System.out.println("Get bitch method ; " + d.getBitch(2));
		
		System.out.println(" Queue Implementation");
		Queue q = new Queue();
		q.enqueue(someGirl);
		q.enqueue(new Girl("Wild beauty ", 24));
		q.enqueue(new Girl("beauty creature ", 14));
		System.out.println(q);
		
		System.out.println("This is peek() " + q.peek());
		System.out.println(q.dequeue());
		System.out.println(q);
		
		System.out.println("this is bitch implementation : ");
		for(Girl bitch : d) {
			System.out.println(bitch);
		}
		
		Girl awesomeBitch = new Girl("P", 12);
		
		
	}	
}