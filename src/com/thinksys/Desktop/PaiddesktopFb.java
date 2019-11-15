package com.thinksys.Desktop;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaiddesktopFb {
	
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
		
		List<WebElement> elements = driver.findElements(By.className("button"));
		elements.get(1).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button-m-facebook")));
	    driver.findElement(By.className("button-m-facebook")).click();
	    
	    // FB Existing user
	    driver.findElement(By.id("email")).sendKeys("jilqrmcvza_1572851787@tfbnw.net");
	    driver.findElement(By.id("pass")).sendKeys("autotest");
	    driver.findElement(By.id("loginbutton")).click();
	    

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button-m-facebook")));
	    //driver.findElement(By.id("emailField")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailField")));
	    driver.findElement(By.id("emailField")).sendKeys("hjghgjygjh@dfdf.com");
	    //elements.get(1).click();
	    List<WebElement> element1 = driver.findElements(By.className("button"));
	    System.out.println(element1.size());
	    element1.get(1).click();
	    
		/// Modal 4: Password Field ///

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordField")));
		driver.findElement(By.id("passwordField")).sendKeys("test");
		 element1.get(1).click();
	
		/// Modal 5: DOB Modal ///

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthMonth")));

		Select Monthdrp = new Select(driver.findElement(By.name("birthMonth")));
		Monthdrp.selectByIndex(2);

		Select Daydrp = new Select(driver.findElement(By.name("birthDay")));

		Daydrp.selectByIndex(15);

		Select Yeardrp = new Select(driver.findElement(By.name("birthYear")));
		Yeardrp.selectByIndex(25);
		 element1.get(1).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("handleField")));
	
		 element1.get(1).click();
		
		
}
}
