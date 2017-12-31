package conditionalStatement;

import java.io.IOException;
import java.util.Scanner;

public class SwtchCase_2 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your Accademic year(First,Seccond, Third, Fourth, Gradute): ");
		String year= scn.next().toLowerCase();//Converting string into lower case
		switch(year) {
		case "first":
			System.out.println("You are now the First year Student");
		 break;
		case "second":
			System.out.println("You are now the Second year Student");
		 break;
		case "third":
			System.out.println("You are now the Third year Student");
		 break;
		case "fourth":
			System.out.println("You are now the Fourth year Student");
		 break;
		case "graduate":
			System.out.println("You are now a graduate");
		 break;
		 default:
			 System.out.println("You have entered an invalid accademic year");
			 scn.close();
		 
		}
		
	}

}
