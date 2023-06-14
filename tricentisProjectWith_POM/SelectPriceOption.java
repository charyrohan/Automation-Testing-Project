package tricentisProjectWith_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceOption {

 WebDriver driver;
 String  act_price,act_onlineclaim,act_ClaimsDiscount,act_worldwidecover;
 
 
 public SelectPriceOption(WebDriver driver) {
	this.driver = driver;

 }
  
  public void CheckPrice(String expprice,String exponlineclaim, String expclaimdiscount,String Worldwidecover,String type)    
     {
    	 String actprice,actonlineclaim,actclaimeddis,actWorldwidecover;
         
    	 
         switch(type)
    	 {
    	 case "silver":
    		 actprice=driver.findElement(By.id("selectsilver_price")).getText();
    		 actonlineclaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
    		 expclaimdiscount=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
    		 actWorldwidecover=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
    	     
    		 if(actprice.equals(expprice)) 
    			 System.out.println("PRICE IS MATCHING");
    			 else
    		    System.out.println("PRICE IS MATCHING");	 
    		 
    		 if(actonlineclaim.equals(exponlineclaim)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	  
    	    
    		 if(expclaimdiscount.equals(expclaimdiscount)) 
    			 System.out.println("onlineclaim IS MATCHING");
    			 else
    		    System.out.println("onlineclaim IS not  MATCHING");
    	 
    	    
    		 if(actWorldwidecover.equals(Worldwidecover)) 
    			 System.out.println("actWorldwidecover IS MATCHING");
    			 else
    		    System.out.println("Worldwidecover IS not  MATCHING");
    		 
    		  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
    		  driver.findElement(By.id("nextsendquote")).click();
    		  
    		  break;
      
    	 case "Gold":
    		 actprice=driver.findElement(By.id("selectgold_price")).getText();
    		 actonlineclaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
    		 expclaimdiscount=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
    		 actWorldwidecover=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
    	     
    		 if(actprice.equals(expprice)) 
    			 System.out.println("PRICE IS MATCHING");
    			 else
    		    System.out.println("PRICE IS MATCHING");	 
    		 
    		 if(actonlineclaim.equals(exponlineclaim)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	  
    	    
    		 if(expclaimdiscount.equals(expclaimdiscount)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	 
    	    
    		 if(actWorldwidecover.equals(Worldwidecover)) 
    			 System.out.println("Worldwidecover IS MATCHING");
    			 else
    		    System.out.println("Worldwidecover IS not  MATCHING");
    		 
    		  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
    		  driver.findElement(By.id("nextsendquote")).click();
    	      
    		  break;
    	 
    	 case "Platinum":
    		 actprice=driver.findElement(By.id("selectplatinum_price")).getText();
    		 actonlineclaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")).getText();
    		 expclaimdiscount=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")).getText();
    		 actWorldwidecover=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
    	     
    		 if(actprice.equals(expprice)) 
    			 System.out.println("PRICE IS MATCHING");
    			 else
    		    System.out.println("PRICE IS MATCHING");	 
    		 
    		 if(actonlineclaim.equals(exponlineclaim)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	  
    	    
    		 if(expclaimdiscount.equals(expclaimdiscount)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	 
    	    
    		 if(actWorldwidecover.equals(Worldwidecover)) 
    			 System.out.println("Worldwidecover IS MATCHING");
    			 else
    		    System.out.println("Worldwidecover IS not  MATCHING");
    		 
    		  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
    		  driver.findElement(By.id("nextsendquote")).click();
    	 
    	      break;
    	      
    	      
    	 case "Ultimate":
    		 actprice=driver.findElement(By.id("selectultimate_price")).getText();
    		 actonlineclaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")).getText();
    		 expclaimdiscount=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")).getText();
    		 actWorldwidecover=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
    	     
    		 if(actprice.equals(expprice)) 
    			 System.out.println("PRICE IS MATCHING");
    			 else
    		    System.out.println("PRICE IS MATCHING");	 
    		 
    		 if(actonlineclaim.equals(exponlineclaim)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	  
    	    
    		 if(expclaimdiscount.equals(expclaimdiscount)) 
    			 System.out.println("Onlineclaim IS MATCHING");
    			 else
    		    System.out.println("Onlineclaim IS not  MATCHING");
    	 
    	    
    		 if(actWorldwidecover.equals(Worldwidecover)) 
    			 System.out.println("Worldwidecover IS MATCHING");
    			 else
    		    System.out.println("Worldwidecover IS not  MATCHING");
    		 
    		  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
    		  driver.findElement(By.id("nextsendquote")).click();
    	 
    	      break;   
    }
  }
}    
      
      
      
      
      
      