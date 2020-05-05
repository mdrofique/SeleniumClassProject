package com.login.automation.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apitesting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zoopla.co.uk/");
//	System.out.println(driver.getTitle());
	//WebElement submit=driver.findElementByXPath("//*[@type='submit']");
}   

}


