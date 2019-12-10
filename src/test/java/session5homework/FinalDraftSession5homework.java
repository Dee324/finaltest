package session5homework;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FinalDraftSession5homework{
	
@Test
	
	public void homework() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	;		
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=login/");		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("abc123");	
	driver.findElement(By.name("login")).click();	
	WebDriverWait wait=new WebDriverWait(driver,5);
	
	// Store an Element
	WebElement PAGE_TITLE_ELEMENT= driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	//OR
	By PAGE_TITLE_LOCATOR=By.xpath("//h2[contains(text(),'Dashboard')]");
	
	Assert.assertTrue("Dashboard Title did not display!", PAGE_TITLE_ELEMENT .isDisplayed());
	
	driver.findElement(By.xpath("//*[contains(text(),'Bank & Cash')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
     Thread.sleep(2000);
	driver.findElement(By.id("account")).sendKeys("abcdefgh");
	driver.findElement(By.id("description")).sendKeys("checking");
	driver.findElement(By.id("balance")).sendKeys("$10.00");
	Thread.sleep(5,000);	
	
 driver.findElement(By.xpath("//button[contains(text(), ' Submit')]	")).click();	
	
Assert.assertTrue("Account Created Successfully", PAGE_TITLE_ELEMENT .isDisplayed());
	


	
	
}

	private void click() {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
   

     

