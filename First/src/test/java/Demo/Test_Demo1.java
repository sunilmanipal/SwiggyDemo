package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Demo1 {
	WebDriver driver;
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome 86\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		 //this is to maximize the browser
		  driver.manage().window().maximize();
		  //i want to open any URL
		  driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@AfterTest
	public void at() throws InterruptedException
	{
		Thread.sleep(3000);
		  driver.close();
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit' or @id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
}
