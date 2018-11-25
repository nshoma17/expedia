package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.Factory_2_Static;

public class POM_Factory_2_Static {
	public WebDriver driver;
	public String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();//ChromeDriver();//FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		
		PageFactory.initElements(driver, Factory_2_Static.class);
		Factory_2_Static.clickFlightsTab();
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		Factory_2_Static.setOriginCity("Sylhet");
		Thread.sleep(500);

		Factory_2_Static.setDestinationCity("London");

		Factory_2_Static.setDepartureDate("01/11/2019");

		Factory_2_Static.setReturnDate("02/22/2019");
		
		Thread.sleep(500);
		
		//Factory_2_Static.clickSearchButton();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
