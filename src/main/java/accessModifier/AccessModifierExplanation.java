package accessModifier;

public class AccessModifierExplanation {
	// what is access modifier
	public String fName;
	protected String lname;
	String middleName;
	private String nickName;
	
	protected AccessModifierExplanation()	{}

	public AccessModifierExplanation(String fName, String lname, String middleName, String nickName) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.middleName = middleName;
		this.nickName = nickName;
		System.out.println(fName+" "+lname+" "+middleName+" "+nickName);
	}

	public static void main(String[] args) {
		AccessModifierExplanation ame =new AccessModifierExplanation("Sabrina", "Khan", "A", "sharna");
		ame.m1();
		m2();
		ame.m3();
		ame.m4();
	}

	public void m1() {
		System.out.println("m1--> public method");
	}

	static protected void m2() {
		System.out.println("m2--> protected method");
	}

	void m3() {
		System.out.println("m3--> default method");
	}
//private method only has access to the same class
	//without getter and setter
	private void m4() {
		System.out.println("m4--> private method");
	}
}