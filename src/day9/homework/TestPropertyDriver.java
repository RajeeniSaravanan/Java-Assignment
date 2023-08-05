package day9.homework;

import java.io.File;

public class TestPropertyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path=new File(System.getProperty("user.dir")+"/resources/data.properties");
		
		String value=PropertyFileReadWrite.readDataFromPropertyFile(path, "name");
		System.out.println("value="+value);
		
		PropertyFileReadWrite.writeDataToPropertyFile(path,"username","divyashree@tekarch.com");
	}

}