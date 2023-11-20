package inheritance;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Parent p=new Parent();//not recommended
		// p is only parent method eligible access 
		// by default child can acquired everything from parents other than private.
		// by default parent cann't access from child properties.
		// Reason for Ambiguity - Because it's one way relationship.
		//p.car();
		p.house();
		p.tv();
		p.gold();
		Child c=new Child(); // allow but not prefer
		c.computer();
		c.phone();
		//c.car();
		
		Parent dynamicploymorphism = new Child();
		dynamicploymorphism.car(); // preferred
		//WebDriver driver = ChromeDriver();
		
	}

	public void computer () {
		System.out.println("i am child computer method");
	}
	
	private void phone() {
		System.out.println("i am child phone method");
	}
	public void car() {
		System.out.println("i am over ridden car method(pink car)");
	}
}
