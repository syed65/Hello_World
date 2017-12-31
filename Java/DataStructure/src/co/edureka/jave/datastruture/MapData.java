package co.edureka.jave.datastruture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapData {

	public static void main(String[] args) {
		Map<String, List<String>>makeModel= new HashMap<String, List<String>>();
		
		List<String> hondaList = new ArrayList<String>();
		hondaList.add("Civic");
		hondaList.add("Accord");
		
		List<String> toyotaList = new ArrayList<String>();
		toyotaList.add("Corolla");
		toyotaList.add("Rav 4");
		
		List<String> AudiList = new ArrayList<String>();
		AudiList.add("R8");
		AudiList.add("R4");
		
		makeModel.put("Honda" , hondaList);
		makeModel.put("Toyota" , toyotaList);
		makeModel.put("Audi" , AudiList);
		
		System.out.println(makeModel.get("Honda"));
		System.out.println(makeModel.get("Toyota"));
		System.out.println(makeModel.get("Audi"));
	}

}
