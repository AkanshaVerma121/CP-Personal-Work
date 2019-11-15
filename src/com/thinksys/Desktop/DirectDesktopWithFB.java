package com.thinksys.Desktop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DirectDesktopWithFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		 WebDriver driver= new ChromeDriver();

		 driver.get("https://www.match.com/");
		 
		 Select GGSdrpdn = new Select (driver.findElement(By.name("ggs")));
			GGSdrpdn.selectByIndex(2);
			driver.findElement(By.xpath("//button [@class = 'button button-primary']")).click(); 
			//List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'button button-primary']"));

//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*	List<WebElement> element1 =	driver.findElements(By.id("fbDiv"));
			System.out.println(element1);
			List<WebElement> element2 = driver.findElements(By.className("active left"));
			System.out.println(element2);
			
			List<WebElement> element3 = driver.findElements(By.id("chooseFacebook"));
			System.out.println(element3);
			List<WebElement> element4 = driver.findElements(By.className("class=left"));
			System.out.println(element4);
			List<WebElement> element5 = driver.findElements(By.className("facebookLogin"));
			System.out.println(element5);
			
			List<WebElement> element6 = driver.findElements(By.className("fb-login"));
			System.out.println(element6);*/
			
			List<WebElement> element7 = driver.findElements(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/div"));
			System.out.println(element7);
	}

}
