package qsp;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;


public class HandlingTabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/demo-request");
		driver.findElement(By.linkText("Try Free")).click();
		Set<String> GetAllWindowHandles = driver.getWindowHandles();
			int count = GetAllWindowHandles.size();
			System.out.println(count);
			for (String string : GetAllWindowHandles) {
			System.out.println(string);	
			}
			driver.quit();
	}		

}
