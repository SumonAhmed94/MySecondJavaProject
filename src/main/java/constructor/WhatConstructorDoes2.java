package constructor;

public class WhatConstructorDoes2 {

	//What constructor does= Constructor instantiate instance properties of a class
	// properties=state or behavior=variables or method
	int hand;
	double hair;
	int leg;
	static int heart;

	

	public WhatConstructorDoes2(int hand, double hair, int leg) {
		super();
		this.hand = hand;
		this.hair = hair;
		this.leg = leg;
		System.out.println("how many hands " +hand+" "+hair+" "+leg);
	}
		public static void main(String[] args) {
			WhatConstructorDoes2 faruq=new WhatConstructorDoes2(2, 10000, 2);
			faruq.goToSchool(37);
			faruq.marry(37);
		}
	public void goToSchool(int age) {
      if (age>=5)
      {
    	  System.out.println("go to school");
      } 
      else {
    	  System.out.println("do not go to school");
    	  
      }
	}
      public void marry(int marriageAge) {
          if (marriageAge>=25)
          {
        	  System.out.println("go to marry");
          } 
          else {
        	  System.out.println("do not go to marry");
          }
	}

	public static void eat() {
		System.out.println("i am static, no need constructor");

	}
	
	
}
