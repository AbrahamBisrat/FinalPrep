package singlyList;

public class Tester {

	public static void main(String[] args) {
		Dog buchi = new Dog("Buchi", 20);
		Dog charley = new Dog("Charley", 12);
		Dog Army = new Dog("Armyyy", 23);
		Dog police = new Dog("Police", 65);
		Dog snitch = new Dog("Snitch", 34);
		
		SinglyLinkedList dogList = new SinglyLinkedList();
		dogList.add(buchi);
		dogList.add(charley);
		dogList.add(Army);
		dogList.add(police);
		dogList.add(snitch);
		System.out.println("size : " + dogList.size);
		
		
		System.out.println(dogList);
		
		
		dogList.removeByValue(Army);
		System.out.println(dogList);
		System.out.println("size : " + dogList.size);
		
		dogList.removeByValue(snitch);
		System.out.println(dogList);
		System.out.println("size : " + dogList.size);
		
		dogList.add(Army);
		System.out.println(dogList);
		System.out.println("size : " + dogList.size);
		
		dogList.addLast(snitch);
		System.out.println("size : " + dogList.size);
		System.out.println(dogList);
		
	}
	
}
