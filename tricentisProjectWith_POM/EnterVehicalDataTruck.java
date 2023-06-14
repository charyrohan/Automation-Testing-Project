package tricentisProjectWith_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicalDataTruck {
    
	WebDriver driver;
	public EnterVehicalDataTruck(WebDriver driver) {
		
		this.driver=driver;
	}

    public void vehical_TMake(String make) {
    	
    	new Select(driver.findElement(By.id("make"))).selectByValue(make);
    }

    public void vehical_TEnginePerformance(String TEnginePerformance) {
    	
    	driver.findElement(By.id("engineperformance")).sendKeys(TEnginePerformance);
    }

    public void vehical_TDateofManufacture(String TDateofManufacture) {
    	
    	driver.findElement(By.id("dateofmanufacture")).sendKeys(TDateofManufacture);
    }
    
    public void vehical_TNumberofSeats(String  TNumberofSeats) {
    	
    	new Select(driver.findElement(By.id("numberofseats"))).selectByValue(TNumberofSeats);
    }
    
    public void vehical_TFuelType(String TFuelType) {
    	
    	new Select(driver.findElement(By.id("fuel"))).selectByValue(TFuelType);
    }
    
    public void vehical_TPayload(String TPayload ){
    	
    	driver.findElement(By.id("payload")).sendKeys(TPayload);
    }
 
    public void vehical_TotalWeight(String TotalWeight) {
    	
    	driver.findElement(By.id("totalweight")).sendKeys(TotalWeight);
    }
    
    public void vehical_ListPrice(String ListPrice) {
    	
    	driver.findElement(By.id("listprice")).sendKeys(ListPrice);
    }
    
    public void vehical_LicensePlateNumber(String LicensePlateNumber) {
    	
    	driver.findElement(By.id("licenseplatenumber")).sendKeys(LicensePlateNumber);
    }
    
    public void vehical_AnnualMileage(String AnnualMileage) {
    	
    	driver.findElement(By.id("annualmileage")).sendKeys(AnnualMileage);
    }
    
  
     public void nextbuttontruck() {
    	
    	driver.findElement(By.id("nextenterinsurantdata")).click();
    }

}
