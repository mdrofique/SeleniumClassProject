package ProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver/.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		WebElement cookie=driver.findElement(By.xpath("//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]"));
		cookie.click();
		
		WebElement signinbtn=driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']"));
		signinbtn.click();
		
		WebElement email=driver.findElement(By.xpath("//*[@type='email']"));
		email.sendKeys("sreaz2002@gmail.com");
		
		
		WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("Reaz00201083@");
		//*[@id='signin_submit']
		WebElement signin=driver.findElement(By.xpath("//*[@id='signin_submit']"));
		signin.click();
		
         System.out.println("Page Title is="+driver.getTitle());
         String ExpTitle="Zoopla &gt; Search Property to Buy, Rent, House Prices, Estate Agents";
         String ActualTitle=driver.getTitle();
         
         if(ExpTitle.equals(ActualTitle)==true)
            {
         System.out.println("The test is Passed ");
	        }
         else {
        	 System.out.println("The test is Failed");
         }
         }

}