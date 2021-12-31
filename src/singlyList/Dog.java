package singlyList;

public class Dog {
	String name;
	int age;
	
	Dog(){}
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void dogShit() {
		System.out.println("Bark bark");
	}
	
	@Override
	public String toString(){
		return "Dog Name : " + name + "\t age : " + age;
	}
}
