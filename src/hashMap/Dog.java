package hashMap;

import java.util.Objects;

public class Dog {
	String name;
	int age;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Dog)) return false;
		Dog d = (Dog) o;
		return d.name.equals(name) && d.age == age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		return " " + name + "  " + age;
	}
}
