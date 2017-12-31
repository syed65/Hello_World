package basic.calculation;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total=0;
		int grade;
		int average;
		int counter=0;
		
		while(counter<10) {
			grade= scan.nextInt();
			total=total+grade;
			counter++;
		}		
		average=total/10;
		System.out.println("The average is: "+average);
		
	}

}
