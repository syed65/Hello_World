package selenium.webdriver;

import java.io.File;

public class Samples {

	public static void main(String[] args)  {
		//1. How to create a text file in Java
		File fileobj =new File("‪C:\\Users\\Desktop\\Sample");
		
		try {
			fileobj.createNewFile();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		/*2. Check the existance of a file/ if not exist then how to create?
		File fileobj =new File("file path")
		fileobj.createNewFile();
		boolean b = fileobj.exist();//to check the existance of file
		if(b==true){
		System.println("File exist")
		}
		else{
		fileobj.createNewFile();
		System.out.println("File created")
		}}}
		3. How to create and delete a folder?
		File abc = new File ("‪C:\\Users\\Desktop\\abc");
		abc.delete();
		4' How to read a text file?
		String line;
		FileReder file =new FileReader("‪C:\\Users\\Desktop\\abc");
		BufferedReader bfr = new BufferedReader(file);
		while((line= bfr.readLine())!= null){
		System.out.println(line);
		}
		bfr.close();
		file.close();
*/



	}

}
