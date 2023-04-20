package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class CreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//SafariDriver driver = new SafariDriver();
		driver.get("https://online.actitime.com/hdas/login.do");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("hemantadasasn162@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Hemu@1995");
		driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Hemu");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Businessman");
		driver.findElement(By.xpath("//div[@class='emptySelection']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Our company']")).click();
		Thread.sleep(4000);
	    WebElement create = driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]"));
	    create.click();
	    if (create.isDisplayed()) {
			System.out.println("Customer is successfully created");
		}else {
			System.out.println("Customer is not created");
		}
	    Thread.sleep(4000);
	    driver.findElement(By.id("logoutLink")).click();
	    driver.close();
	  
	    
	}

}
