package tricentisProjectWith_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {
   
	WebDriver driver;
     public SendQuote(WebDriver driver) {
		
    	 this.driver = driver;
	}
	
     
    public void Email(String email) {
    	
    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
 	}
     
	
    public void Phone(String phone) {
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(phone);
	}

    
    public void Username(String username) {
		
    	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
	}
     
     public void Password(String password) {
 		
    	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
 	}
     
     
     public void ConfirmPassword(String confirmpass) {
 		
    	 driver.findElement(By.id("confirmpassword")).sendKeys(confirmpass);
 	}
     
    
     public void ClickSend() {
 		//readme
    	 driver.findElement(By.id("sendemail")).click();
    	 driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
    	 driver.findElement(By.xpath("//*[@id=\"backmain\"]/span/i")).click();
 	}
     
 }
