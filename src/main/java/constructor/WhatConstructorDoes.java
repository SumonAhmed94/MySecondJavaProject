package constructor;

public class WhatConstructorDoes {

	//What constructor does= Constructor instantiate instance properties of a class
	// properties=state or behavior=variables or method
	int hand;
	double hair;
	int leg;

	

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
	
	public static void main(String[] args) {
		WhatConstructorDoes wcd=new WhatConstructorDoes();
		wcd.goToSchool(7);
		eat();
		wcd.marry(24);
	}
}
