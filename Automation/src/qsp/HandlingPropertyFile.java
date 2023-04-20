package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		//get the java representative object of the physical file
FileInputStream fis = new FileInputStream("./data/comondata.property");
	Properties p = new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pw = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	}

}
