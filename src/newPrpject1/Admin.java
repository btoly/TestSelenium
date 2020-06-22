package newPrpject1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Admin {

	WebDriver driver;

	@Test
	public void Admin() {

		System.setProperty("webdriver.chrome.driver", "/Users/ebthalalessa/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();
		
		//ID
		//Admin

		driver.get("http://localhost:4200/home");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/app-login/form/div/div/div/div/div[2]/div/div/input[1]")).sendKeys("9999999999");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//pass
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/app-login/form/div/div/div/div/div[2]/div/div/input[2]")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//click login 
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//Users 
		
		
		driver.findElement(By.id("navbarDropdown")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"topNav\"]/div/ul[1]/li/ul/li/div/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// admin page
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-select-register/div/div/div[2]/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
	
		//After Test
		driver.close();

	}

}
