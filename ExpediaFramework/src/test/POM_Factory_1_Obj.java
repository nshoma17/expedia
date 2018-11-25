package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageFactory.Factory_1_Obj;
//import dataproviders.TestNG_DataProviders; 
public class POM_Factory_1_Obj {
       public WebDriver driver;
        public String baseUrl;
        public Factory_1_Obj objFactory;
        @BeforeMethod
		public void setUp() throws Exception {
                driver = new FirefoxDriver();
                baseUrl = "https://www.expedia.com/";
               
                // Maximize the browser's window
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
                
        }
 
        
        @Test(dataProvider="expediaInputs", dataProviderClass = dataproviders.TestNG_DataProviders.class)

        public void test(String input1, String input2, String input3, String input4) throws InterruptedException {
            driver.get(baseUrl);
            objFactory = new Factory_1_Obj(driver);
  
            objFactory.clickFlightsTab(); 
            //      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

                  objFactory.setOriginCity(input1);
            //      Thread.sleep(500);
                
                  objFactory.setDestinationCity(input2);
                  
                  objFactory.setDepartureDate(input3);
                  
                  objFactory.setReturnDate(input4);
                  Thread.sleep(500);
                  objFactory.clickSearchButton();
                  
        }
       
        @AfterMethod
		public void tearDown() throws Exception {
        	driver.quit();
        }
 
}
 