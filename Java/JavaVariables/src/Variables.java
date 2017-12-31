//Comments
public class Variables {

	/* Instance Variables Declared within a class but outside of other code block.
	Class variables declared with static keyword and within the class but outside
	 of main method
	 Local variables are declared within the code block .Examples are:
*/	
	static int a = 100;//'a' is a Class variable
	int b=200;// 'b' is an Instance variable
	public int salary() {
		int mySalary = 10000 + 1500 + 300;//mySalary is a local variable under method 'salary'
		mySalary = mySalary + a + b;
		return mySalary;

	}
	public static void main(String[] args) {  
		int d=300;//Local variable
		int e=150;//Local variable
		Variables obj1 = new Variables();// Calling the constructor
		System.out.println(obj1.salary());// 12100
		//Or
		int res= obj1.salary();
		System.out.println(res);//12100
		System.out.println(obj1.b);//200
		int c= a+d;
		System.out.println(c);//400
		if (d>a) {
			int x=500;
			System.out.println(a);//  Class variable (100)
			System.out.println(obj1.b);// Instance variable but declared outside of main method(200)
			System.out.println(d);// Instance variable but declared inside main method(300)
			System.out.println(x);// It is a local variable(500)
		}
	}

}