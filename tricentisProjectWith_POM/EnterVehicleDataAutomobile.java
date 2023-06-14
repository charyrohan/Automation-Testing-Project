package tricentisProjectWith_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataAutomobile {
 
	WebDriver driver;
	public  EnterVehicleDataAutomobile(WebDriver driver) {
			
			this.driver=driver;
		}

    public void vehical_make(String make) {
	   
	   new Select(driver.findElement(By.id("make"))).selectByValue(make);
    }

    public void vehical_Model(String Model) {
    	
    	new Select(driver.findElement(By.id("model"))).selectByValue(Model);
    }
    
    
    public void vehical_CylinderCapacity(String CylinderCapacity) {
    	
    	driver.findElement(By.id("cylindercapacity")).sendKeys(CylinderCapacity);
    }
    
    
    public void EnginePerformance(String engineperformance) {
    	
    	driver.findElement(By.id("engineperformance")).sendKeys(engineperformance);;
    	
    }

    public void DateofManufacture(String dateofmanufacture ) {
    	
    	driver.findElement(By.id("dateofmanufacture")).sendKeys(dateofmanufacture);
		
    }

    
    public void NumberofSeats(String NumOfSeats ) {
    	
    	new Select(driver.findElement(By.id("numberofseats"))).selectByValue(NumOfSeats);
    }

    
    public void FuelType(String ElectricPower ) {
    	
    	new Select(driver.findElement(By.id("fuel"))).selectByValue(ElectricPower);
    }
    
    
    public void ListPrice(String listPrice) {
    	
    	driver.findElement(By.id("listprice")).sendKeys(listPrice);
    }
    
    
    public void LicensePlateNumber(String platenumber ) {
    	
    	driver.findElement(By.id("licenseplatenumber")).sendKeys(platenumber);
    }
    
    
    public void AnnualMileage(String annualmileage ) {
    	
    	driver.findElement(By.id("annualmileage")).sendKeys(annualmileage);
    	
    }
    
    
    public void nxtButton() {
    	
    	driver.findElement(By.id("nextenterinsurantdata")).click();
    }
    
    
}
