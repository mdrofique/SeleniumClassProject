package ProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Zoopla {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement cookie=driver.findElement(By.xpath("//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]"));
         cookie.click();
       WebElement signinbtn=driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']"));
       signinbtn.click();
       WebElement email=driver.findElement(By.xpath("//*[@id='signin_email']"));
      email.sendKeys("rafique2009@yahoo.com");
      WebElement passowrd=driver.findElement(By.xpath("//*[@id='signin_password']"));
      passowrd.sendKeys("r020281i");
      WebElement signin=driver.findElement(By.xpath("//*[@id='signin_submit']"));
      signin.click();
      
 
       System.out.println("page Title is="+driver.getTitle());
       //driver.close();
       
       
       


	}

}
