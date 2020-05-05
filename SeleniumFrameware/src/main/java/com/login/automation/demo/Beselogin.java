package com.login.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.google.j2objc.annotations.ReflectionSupport.Level;
import com.mongodb.diagnostics.logging.Logger;



public class Beselogin {
	

	public static void main1(String[] args) {	
		
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			//System.setProperty(ChromeDriverService.chrome.Driver.silet."true");
       // Logger.getLogger("argument[0].setAttribute()'style',").'background:blue;border:2px solid red;');
			
			
			WebDriver driver = new ChromeDriver();// upcasting polymorphism
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait ===> HTML DOM page(slow down automation)
			driver.get("http://automationpractice.com/index.php");
			System.out.println(driver.getTitle());//Home page
		
			WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			//Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			
			
			WebDriver obj = new ChromeDriver();// upcasting polymorphism
			obj.manage().window().maximize();
			obj.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait ===> HTML DOM page(slow down automation)
			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// pageload timeout==> all object in a page is loaded or not
			
	
	
	
	
	}

}
