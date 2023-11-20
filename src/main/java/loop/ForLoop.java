package loop;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop fl=new ForLoop();
		fl.m1();
		fl.m2();
		fl.m3();

	}
	// increment by 1, start from=0, finished at 10.
    public void m1() {
	int beginning=0;
	int end=10;
	for (beginning = 0; beginning <= end; beginning++) {
		System.out.println(beginning);
		
	}
	System.out.println("#########");
}
    //increment by 10, start from=10, finished at 100.
	
    public void m2() {
    	for (int i = 10; i <=100; i+=10) {
			System.out.println(i);
		}
    	System.out.println("#########");
    }
        //increment by 10, start from=10, finished at 100.
    	
        public void m3() {
        	for (int i = 1; i <=100; i+=10) {
    			System.out.println(i);
    		}
    }
}
