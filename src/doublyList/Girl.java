package doublyList;

public class Girl {
	String name;
	int age;
	
	Girl(String name, int age){
		try {
			setBitchName(name);
			setBitchAge(age);
		}catch(BitchNameException bne) {
			System.out.println(bne.getMessage());
			System.exit(0);
		}catch(BitchAgeException bae) {
			System.out.println("Bitch ain't old enough !");
			System.exit(0);
		}finally {
			// System.out.println("bye bye idiot");
		}
		
	}
	void setBitchName(String name) throws BitchNameException{
		if(name.length() < 2) throw new BitchNameException("MOre characters ! " );
		this.name = name;
	}
	void setBitchAge(int x) throws BitchAgeException {
		if(x < 0) throw new BitchAgeException("Bitch ain't old enough! ");
		this.age = x;
	}
	@Override
	public String toString() {
		return " " + name + "  " + age;
	}
}
