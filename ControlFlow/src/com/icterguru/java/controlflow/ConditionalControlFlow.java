package com.icterguru.java.controlflow;

import java.util.Scanner;

public class ConditionalControlFlow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int Age = scan.nextInt();
		if (Age <= 0)
			System.out.println("You have not born yet!");
		if (Age > 0 && Age <= 12)
			System.out.println("You are still child.");
		if ((Age > 12 && Age <= 30))
			System.out.println("You are young and energetic");
		if ((Age > 30 && Age <= 40))
			System.out.println("You are now a complete man.");
		if ((Age > 40))
			System.out.println("Wish you a long life");
		scan.close();

	}
}
