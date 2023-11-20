package constructor;

public class UserDefineConstructor extends Object {
	// Object class {Code object) is the root of the class hierarachy.
	// as soon as we create one that is called user define constructor.
	// By default constructor has class access modifier
	// constructor can be private, then we cann't create referential object or variable from it.

	public static void main(String[] args) {
		UserDefineConstructor udc=new UserDefineConstructor();
		
		
	
	}

	UserDefineConstructor(){
		
	}
	
    protected UserDefineConstructor(String fName){
		
	}
    private UserDefineConstructor(String fName, String lName){
		
	}
    
    
}
