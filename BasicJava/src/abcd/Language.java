package abcd;

/*When cpp object is created default constructor is called and when java object is created the constructor with argument is called, setName method 
 is used to set 'name' attribute of language, getName method prints language name.
 */

public class Language {

	String name;

	Language() {
		System.out.println("Constructor method called.");
	}

	Language(String t) {
		name = t;
	}

	public static void main(String[] args) {
		Language cpp = new Language();
		Language java = new Language("Java");

		cpp.setName("C++");

		java.getName();
		cpp.getName();
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language name: " + name);
	}
}

