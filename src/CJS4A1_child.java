
class Parent{

	private void method1(){
		System.out.println ("Parent's method1()");
	}

	public void method2() {
		System.out.println ("Parent's method2()");
		method1();
	}
}

public class CJS4A1_child extends Parent {
	
	public void method1() {
		System.out.println ("Child's method1()");
	}

		
	public static void main(String args[]) {
		Parent p = new CJS4A1_child();
		p.method2();
	}
}

/* Outcome : 

C. Prints : Parent's method2()
			Parent's method1()
*/