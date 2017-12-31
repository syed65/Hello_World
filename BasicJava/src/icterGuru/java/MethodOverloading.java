package icterGuru.java;

//Method Overloading Concept

public class MethodOverloading {

	public void add(int x, int y) {
		System.out.println(x + y);

	}

	public void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void add(double x, double y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		MethodOverloading MD = new MethodOverloading();
		MD.add(30, 40);
		MD.add(30, 90, 45);
		MD.add(4.5, 8.75);
	}
}

