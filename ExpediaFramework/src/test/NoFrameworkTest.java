package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoFrameworkTest {
       private WebDriver driver;
       private String baseUrl;

       @BeforeMethod
	public void beforeClass() {
               driver = new ChromeDriver();
               baseUrl = "https://www.expedia.ca/";
               // Maximize the browser's window
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
               driver.get(baseUrl);
       }

       @Test
       public void test() throws InterruptedException {
       //      driver.findElement(By.id("header-history")).click();
               driver.findElement(By.id("tab-flight-tab-hp")).click();
               Thread.sleep(2000);
               driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("New York");
               Thread.sleep(3000);
               driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Dhaka");
               driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("12/12/2018");
               driver.findElement(By.id("flight-returning-hp-flight")).clear();

               driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("01/03/2019");
               driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']//button[@type='submit']")).click();
       }

       @AfterMethod
	public void afterClass() {
            //   driver.quit();
       }

}

