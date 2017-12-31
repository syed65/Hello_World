package com.icterguru.filehanle;

import java.io.File;

public class FileHandling {

	public static void main(String[] args)  {
		//1. How to create a text file in Java
			File fileobj =new File("C:\\Users\\sohai\\Desktop\\Selenium");
			
			try {
				fileobj.createNewFile();
						
			File fileobj1 =new File("C:\\Users\\sohai\\Desktop\\Sample");
			fileobj1.mkdir();
			boolean b = fileobj1.exists();
			if (b==true) {
				System.out.println("The file exist");
			}
			else
			{
				System.out.println("The file doesn't exist");
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
}}