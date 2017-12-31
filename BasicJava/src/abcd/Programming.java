package abcd;

/*Java constructor: A constructor in Java is a method which is used to initialize objects. Constructor method of a class has the same name as that of the class, 
 they are called or invoked when an object of a class is created and can't be called explicitly. Attributes of an object may or may not be available while creating 
 objects, if no attribute is available then default constructor is called, some of the attributes may be known initially. It is optional to write 
constructor method(s) in a class but due to their utility they are used.*/

public class Programming {
	
		  //constructor method
		  Programming() {
		    System.out.println("Constructor method called.");
		  }
		 
		  public static void main(String[] args) {
		    Programming object = new Programming(); // Creating an object
		  }
		}


