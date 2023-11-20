package accessModifier;


//from the same package
/* public
* protected
* default
*/
public class ClientClass {

	public static void main(String[] args) {
		AccessModifierExplanation ame1= new AccessModifierExplanation("Sabrina", "Khan", "A", "sharna");
		ame1.m1();
		ame1.m2();
		ame1.m3();
		

	}

}
