package tricentisProjectWith_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicalDataCamper {

  WebDriver driver;
  
  public EnterVehicalDataCamper(WebDriver driver) {
	  
	  this.driver=driver;
  }

 
  public void CamperMake(String CamperMake) {
	 
	 new Select (driver.findElement(By.id("make"))).selectByValue(CamperMake);
 }
  
 
  public void CamperEnginePerformance(String CamperEnginePerformance) {

	  driver.findElement(By.id("engineperformance")).sendKeys(CamperEnginePerformance);
  }
  
  public void CamperDateofManufacture(String CamperDateofManufacture) {
	  
	  driver.findElement(By.id("dateofmanufacture")).sendKeys(CamperDateofManufacture);
  }
  
  public void CamperNumberofSeats(String CamperNumberofSeats) {
	  
	new Select(driver.findElement(By.id("numberofseats"))).selectByValue(CamperNumberofSeats);  
  
  }
  

  public void CamperRightHandDrive() {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/p/label[1]/span")).click();
  }
  
  
  public void CamperFuelType(String CamperFuelType) {
	  
	  new Select(driver.findElement(By.id("fuel"))).selectByValue(CamperFuelType);
  }
  
  
  public void CamperPayload(String CamperPayload) {
	  
	  driver.findElement(By.id("payload")).sendKeys(CamperPayload);
  }
  
  
  public void CamperTotalWeight(String CamperTotalWeight) {
	  
	  driver.findElement(By.id("totalweight")).sendKeys(CamperTotalWeight);
  }

  
  public void CamperListPrice(String  CamperListPrice) {
	  
	  driver.findElement(By.id("listprice")).sendKeys(CamperListPrice);
  }
  
  
  public void CamperLicensePlateNumber(String CamperLicensePlateNumber) {
	  
	  driver.findElement(By.id("licenseplatenumber")).sendKeys(CamperLicensePlateNumber);
  }
  
  
  public void CamperAnnualMileage(String CamperAnnualMileage) {
	  
	  driver.findElement(By.id("annualmileage")).sendKeys(CamperAnnualMileage);
  }
  
  
  public void Campernextinsurantdata() {
	  
	  driver.findElement(By.id("nextenterinsurantdata")).click();
  }
    
}
