package use.methods;

import java.util.Scanner;

public class Aple {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tuna objTuna = new Tuna();
		System.out.println("Enter the new recipie you made:  ");
		String Temp = scan.nextLine();
		objTuna.makeRecipie(Temp);
		objTuna.prepare();
	}

}
