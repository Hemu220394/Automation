package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoLocators {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
//WebDriver driver=new SafariDriver();
driver.get("http://127.0.0.1:5500/Demo.html");
Thread.sleep(2000);
driver.findElement(By.tagName("a")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.id("d1")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.name("n1")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.className("c1")).click();
driver.close();
		

	}

}
