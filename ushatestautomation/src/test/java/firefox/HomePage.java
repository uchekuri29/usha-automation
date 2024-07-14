package firefox;

import java.security.PublicKey;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");

	}
	
	

	@Test
	public static void findSearchBox() {

		boolean sstatus= driver.findElement(By.name("q")).isDisplayed();
        Assert.assertFalse(sstatus, "Search Box not found");

        // If assertion is passed , then only next step will execute
        // Login
        // assert - is login successfull
        // Placing one order
        // assert  - is order placed
        // Payment
        //  assert - is payment done

        // SoftAssert - if soft assert failed, then next step will step will execute but test case
        // will fail
        
        // form to validate
        // 10 fields to validate
        // f1
        // f2 - issue
        // f3
        // f4 - issue
        // f5
        // f6
        // f7 - issue
        // f8
        // f9
        // f10
        
	}
	
	@Test
	public void test23() {
		SoftAssert softAssert  = new SoftAssert();
		Assert.assertTrue(true,"line1");
		Assert.assertTrue(false,"line2");
		Assert.assertTrue(true,"line3");
		Assert.assertTrue(false,"line4");
		Assert.assertTrue(true,"line5");
		softAssert.assertAll();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public static void enterSearchData() {
		driver.findElement(By.name("q")).sendKeys("testing");
		
	}
	
	@Test
	public static void clickOnGmail() {                   
		boolean gmailstatus = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(gmailstatus, "Gmail link is not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}


