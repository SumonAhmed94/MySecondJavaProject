package methodType;

public class VoidAndReturnMethod {
 // how many types of method in java
	/*
	 * based on return types there are two types of method
	 * 1. void
	 * 2. return
	 * return method has re use ability
	 *  * based on specifier types there are two types of method
	 * 1. static
	 * 2. instance
	 * *  * based on loading/parameter types there are two types of method
	 * 1. over loading method
	 * 2. Semantic method
	 */
	
	static int totalMoney=20;
	
	public static void main(String[] args) {
		VoidAndReturnMethod vrm= new VoidAndReturnMethod();
		int totalSpent=vrm.sayed();
		int changeBack=totalMoney-totalSpent;
		System.out.println("Sayed change back "+changeBack);
		
		// sabrina 
		vrm.sabrina();
		
		
	}

	

	public int sayed() {
		
		 int apple=5;
	     int milk=6;
	     int totalSpent=apple+milk;
		return totalSpent;

	}
	
	
	
	
	
	public void sabrina() {
	     int apple=9;
	     int milk=8;
	     int totalSpent=apple+milk;
	     int changeBack=totalMoney-totalSpent;
	  System.out.println("Sabrin's change back "+changeBack);
			
		}

}