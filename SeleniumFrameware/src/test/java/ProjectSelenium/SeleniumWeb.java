package ProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWeb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
		
		WebElement name=driver.findElement(By.xpath("//*[@type='text']"));
		name.sendKeys("rafique2009@yahoo.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("r020281i");
		
		WebElement signin=driver.findElement(By.xpath("//*[@type='image']"));
		
	    signin.click();

		

	}

}
