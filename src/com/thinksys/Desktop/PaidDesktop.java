package com.thinksys.Desktop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaidDesktop {
	
	public static void main(String[] args) {

		String ExpectedZiperror = "Please enter a valid zip/postal code.";
		String ExpectedGGSerror = "Please make a relationship selection.";

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.match.com/cpx/en-us/landing/display/84123/");

		WebElement Zip = driver.findElement(By.id("zipField"));
		WebElement Clickbutton = driver.findElement(By.className("btn-progressive"));

		///////////////////////  MOdal 1: ZIP /////////////////////////////////////////////

		//Case 1: When Zip is empty

		Clickbutton.click();
		String ZipError = driver.findElement(By.className("error")).getText();
		               if (ZipError.contentEquals(ExpectedZiperror))
		                { System.out.println("Error message on empty Zip is correct. It is" +ZipError);}
		               else
		                {System.out.println("Error message on Zip is not correct");}

		//Case 2: When Zip is invalid

		Zip.sendKeys("ffbfdgdgf");
		Clickbutton.click();
		String ZipError2 = driver.findElement(By.className("error")).getText();
		if (ZipError2.contentEquals(ExpectedZiperror))
		{ System.out.println("Error message on invalid Zip is correct. It is " +ZipError2);}
		else
		{System.out.println("Error message on invalid Zip is not correct");}

		//Case 3: When Zip is valid

		Zip.clear();
		Zip.sendKeys("75225");
		Clickbutton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		///////////////// Modal 2: GGS ///////////////////////
	    List<WebElement> e1 = driver.findElements(By.id("genderGenderSeek"));
	    System.out.println(e1);
	
		
		Select GGSdrp = new Select(driver.findElement(By.id("genderGenderSeek")));
		GGSdrp.selectByIndex(2);
		/////////Modal 3: Email Modal //////////////////////////

	/*
	driver.findElement(By.id("emailField")).sendKeys("hjgashujh@dgmaild.com");

		WebElement Emailbutton = driver.findElement(By.xpath("//img[@src = 'https://securecp.match.com//cppp/floatingreg/images/ctnbtn.png']"));
		Emailbutton.click();

		//// Modal 4: Password Field ////////

		driver.findElement(By.id("passwordField")).sendKeys("test");

		WebElement Passwordbutton = driver.findElement(By.xpath("//img[@src = 'https://securecp.match.com//cppp/floatingreg/images/ctnbtn.png']"));
		Passwordbutton.click();

		/////////// Modal 5: DOB Modal ////////////////////


		List<WebElement> ele =  driver.findElements(By.name("birthMonth"));
		System.out.println(ele.size());

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthMonth")));

		Select Monthdrp = new Select(driver.findElement(By.name("birthMonth")));
		Monthdrp.selectByIndex(2);

		Select Daydrp = new Select(driver.findElement(By.name("birthDay")));

		Daydrp.selectByIndex(15);

		Select Yeardrp = new Select(driver.findElement(By.name("birthYear")));
		Yeardrp.selectByIndex(25);


		WebElement Dobbutton = driver.findElement(By.xpath("//img[@src = 'https://securecp.match.com//cppp/floatingreg/images/ctnbtn.png']"));
		Dobbutton.click();


		////// lqst modal ///

		driver.findElement(By.id("handleField")).sendKeys("hggj");
		driver.findElement(By.xpath("//img[@src = 'https://securecp.match.com//cppp/floatingreg/images/ctnbtn.png']")).click();;


		//List<WebElement> elements = driver.findElements(By.xpath("//img[@src = 'https://securecp.match.com//cppp/floatingreg/images/ctnbtn.png']"));
		//System.out.println("Number of elements" +elements.size()) ;
		//System.out.println("Number of elements:" +listOfElements.size());
		
		
		*/
		}

		}




