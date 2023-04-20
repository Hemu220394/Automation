package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/hdas/login.do");
		driver.findElement(By.id("username")).sendKeys("hemantadasasn162@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Hemu@1995");
		driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
