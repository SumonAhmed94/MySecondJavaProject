package constructor;

import inheritance.InheritanceExplanation;

public class HasARelationshipForInheritance{
// what is has a relationship= public is only has a relationshiop 
	public static void main(String[] args) {
		InheritanceExplanation r=new InheritanceExplanation();
        r.m1();
        HasARelationshipForInheritance hri=new HasARelationshipForInheritance();
        hri.myOwnMethod();
	}
public void myOwnMethod() {
	System.out.println("my own method");
}
	
}
