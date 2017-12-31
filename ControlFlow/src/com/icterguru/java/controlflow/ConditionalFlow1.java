package com.icterguru.java.controlflow;

import java.io.IOException;
import java.util.Scanner;

public class ConditionalFlow1 {

	public static void main(String[] args) throws IOException {
		int N, $0=0, $1=1, $;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Value of N (>=1) : ");
		N= scn.nextInt();
		System.out.println("N = " + N);
		System.out.println("First " +N+ " Fibonacci Numbers are: \n");
		for (int i=0; i<=N; i++)
		{
			$=$0+$1;
			System.out.print("" +$ + "\t");
			$1=$0;
			$0=$;
		}
		scn.close();
	}

}
