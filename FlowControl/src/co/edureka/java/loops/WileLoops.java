package co.edureka.java.loops;

import java.util.Calendar;
import java.util.Date;

public class WileLoops {

	public static void main(String[] args) throws InterruptedException {
		Date today = new Date();
		System.out.println(today);
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 07, 16, 14, 19, 0);
		while(today.before(cal.getTime()))
		{
			System.out.println("Waiting");
			Thread.sleep(1000);
			today= new Date();
			System.out.println(today);
		}
		System.out.println("Done");
		
	}

}
