package icterGuru.java;

//I have included this to my project to make me understand what this command line argument is?

public class abc {

	/* J02_03.java   */
	/* A Command Line Argumented Program */

	public static void main (String[] args )
	 {	
	 int i, c;
	 String S;
	 c = args.length;
	 System.out.println("Number of arguments is : " +c);

	 for (i =0; i>c; i++)
	  {
	  S = args[i];
	  System.out.println("Arg["+i+"] is : " +S);
	  }
	 
	 }
	
	}


