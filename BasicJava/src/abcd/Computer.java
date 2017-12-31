package abcd;

/* Constructors :
	Java program can contain more than one i.e. multiple classes. Following example Java program contain two classes: Computer and Laptop. Both classes have their own constructors and a method. In main method we create object of two classes and call their methods.

	Using two classes in Java program*/
	class Computer {
	  Computer() {
	    System.out.println("Constructor of Computer class.");
	  }
	 
	  void computer_method() {
	    System.out.println("Power gone! Shut down your PC soon...");
	  }
	 
	  public static void main(String[] args) {
	    Computer my = new Computer();
	    Laptop your = new Laptop();
	 
	    my.computer_method();
	    your.laptop_method();
	  }
	}
	 
	class Laptop {
	  Laptop() {
	    System.out.println("Constructor of Laptop class.");
	  }
	 
	  void laptop_method() {
	    System.out.println("99% Battery available.");
	  }
	} 

	/*You can also create objects in method of Laptop class. When you compile above code two .class files will be created which are Computer.class and Laptop.
	class, this has the advantage that you can reuse your .class file somewhere in other projects without compiling the code again. In short number of .class files
	created will be equal to number of classes in code. You can create as many classes as you want but writing many classes in a single file is not recommended as it makes code difficult
	to read rather you can create single file for every class. You can also group classes in packages for easily managing your code.
*/