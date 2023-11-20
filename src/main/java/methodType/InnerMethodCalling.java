package methodType;

public class InnerMethodCalling {

	public static void main(String[] args) {
		// instance coming inside static 
		InnerMethodCalling inc = new InnerMethodCalling();
		inc.m1();

	}
	
	
	public void m1() {
		// instance method coming inside the instance method
		System.out.println("I am m1 method ");
		
		m2();
	
	}
	public void m2(){
		m3();
		System.out.println("I am m2 method ");
		
	}
	public static void m3(){
		System.out.println("I am m3 method ");
		m4();
		
	}
	public static void m4(){
		
		System.out.println("I am m4 method ");
		
	}
}
