package day9.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo 
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\saravanan.somu\\Desktop\\sudha.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			fis.read();
			System.out.println(fis.toString());
			fis.close();
//			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
		

	}

}
