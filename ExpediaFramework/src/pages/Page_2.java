package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_2 {
	public static WebElement element = null;

	// find flight tab
	public static WebElement flightTabs(WebDriver driver) {
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		return element;
	}

	//click flight tab		
	public static void clickFlightTabs(WebDriver driver) {
		flightTabs(driver).click();
	}

	// find origin id
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
	}

	// fill origin
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}

	// find destination id
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		return element;
	}

	// fill destination
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
	}

	// find departure date id
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}

	// fill departure date
	public static void fillDepartureDateTextBox(WebDriver driver, String depDate) {
		element = departureDateTextBox(driver);
		element.sendKeys(depDate);
	}

	// fill return date
	public static void fillReturnDateTextBox(WebDriver driver, String retDate) {
		element = returnDateTextBox(driver);
		selectDisplayedText(element);
		element.sendKeys(retDate);
	}

	// find return date id
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		return element;
	}

	// select displayed text 
	public static void selectDisplayedText(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}

	// find search button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		return element;
	}

	// click search button
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}

}