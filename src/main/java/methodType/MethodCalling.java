package methodType;

public class MethodCalling {

	String fName;
	static String lName="khan";
	
	public static void main(String[] args) {
		MethodCalling mc = new MethodCalling(); //class referential object
		mc.firstName();
		lastName();
		
		
		
		// how do i create class referential variable = MethodCalling mc = new MethodCalling
		// method Calling= is the class name/ is the data type of the variable mc
	    // MC= mc is the name of the variable/ you can name any logical name
		// New = is the key word/ reserve word/ it used for a building constructor
		// new method Calling= constructor for the Methodcalling class
		// what is cross referential Object/variable= Instance method coming inside from static method
		// what is non cross/direct referential Object/variable=
		// What is the difference between variable and method?
		// Variable is the state of an object
		// Method is the behavior of an object/ is define by logic
		
		//Instance method coming inside from static method
		//static method coming inside from static method
		
		//Instance method coming inside from Instance method
		//static method coming inside from Instance method
		
	}
   public void firstName() {
	fName="sabrina";
	System.out.println("instance method "+fName);
}
   public static void lastName() {
		
		System.out.println("static method " +lName);
   }
}
