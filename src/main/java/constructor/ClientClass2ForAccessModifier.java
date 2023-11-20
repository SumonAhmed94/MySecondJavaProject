package constructor;

import accessModifier.AccessModifierExplanation;

public class ClientClass2ForAccessModifier extends AccessModifierExplanation{

// what is the golden rule for access modifier
	//it has access in the same package
	// if you want access to other package but in the same project
	// you must have inheritance relationship( extends key word)


	ClientClass2ForAccessModifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ClientClass2ForAccessModifier ame3 = new ClientClass2ForAccessModifier();
	    ame3.m1();//public 
	    m2(); //protected method
	}

}