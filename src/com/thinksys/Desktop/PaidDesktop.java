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
	
	public static void main(String[] args) {
		
	

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.match.com/cpx/en-us/landing/display/84123/");

		WebElement Clickbutton = driver.findElement(By.className("btn-progressive"));
		WebElement Zip = driver.findElement(By.id("zipField"));
        Zip.sendKeys("75225");
		Clickbutton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("genderGenderSeek")));

		 Select GGSdrpdn = new Select (driver.findElement(By.name("genderGenderSeek")));
		GGSdrpdn.selectByIndex(2);
		
		//driver.findElement(By.className("btn-view-photos btn-progressive")).click();
		List<WebElement> elements = driver.findElements(By.className("button"));
		elements.get(1).click();
		
		//List<WebElement> element2 = driver.findElements(By.id("emailField"));
		//System.out.println("Number of elements" +element2.size()) ;
		
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailField")));
		driver.findElement(By.id("emailField")).sendKeys("testakku"+ randomInt +"@gmail.com");
		elements.get(1).click();
	
		
		//// Modal 4: Password Field ////////

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordField")));
		driver.findElement(By.id("passwordField")).sendKeys("test");
		elements.get(1).click();
	

		/////////// Modal 5: DOB Modal ////////////////////

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthMonth")));

		Select Monthdrp = new Select(driver.findElement(By.name("birthMonth")));
		Monthdrp.selectByIndex(2);

		Select Daydrp = new Select(driver.findElement(By.name("birthDay")));

		Daydrp.selectByIndex(15);

		Select Yeardrp = new Select(driver.findElement(By.name("birthYear")));
		Yeardrp.selectByIndex(25);
		elements.get(1).click();


		////// lqst modal ///

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("handleField")));
		String Randmname = RandomStringUtils.randomAlphabetic(4);
		driver.findElement(By.id("handleField")).sendKeys("test"+ Randmname +"av");
		elements.get(1).click();
		
	
		}

		}




