package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Factory_2_Static {

	@FindBy(id = "tab-flight-tab-hp")
	static WebElement fligthsTab;

	@FindBy(id = "flight-origin-hp-flight")
	static WebElement originCity;

	@FindBy(id = "flight-destination-hp-flight")
	static WebElement destinationCity;

	@FindBy(id = "flight-departing-hp-flight")
	static WebElement departureDate;

	@FindBy(id = "flight-returning-hp-flight")
	static WebElement returnDate;

	@FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	static WebElement searchBtn;

	public static void clickFlightsTab() {
		fligthsTab.click();
	}

	public static void setOriginCity(String origin) {
		originCity.click();
		originCity.sendKeys(origin);
	}

	public static void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}

	public static void setDepartureDate(String date) {
		departureDate.sendKeys(date);
	}

	public static void setReturnDate(String date) {
		selectText(returnDate);
		returnDate.sendKeys(date);
	}

	public static void clickSearchButton() {
		searchBtn.click();
	}

	public static void selectText(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}
}
