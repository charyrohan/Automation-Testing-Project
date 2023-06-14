package tricentisProjectWith_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicalDataMotocycle {

	WebDriver driver;
	public  EnterVehicalDataMotocycle(WebDriver driver) {
			
			this.driver=driver;
		}

    public void vehical_Mmake(String make) {
	   
	   new Select(driver.findElement(By.id("make"))).selectByValue(make);
    }

    public void vehical_MOTORCYCLEModel(String MOTORCYCLEModel) {
    	
    	new Select(driver.findElement(By.id("model"))).selectByValue(MOTORCYCLEModel);
    }
    
    
    public void vehical_MCylinderCapacity(String MCylinderCapacity) {
    	
    	driver.findElement(By.id("cylindercapacity")).sendKeys(MCylinderCapacity);
    }
    
    
    public void MEnginePerformance(String MEnginePerformance) {
    	
    	driver.findElement(By.id("engineperformance")).sendKeys(MEnginePerformance);
    	
    }

    public void MDateofManufacture(String MDateofManufacture ) {
    	
    	driver.findElement(By.id("dateofmanufacture")).sendKeys(MDateofManufacture);
		
    }

    public void MNumberofSeats(String MNumOfSeats ) {
    	
    	new Select(driver.findElement(By.id("numberofseatsmotorcycle"))).selectByValue(MNumOfSeats);
    }
    
   public void MListPrice(String MListPrice) {
	   
	   driver.findElement(By.id("listprice")).sendKeys(MListPrice);
   }
    
    
     public void MAnnualMileage(String MAnnualMileage ) {
    	
    	driver.findElement(By.id("annualmileage")).sendKeys(MAnnualMileage);
    	
    }
    
    public void nxtButton() {
    	
    	driver.findElement(By.id("nextenterinsurantdata")).click();
    }
    
}
