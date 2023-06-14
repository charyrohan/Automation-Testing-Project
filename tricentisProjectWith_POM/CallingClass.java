package tricentisProjectWith_POM;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class CallingClass {
  WebDriver driver;
  //Automobile
  EnterVehicleDataAutomobile Vdata;
  EnterVehicalDataTruck Tdata;
  EnterVehicalDataMotocycle Mdata;
  EnterVehicalDataCamper Cdata;
  
  EnterInsurantData Edata;
  EnterProductData  Pdata;
  SelectPriceOption Silver;
  SendQuote  Squote;
  String ExpPrice, ExpOnlineClaim,ExpClaimDisc,ExpWWCover,type                                                       ;
  
  //truck
  
  
  //MotorCycle
  
  
  
  
  @Test(dataProvider="getAutomobileData" ,priority=1) 
  public void AutomobileTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type)  
	{                                   
	  //Vehicaldata
	  System.out.println("\nTesting Automobile\n");
	  driver.findElement(By.id("nav_automobile")).click();	
	  Vdata.vehical_make("Honda");
	  Vdata.EnginePerformance("1000");
	  Vdata.DateofManufacture("01/18/2015");
	  Vdata.NumberofSeats("4");
	  Vdata.FuelType("Petrol");
	  Vdata.ListPrice("5000");
	  Vdata.LicensePlateNumber("007");
	  Vdata.AnnualMileage("100");
	  Vdata.nxtButton();
	  
	  //insurantdata
	  Edata.firstName("Rohan");
	  Edata.LastName("Chari");
	  Edata.DateOfBirth("01/18/1997");
	  Edata.Gender();
	  Edata.StreetAddress("near new hospital");
	  Edata.Country("India");
	  Edata.ZipCode("403507");
	  Edata.City("Ponda");
	  Edata.Occupation("Employee");
	  Edata.Hobbies();
	  
	  //Productdata
	  Pdata.StartDate("08/03/2023");
	  Pdata.InsuranceSum("3000000");
	  Pdata.MeritRating("Super Bonus");
	  Pdata.DamageInsurance("Full Coverage");
	  Pdata.OptionalProducts();
	  Pdata.CourtesyCar("No");
	  
	  //SILVERPRICE
	 
	  Silver.CheckPrice(ExpPrice, ExpOnlClaim,ExpClaimDisc,ExpWWCover, Type);
	  //Silver.CheckPrice("660.00", "Submit", "2", "Limited", "Gold");
	  //Silver.CheckPrice("1,296.00", "Submit", "5", "Limited", "Platinum");
	  //Silver.CheckPrice("2,469.00", "Submit", "10", "Unlimited", "Ultimate");
	   
	  //SendQuote
	  Squote.Email("Test@gamil.com");
	  Squote.Phone("9882554378");
	  Squote.Username("Chary");
	  Squote.Password("Test@123");
	  Squote.ConfirmPassword("Test@123");
	  Squote.ClickSend();
	
  }
  
  @DataProvider
    public Object[][]getAutomobileData(){
    	
    	return (new Object[][] {
    		
    		new Object[] {"276.00", "No", "No", "No", "silver"},
    		new Object[] {"660.00", "Submit", "2", "Limited", "Gold"},
    		new Object[] {"1,296.00", "Submit", "5", "Limited", "Platinum"},
    		new Object[] {"2,469.00", "Submit", "10", "Unlimited", "Ultimate"},
       });
    }
  
  
  @Test(dataProvider="getTruckdata",priority=2)
  public void TruckTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type)
  {
	  //vehicaltruckdata
	  System.out.println("\nTesting truck\n");
	  driver.findElement(By.linkText("Truck")).click();
	  Tdata.vehical_TMake("Volvo");
	  Tdata.vehical_TEnginePerformance("1000");
	  Tdata.vehical_TDateofManufacture("01/18/2007");
	  Tdata.vehical_TNumberofSeats("2");
	  Tdata.vehical_TFuelType("Diesel");
	  Tdata.vehical_TPayload("1000");
	  Tdata.vehical_TotalWeight("50000");
	  Tdata.vehical_ListPrice("10000");
	  Tdata.vehical_LicensePlateNumber("23287");
	  Tdata.vehical_AnnualMileage("1000");
	  Tdata.nextbuttontruck();
	  
	  //insurantdataTruck
	  Edata.firstName("Rohan");
	  Edata.LastName("Chari");
	  Edata.DateOfBirth("01/18/1997");
	  Edata.Gender();
	  Edata.StreetAddress("near new hospital");
	  Edata.Country("India");
	  Edata.ZipCode("403507");
	  Edata.City("Ponda");
	  Edata.Occupation("Employee");
	  Edata.Hobbies();
	  
	  //ProductdataTruck
	  Pdata.StartDate("08/03/2023");
	  Pdata.InsuranceSum("3000000");
	  Pdata.DamageInsurance("Full Coverage");
	  Pdata.OptionalProductsTRUCK();
	  Pdata.nextselectpriceoption();
	  
	  Silver.CheckPrice(ExpPrice, ExpOnlClaim,ExpClaimDisc,ExpWWCover, Type);
	  
	//SendQuote
	  Squote.Email("Test@gamil.com");
	  Squote.Phone("9882554378");
	  Squote.Username("Chary");
	  Squote.Password("Test@123");
	  Squote.ConfirmPassword("Test@123");
	  Squote.ClickSend();
	
}
  
  @DataProvider
  public Object[][]getTruckdata(){
  	
  	return (new Object[][] {
  		
  		new Object[] {"319.00", "No", "No", "No", "silver"},
  		new Object[] {"941.00", "Submit", "2", "Limited", "Gold"},
  		new Object[] {"1,848.00", "Submit", "5", "Limited", "Platinum"},
  		new Object[] {"3,521.00", "Submit", "10", "Unlimited", "Ultimate"},
     });
  }
  
  
  @Test(dataProvider="GetMotorCycledata", priority=3)
	  public void MotorcycleTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type) {
		
	 //vehicalMotorCycledata
	  System.out.println("\nMotorCycle Testing\n");
	  driver.findElement(By.linkText("Motorcycle")).click();
	  Mdata.vehical_Mmake("BMW");
      Mdata.vehical_MOTORCYCLEModel("Motorcycle");	 
      Mdata.vehical_MCylinderCapacity("1000");
      Mdata.MEnginePerformance("1000");
      Mdata.MDateofManufacture("03/10/2007");
      Mdata.MNumberofSeats("2");
      Mdata.MListPrice("2000");
      Mdata.MAnnualMileage("100");
      Mdata.nxtButton();
  
	//insurantdataMotorcycle
	  Edata.firstName("Rohan");
	  Edata.LastName("Chari");
	  Edata.DateOfBirth("01/18/1997");
	  Edata.Gender();
	  Edata.StreetAddress("near new hospital");
	  Edata.Country("India");
	  Edata.ZipCode("403507");
	  Edata.City("Ponda");
	  Edata.Occupation("Employee");
	  Edata.Hobbies();
	  
	//ProductdataMotocycle
	  Pdata.StartDate("08/03/2023");
	  Pdata.InsuranceSum("3000000");
	  Pdata.DamageInsurance("Full Coverage");
	  Pdata.OptionalProductsMotoCycle();
	  Pdata.nextselectpriceoption();
	  
	  Silver.CheckPrice(ExpPrice, ExpOnlClaim,ExpClaimDisc,ExpWWCover, Type);
	  
		//SendQuote
		  Squote.Email("Test@gamil.com");
		  Squote.Phone("9882554378");
		  Squote.Username("Chary");
		  Squote.Password("Test@123");
		  Squote.ConfirmPassword("Test@123");
		  Squote.ClickSend();
   }
  
 
  @DataProvider
  public Object[][]GetMotorCycledata(){
	  	
	  	return (new Object[][] {
	  		
	  		new Object[] {"319.00", "No", "No", "No", "silver"},
	  		new Object[] {"941.00", "Submit", "2", "Limited", "Gold"},
	  		new Object[] {"1,848.00", "Submit", "5", "Limited", "Platinum"},
	  		new Object[] {"3,521.00", "Submit", "10", "Unlimited", "Ultimate"},
	     });
	  }
    
  
  @Test(dataProvider="GetCamperdata",priority=4)
  public void CamperTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type) {
  
  //vehivalCamperdata
  System.out.println("\nTesting Camper");
  driver.findElement(By.linkText("Camper")).click();
  Cdata.CamperMake("Ford");	
  Cdata.CamperEnginePerformance("1000");
  Cdata.CamperDateofManufacture("03/18/2007");
  Cdata.CamperNumberofSeats("2");
  Cdata.CamperRightHandDrive();
  Cdata.CamperFuelType("Petrol");
  Cdata.CamperPayload("1000");
  Cdata.CamperTotalWeight("1000");
  Cdata.CamperListPrice("1000");
  Cdata.CamperLicensePlateNumber("2020");
  Cdata.CamperAnnualMileage("1000");
  Cdata.Campernextinsurantdata();
  
//insurantdataCamper
  Edata.firstName("Rohan");
  Edata.LastName("Chari");
  Edata.DateOfBirth("01/18/1997");
  Edata.Gender();
  Edata.StreetAddress("near new hospital");
  Edata.Country("India");
  Edata.ZipCode("403507");
  Edata.City("Ponda");
  Edata.Occupation("Employee");
  Edata.Hobbies();
  
//ProductdataCamper
  Pdata.StartDate("08/03/2023");
  Pdata.InsuranceSum("3000000");
  Pdata.DamageInsurance("Full Coverage");
  Pdata.OptionalProductsMotoCycle();
  Pdata.nextselectpriceoption();
  
  Silver.CheckPrice(ExpPrice, ExpOnlClaim,ExpClaimDisc,ExpWWCover, Type);
  
	//SendQuote
	  Squote.Email("Test@gamil.com");
	  Squote.Phone("9882554378");
	  Squote.Username("Chary");
	  Squote.Password("Test@123");
	  Squote.ConfirmPassword("Test@123");
	  Squote.ClickSend();  
  }
  
  
  @DataProvider
  public Object[][]GetCamperdata(){
	  	
	  	return (new Object[][] {
	  		
	  		new Object[] {"270.00", "No", "No", "No", "silver"},
	  		new Object[] {"797.00", "Submit", "2", "Limited", "Gold"},
	  		new Object[] {"1,565.00", "Submit", "5", "Limited", "Platinum"},
	  		new Object[] {"2,982.00", "Submit", "10", "Unlimited", "Ultimate"},
	     });
	  }
  
  @BeforeTest
  public void beforeTest() {
  
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
   	  driver = new ChromeDriver(options);		
	  driver.manage().window().maximize();
	 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	   
	  driver.get("http://sampleapp.tricentis.com/101/index.php#");
	 
        Vdata=new EnterVehicleDataAutomobile(driver);
	    Tdata=new  EnterVehicalDataTruck(driver);
	    Mdata=new  EnterVehicalDataMotocycle(driver);
	    Cdata=new  EnterVehicalDataCamper(driver);
	    Edata=new EnterInsurantData (driver);
	    Pdata=new EnterProductData (driver);
	    Silver=new SelectPriceOption(driver);
	    Squote=new SendQuote(driver); 
  }

 
  @AfterTest
  public void afterTest() {
  
     driver.quit();
  }

}
