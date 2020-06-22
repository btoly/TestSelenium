package newPrpject1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class selum {

	WebDriver driver;

	@Test
	public void Tester() {

		System.setProperty("webdriver.chrome.driver", "/Users/ebthalalessa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_product=5&controller=product");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[text()='Add to cart']")).click();
		driver.findElement(By.xpath(".//a[contains(@title,'Proceed to checkout')]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("email_create")).sendKeys("EbthalAlessa@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("uniform-id_gender2")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("customer_firstname")).sendKeys("ebthal");
		driver.findElement(By.id("customer_lastname")).sendKeys("Alessa");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select DayOfBirth = new Select(driver.findElement(By.id("days")));
		DayOfBirth.selectByValue("8");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select MonthOfBirth = new Select(driver.findElement(By.id("months")));
		MonthOfBirth.selectByValue("1");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("1996");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("uniform-optin")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("company")).sendKeys("Elm");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("address1")).sendKeys("Riyadh Al-Malqa District");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("address2")).sendKeys("building");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("city")).sendKeys("Riyadh");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Select State = new Select(driver.findElement(By.id("id_state")));
		State.selectByValue("32");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Select Country = new Select(driver.findElement(By.id("id_country")));
		Country.selectByValue("21");

		driver.findElement(By.id("other")).sendKeys("Packaging my shipment");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("phone_mobile")).sendKeys("0555555555");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Riyadh");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		///////////////////////////////////////////////////////
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("uniform-cgv")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		
		//After Test
		driver.close();

	}

}
