package test;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Page_2;

public class POM_Page_2_Static {
	private WebDriver driver;
	private String baseUrl;

	@BeforeTest
	public void setUp() throws Exception {
		driver = new ChromeDriver();//FirefoxDriver();
		baseUrl = "https://www.expedia.ca/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);

		Page_2.clickFlightTabs(driver);

		Thread.sleep(1000);

		Page_2.fillOriginTextBox(driver, "Ohio");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(2000);

		Page_2.fillDestinationTextBox(driver, "Toronto");

		Page_2.fillDepartureDateTextBox(driver, "04/12/2018");

		Thread.sleep(1000);
		Page_2.fillReturnDateTextBox(driver, "01/01/2019");
		Thread.sleep(2000);

		Page_2.clickOnSearchButton(driver);
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
