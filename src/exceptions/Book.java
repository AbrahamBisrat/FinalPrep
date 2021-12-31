package exceptions;

public class Book {
	private String name;
	private int iSBN;
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws InvalidNameException{
		System.out.println(name);
		if(name.length() < 8)
			throw new InvalidNameException("Name needs to be more than eight characters");
		this.name = name;
	}
	public void setiSBN(int iSBN) throws InvalidiSBNException{
		if(iSBN < 0 || iSBN == 0)
			throw new InvalidiSBNException("Invalid iSBN number, it has to be non negative");
		this.iSBN = iSBN;
	}
	public Book(String name, int iSBN){
		try {
			setName(name);				
			setiSBN(iSBN);		
		}catch(InvalidNameException ine){
			System.out.println(ine.getMessage());
			killApp();
		}catch(InvalidiSBNException iie){
			System.out.println(iie.getMessage());
			killApp();
		}
	}
	void killApp() {
		System.out.println("Exitting program....");
		System.exit(0);
	}
}
