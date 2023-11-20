package operators;

public class JavaOperators {

	public static void main(String[] args) {
		JavaOperators jo=new JavaOperators();
		jo.m1();

	}
	public void m1() {
	int money1=6;
	int money2=7;
	
	//not equal condition
	if (money1!= money2){
	System.out.println("not equal");}
	
	int money3=6;
	int money4=70;
    if (money3 < money2){
	System.out.println("not equal");
	}
    // less than
    if (money4 > money3){
    	System.out.println("less thanl");
    
	}
    //reminder condition
    int reminder=money4%money3; // 70/4=6 divided by 
    System.out.println("reminder"+reminder);
    
    // == condition (Comparison, compare with others (Logical operator))  
    if (money4==money3) {
    	System.out.println("do something");
    	
    // else condition
    	
    }else {
    	System.out.println("do not do something");
    	
    }
    //And Condition
    // both condition must be true.
    int age =25;
    double money=24000.00;
    
    if ((age==25) && (money==2400.00)){
    	
    	System.out.println("do marry ");
    }{
    	System.out.println("do not marry");
    }
    // OR Condition
    if ((age==25) || (money==2400.00)){
    	
    	System.out.println("do marry ");
    }else{
    	System.out.println("do not marry");
    }
	}
}
