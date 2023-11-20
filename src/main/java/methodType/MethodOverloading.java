package methodType;

public class MethodOverloading {

	public static void main(String[] args) {

		
		MethodOverloading mo =new MethodOverloading();
		mo.lastName();
		mo.lastName("Sabrina");
		mo.lastName("Sabrina", "Khan");
		mo.lastName("Khan", 500000);

	}
	
 
	 // full method
	 // firstName= method name
	 // ()= empty parameter
	 // method signature= method name +() parameter
	 // Method Overloading= we can use same method name with different method signature.
	 // method can have any number or overloaded method
	 // Mix and Match data types is allowed
	 // method overloading is also called static building polymorphism.
	 
 

	 // cann't have same signature/ must be duplicate name
	 //method = firstName
	 // parameter= String fName
	 //method signature = firstName(String fName)
	

 
 public static void lasttName(String lName) {
	 // cann't have same signature/ must be duplicate name
	 //method = lirstName
	 // parameter= String lName
	 //method signature = lastName(String lName)
	
}
 public void lastName() {
	 // full method
	 // firstName= method name
	 // ()= empty parameter
	 // method signature= method name +() parameter
	 System.out.println("empty parameter");
	 String lName= "Khan";
	 System.out.println(lName);
 }
 
 public void lastName(String lName) {
	 // cann't have same signature/ must be duplicate name
	 //method = lastName
	 // parameter= String lName
	 //method signature = lastName(String lName)
	 System.out.println("String one parameter");
	System.out.println("lName");
 }
 public void lastName(String lName, String fName) {
	 // cann't have same signature/ must be duplicate name
	 //method = firstName
	 // parameter= String fName
	 //method signature = lastName(String lName, String fName)
	 System.out.println("String two parameter");
	System.out.println(fName+" "+lName);
 }
 public void lastName(String lName, double balance) {
	 // cann't have same signature/ must be duplicate name
	 //method = firstName
	 // parameter= String fName
	 //method signature = firstName(String lName)
	 System.out.println("mix data type two parameter");
	System.out.println(balance+" "+lName);
 }
}
