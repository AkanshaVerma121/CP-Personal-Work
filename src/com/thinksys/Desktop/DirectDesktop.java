package com.thinksys.Desktop;


import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.*;

import net.bytebuddy.utility.RandomString;


public class DirectDesktop {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		 WebDriver driver= new ChromeDriver();

		 driver.get("https://www.match.com/");

		 
		 Select GGSdrpdn = new Select (driver.findElement(By.name("ggs")));
			GGSdrpdn.selectByIndex(2);
			driver.findElement(By.xpath("//button [@class = 'button button-primary']")).click(); 
			//List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'button button-primary']"));

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Random randomGenerator = new Random();  
			int randomInt = randomGenerator.nextInt(1000); 

			driver.findElement(By.id("emailField")).sendKeys("testakku"+ randomInt +"@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("autotest");

			Select Monthdrpdn = new Select (driver.findElement(By.name("birthMonth")));
			Monthdrpdn.selectByIndex(6);

			Select Yeardrpdn = new Select (driver.findElement(By.name("birthYear")));
			Yeardrpdn.selectByIndex(6);

			Select Daydrpdn = new Select (driver.findElement(By.id("birthDay")));
			Daydrpdn.selectByIndex(6);

			//List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'button button-primary']"));
			//System.out.println(element);

			//WebDriverWait wait = new WebDriverWait(driver, 120);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button [@class = 'button button-primary']")));

			driver.findElement(By.className("action")).click();

			//.click();
			
			 String Randmname = RandomStringUtils.randomAlphabetic(4); 
				driver.findElement(By.id("handleField")).sendKeys("test"+ Randmname +"akku");
				
				


			List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'ui-submit button button-primary btnRegister']"));

			element.get(1).click();



			//System.out.println(element.size());
			//driver.findElements(By.className("action register")).click();
	}

}
