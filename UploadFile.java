package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
			System.setProperty("webdriver.chrome.drivr","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();   
			options.addArguments("--remote-allow-origins=*");
		    WebDriver driver= new ChromeDriver(options);
		    driver.manage().window().maximize();
		    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gclid=CjwKCAjwiOCgBhAgEiwAjv5whLCH45fajZS6jz9WBHOSE-pN81Ns_0e7YnNxdZ4EjbIRWz54EkBs8BoCs0IQAvD_BwE&gclsrc=aw.ds");
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abhay");
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC@123");
		    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567891");
		    driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		    Robot rb=new Robot();
		    rb.delay(1000);
		    
		    StringSelection ss=new StringSelection("C:\\Users\\Ashu\\Desktop\\Manual testing\\Fresher_Selenium_Resume");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    
		    rb.keyPress(KeyEvent.VK_CONTROL);
		    rb.keyPress(KeyEvent.VK_V);
		    
		    rb.keyPress(KeyEvent.VK_ENTER);
		    driver.close();
		    
	}

}
