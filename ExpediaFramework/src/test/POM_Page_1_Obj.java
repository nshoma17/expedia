package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Page_1;

public class POM_Page_1_Obj {
	private WebDriver driver;
	private String baseUrl;
	public Page_1 objPage_1;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();//FirefoxDriver();
		baseUrl = "https://www.expedia.ca/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		 objPage_1 = new Page_1(driver);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);

		objPage_1.clickFlightTabs();

		Thread.sleep(1000);

		objPage_1.fillOriginTextBox("Waterloo");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(4000);

		objPage_1.fillDestinationTextBox("Michigan");

		objPage_1.fillDepartureDateTextBox("04/12/2018");

		Thread.sleep(1000);
		objPage_1.fillReturnDateTextBox("01/01/2019");
		Thread.sleep(3000);

		objPage_1.clickOnSearchButton();
	}

	@AfterTest
	public void tearDown() throws Exception {
	//	Page_1.clickOnSearchButton(driver);

		driver.quit();
	}

}
