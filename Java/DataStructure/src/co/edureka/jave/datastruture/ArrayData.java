package co.edureka.jave.datastruture;

import java.util.ArrayList;
import java.util.List;

public class ArrayData {

	public static void main(String[] args) {
		List<Character> arrayList= new ArrayList<Character>();
		arrayList.add('H');
		arrayList.add('E');
		arrayList.add('L');
		arrayList.add('L');
		arrayList.add('O');
		arrayList.add('_');
		arrayList.add('W');		
		arrayList.add('O');
		arrayList.add('R');
		arrayList.add('L');
		arrayList.add('D');
		
		for(Character s:arrayList)
		{
			System.out.print(s);
		}
		
	}

}
