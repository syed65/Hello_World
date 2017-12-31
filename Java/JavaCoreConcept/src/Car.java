
public class Car {
	private static String brand;
	public Car(String theBrand) {
		this.brand=theBrand;
	}
	public String getBrand() {
		return this.brand;
	}

	public static void main(String[] args) {
		Car myCar = new Car(brand);
System.out.println(myCar);
	}

}
