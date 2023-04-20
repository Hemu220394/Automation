package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo {
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); // use for hide browswe
		options.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//SafariDriver driver = new SafariDriver();
		
		
//		driver.get("http://www.google.com");
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.close();
		
		driver.get("http://www.gogle.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("The page is: "+ driver.getTitle());
		System.out.println("The current url "+ driver.getCurrentUrl());

		driver.close();
	}

}
