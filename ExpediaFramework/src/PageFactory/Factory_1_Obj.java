package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory_1_Obj {
	 WebDriver driver;
	
	@FindBy(id="tab-flight-tab-hp")
	static WebElement fligthsTab;
	
	@FindBy(id="flight-origin-hp-flight")
	static WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	static
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	WebElement searchBtn;
	
	public  Factory_1_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		fligthsTab.click();
	}

	public  void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setDepartureDate(String date) {
		departureDate.sendKeys(date);
	}
	
	public void setReturnDate(String date) {
		returnDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));

		returnDate.sendKeys(date);
	}

	public void clickSearchButton() {
		searchBtn.click();		
	}

}
 