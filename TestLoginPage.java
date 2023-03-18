package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivr","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(options);
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("student");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.id("submit")).click();

	}

}
