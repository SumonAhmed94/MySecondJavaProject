package variables;

public class StaticVariable {
	
	public static String  lastName="Khan";
	//static front of the fields
	//out side of any method,constructor or block
		// the scope is the whole class
		//declaration =String lastName ;
		//Initialization=lastName="Khan";
		//Initialization is not mandatory,
	     //Initialization is  prefer
	   //any access modifier is allowed
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		sv.sabrina();
		sv.sayed();
		sv.faruq();
	}

	public void sabrina() {
    System.out.println(lastName);
	}

	public void sayed() {
		System.out.println(lastName);
	}

	public void faruq() {
		lastName="Molla";
		System.out.println(lastName);
	}
}