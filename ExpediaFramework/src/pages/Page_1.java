package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_1 {
	public  WebElement element = null;
	private WebDriver driver;
	
	public  Page_1(WebDriver driver) {
		this.driver = driver;
	}
	// find flight tab
	public  WebElement flightTabs() {
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		return element;
	}

	//click flight tab		
	public void clickFlightTabs() {
		flightTabs().click();
	}

	// find origin id
	public WebElement originTextBox() {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
	}

	// fill origin
	public void fillOriginTextBox( String origin) {
		element = originTextBox();
		element.sendKeys(origin);
	}

	// find destination id
	public WebElement destinationTextBox() {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		return element;
	}

	// fill destination
	public void fillDestinationTextBox(String destination) {
		element = destinationTextBox();
		element.sendKeys(destination);
	}

	// find departure date id
	public WebElement departureDateTextBox() {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}

	// fill departure date
	public void fillDepartureDateTextBox( String depDate) {
		element = departureDateTextBox();
		element.sendKeys(depDate);
	}

	// fill return date
	public void fillReturnDateTextBox(String retDate) {
		element = returnDateTextBox();
		selectDisplayedText(element);
		element.sendKeys(retDate);
	}

	// find return date id
	public WebElement returnDateTextBox() {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		return element;
	}

	// select displayed text 
	public void selectDisplayedText(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}

	// find search button
	public WebElement searchButton() {
		element = driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		return element;
	}

	// click search button
	public void clickOnSearchButton() {
		element = searchButton();
		element.click();
	}

}