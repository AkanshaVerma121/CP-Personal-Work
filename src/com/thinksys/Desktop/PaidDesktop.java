package com.thinksys.Desktop;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaidDesktop {
	
	public static void comparator(String expected, String actual) {
		 if (actual.contentEquals(expected))
         { System.out.println("Error message on empty Zip is correct. It is" +actual);}
        else
         {System.out.println("Error message is not correct");}
		
	    
	}
	
	
	
	public static void main(String[] args) {
		
	

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.match.com/cpx/en-us/landing/display/84123/");
		
		WebElement Clickbutton = driver.findElement(By.className("btn-progressive"));

		//Case 1: When Zip is empty
		
		Clickbutton.click();
		
		String ExpectedZiperror = "Please enter a valid zip/postal code.";
		String ZipError = driver.findElement(By.className("error")).getText();
		WebElement Zip = driver.findElement(By.id("zipField"));
		
		comparator(ExpectedZiperror,ZipError);
		
        
      //Case 2: When Zip is invalid

        Zip.sendKeys("ffbfdgdgf");
        Clickbutton.click();
        String ZipError2 = driver.findElement(By.className("error")).getText();
       
        comparator(ZipError2,ExpectedZiperror);
    
        
        
      //Case 3: When Zip is valid

        Zip.clear();
        Zip.sendKeys("75225");
		Clickbutton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("genderGenderSeek")));
		
		////////////// GGS Modal////////////

		List<WebElement> elements = driver.findElements(By.className("button"));
		elements.get(1).click();
		
		//Case: When GGS is left enpty//////
		
		String GGSError = driver.findElement(By.className("error")).getText();
		String ExpectedGGSError = "Please make a relationship selection.";
		
		if (GGSError.contentEquals(ExpectedGGSError))
        { System.out.println("Error message on blank GGS is correct. It is " +GGSError);}
        else
        {System.out.println("Error message on blank GGS is not correct");}
        
		
		 Select GGSdrpdn = new Select (driver.findElement(By.name("genderGenderSeek")));
		GGSdrpdn.selectByIndex(2);
		
		//driver.findElement(By.className("btn-view-photos btn-progressive")).click();
		elements.get(1).click();
		
		
		/////////////// Email Field////////////////
		
		//List<WebElement> element2 = driver.findElements(By.id("emailField"));
		//System.out.println("Number of elements" +element2.size()) ;
		
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailField")));
		elements.get(1).click();
		
		//Case1: When Email is empty/////
		
		String ExpectedEmailBlankerror = "Please enter an email address.";
		String ActualEmailBlankError = driver.findElement(By.className("error")).getText();
		
		if (ExpectedEmailBlankerror.contentEquals(ActualEmailBlankError))
        { System.out.println("Error message on blank Email is correct. It is " +ActualEmailBlankError);}
        else
        {System.out.println("Error message on blank Email is not correct");}
        
		
		// Case 2: When email is invalid //////
		
		
			
		driver.findElement(By.id("emailField")).sendKeys("invalid @ @ . . 4545");
		elements.get(1).click();
		
	
		// Case 3: When email is existing////
		
		driver.findElement(By.id("emailField")).clear();
		driver.findElement(By.id("emailField")).sendKeys("dec20@sc1.com");
		elements.get(1).click();

		// Case 4: Entered email is correct //////////////
		
		driver.findElement(By.id("emailField")).clear();		
		driver.findElement(By.id("emailField")).sendKeys("testakku"+ randomInt +"@gmail.com");
		elements.get(1).click();
	
		
		//// Modal 4: Password Field ////////

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordField")));
		
		
		// Case1: Password is empty /////
		
	   elements.get(1).click();
		
	   
	   // Case 2: Password is invalid /////
	   
	   driver.findElement(By.id("passwordField")).sendKeys("test@dfdf@54_*");
		elements.get(1).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Case3: Password is valid
		
		   driver.findElement(By.id("passwordField")).clear();
		   driver.findElement(By.id("passwordField")).sendKeys("autotest");
			elements.get(1).click();
		   
		   
		
	   

		/////////// Modal 5: DOB Modal ////////////////////

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthMonth")));
		
		// Case 1: All 3 fields empty ////////
		
		elements.get(1).click();
		
		//Case 2: Only Month Filled
		
		Select Monthdrp = new Select(driver.findElement(By.name("birthMonth")));
		Monthdrp.selectByIndex(2);
		elements.get(1).click();
		
	//Case 3: month and day Filled
		
		Select Daydrp = new Select(driver.findElement(By.name("birthDay")));
		Daydrp.selectByIndex(15);
		elements.get(1).click();
		
		// All 3 dropdown filleed /////////
		

		Select Yeardrp = new Select(driver.findElement(By.name("birthYear")));
		Yeardrp.selectByIndex(25);
		elements.get(1).click();


		////// lqst modal ///

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("handleField")));
		
		/// Case 1: Field is empty
		elements.get(1).click();
		
		/// Case2: Field is invalid
		driver.findElement(By.id("handleField")).sendKeys("testakku akky 22 @ @");
		elements.get(1).click();
		
		// Case 3: Handle is same as password
		driver.findElement(By.id("handleField")).clear();
		driver.findElement(By.id("handleField")).sendKeys("autotest");
		elements.get(1).click();
		
		// Case 4: Handle is valid
		
		String Randmname = RandomStringUtils.randomAlphabetic(4);
		driver.findElement(By.id("handleField")).sendKeys("test"+ Randmname +"av");
		elements.get(1).click();
		
		
		driver.close();
	
		}

		}




