package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Tester {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("meaw", 12);
		Dog dog2 = new Dog("woof", 10);
		Dog dog3 = new Dog("sfasad", 12);
		Dog dog4 = new Dog("ktchadf", 10);
		Dog dog5 = new Dog("3243dsf", 12);
		Dog dog6 = new Dog("damn woof", 10);
		Dog dog7 = new Dog("jdoi", 12);
		Dog dog8 = new Dog("someAss", 10);
		
		Human h1 = new Human("Abraham Bisrat", 24);
		Human h2 = new Human("Safwan Abbassi", 87);
		
		HashMap<Dog, Human> dogList = new HashMap<Dog, Human>();
		dogList.put(dog1, h1);
		dogList.put(dog1, new Human("Abraham Bisrat", 24));
		dogList.put(dog2, h1);
		
		for(Dog index : dogList.keySet()) {
			System.out.println(index + " : " + dogList.get(index));	
		}
		
		String[] stArray = {"one", "one", "one", "two", "two", "two"};
		HashMap<String, String> stHash = new HashMap<String, String>();
		
		for(String index : stArray) 
			stHash.put(index, index);
		
		String[] temp = new String[stHash.size()];
		int count = 0;
		for(String index : stHash.values()) {
			temp[count++] = index;
			System.out.println(index);
		}
		for(String index : temp){
			System.out.println(index);
		}
	}
}
