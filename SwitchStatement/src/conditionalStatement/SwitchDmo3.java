package conditionalStatement;

import java.util.Random;

public class SwitchDmo3 {

	public static void main(String[] args) {
		int yearNum = 0;
		Random randomNumY = new Random();
		yearNum = randomNumY.nextInt(10001);
		
		int numdays = 0;
		Random randomNumM =new Random();
		int monthNum = randomNumY.nextInt(13);
		
		switch(monthNum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		numdays = 31;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		numdays = 30;
		break;
		case 2:
			if(((yearNum % 4 == 0) && !(yearNum % 100 == 0)) || (yearNum % 400 ==0))
		numdays = 29;
		else 
			numdays =28;
			break;
		default:
			System.out.println("OOPS! invalid month please run again");
			break;
		}
		System.out.println("In year: " + yearNum + " Month " + monthNum + " has/had " + numdays + " days");
		
		
	}

}
