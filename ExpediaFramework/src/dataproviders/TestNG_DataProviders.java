package dataproviders;
 
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class TestNG_DataProviders {

        @DataProvider(name="expediaInputs")
        public Object[][] d() {
                return new Object[][] {
                        {"Oslo", "London","01/11/2019","02/22/2019"},
                        {"Sylhet", "New York","01/11/2019","02/22/2019"}

                };
        }
    
   
}