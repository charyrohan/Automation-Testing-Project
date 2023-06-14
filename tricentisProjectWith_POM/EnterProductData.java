package tricentisProjectWith_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData {
 WebDriver driver;
	public EnterProductData(WebDriver driver) {
		
		this.driver=driver;
	}

  
	public void StartDate(String startDate) {
		
		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys(startDate);
	}

    public void InsuranceSum(String InsuranceSum) {
    	
    	new Select(driver.findElement(By.id("insurancesum"))).selectByValue(InsuranceSum);
    }

    
    public void MeritRating(String meritrating) {
    	
    	new Select(driver.findElement(By.id("meritrating"))).selectByValue( meritrating);
    
    }

   
    public void DamageInsurance(String damageInsurance) {
    	
    	new Select(driver.findElement(By.id("damageinsurance"))).selectByValue(damageInsurance);
    }

    
    public void OptionalProducts() {
    	
 
	WebElement chkBox2=driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
		
        if(chkBox2.isSelected()==false)
	    	 chkBox2.click();
    }
    
   
    public void OptionalProductsTRUCK() {
    	
    	 
    	WebElement chkBox2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span"));
    		
            if(chkBox2.isSelected()==false)
    	    	 chkBox2.click();
        }
    
    
    public void OptionalProductsMotoCycle() {
     	
    	 WebElement chkBox2=driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span"));
     		
             if(chkBox2.isSelected()==false)
     	    	 chkBox2.click();
         }
     
   
      public void CourtesyCar(String courtesyCar) {
    	
    	new Select(driver.findElement(By.id("courtesycar"))).selectByValue(courtesyCar);
    	
    	 driver.findElement(By.id("nextselectpriceoption")).click();
    }

     
      public void nextselectpriceoption() {
      	
     	 driver.findElement(By.id("nextselectpriceoption")).click();
     }
     
    
    
}
