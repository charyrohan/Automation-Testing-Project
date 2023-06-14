package tricentisProjectWith_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {

	WebDriver driver;
   public EnterInsurantData(WebDriver driver) {
	   
	   this.driver=driver;
   }

  public void firstName(String Fname) {
	  
	  driver.findElement(By.id("firstname")).sendKeys(Fname);
  }

  public void LastName(String Lname) {
	 
	  driver.findElement(By.id("lastname")).sendKeys(Lname);
 }

  public void DateOfBirth(String birthdate ) {
	  
	  driver.findElement(By.xpath("//*[@id=\"birthdate\"]")).sendKeys(birthdate);
  }

  public void Gender() {
	  
	  driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
  }
  
  public void StreetAddress(String streetaddress ) {
	  
	  driver.findElement(By.id("streetaddress")).sendKeys(streetaddress);
  }

  public void Country(String country ) {
	  
      new Select(driver.findElement(By.id("country"))).selectByValue(country);
  }

  
  public void ZipCode(String Zip ) {
	  
	  driver.findElement(By.id("zipcode")).sendKeys(Zip);
  }
  
  
   public void City(String city ) {
	  
	   driver.findElement(By.id("city")).sendKeys(city );
  }
  
   
   public void Occupation(String occupation  ) {
		  
		new Select(driver.findElement(By.id("occupation"))).selectByValue(occupation);  
   }
  
   
   public void Hobbies() {
		  
	   WebElement chkBox=driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label"));
		
       if(chkBox.isSelected()==false)
    	 chkBox.click();
     
       driver.findElement(By.id("nextenterproductdata")).click();      
       
   }
   
}
