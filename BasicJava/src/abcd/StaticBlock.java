package abcd;

/*static block is executed before main method executes. Below is the simplest example to understand 
 functioning of static block later we see a practical use of static block.*/
 

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Main method is executed.");
	}

	static {
		System.out.println("Static block is executed before main method.");
	}

}
