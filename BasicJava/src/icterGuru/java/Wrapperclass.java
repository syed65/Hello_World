package icterGuru.java;

public class Wrapperclass {

	public static void main(String[] args) {
		Integer i1 =127;// i1 &i2 variables are referring to the same object '127'. Thats why result in the console it would show True
		Integer i2= 127;
		System.out.println(i1==i2);//True
		Integer i3 = 128; //Integer class can only take value up to 127. After 127 once the value changes (here 128) a new object is created. As such the argument in this case becomes false
		Integer i4 = 128;
		System.out.println(i3==i4);//False

	}

}
