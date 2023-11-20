package variables;

public class InstanceVariable {
	private String firstName="sabrina";
	String middleName;
	
	//Inside the class
	// outside of any method,constructor or block
	// the scope is the whole class
	// declaration = String firstName;
	// initialization = firstName="sabrina";
	// Initialization is not mandatory
	// Initialization is not Preferable
	//Initialization is default value
	//any access is allowed
	//in c# it is called global variable
	
	public static void main(String[] args) {
	
	InstanceVariable iv = new InstanceVariable();
	iv.sabrina();
	iv.sayed();
	iv.faruq();
	
	}
		
public void sabrina() {		
		
		firstName="sabrina";
		System.out.println(firstName);	
		middleName="A";
	}


public void sayed() {		
	
	firstName="Sayed";
	System.out.println(firstName);
	middleName="B";
	
}

public void faruq() {

	firstName="faruq";
	System.out.println(firstName);
}
	
}
