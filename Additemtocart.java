package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Additemtocart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivr","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(options);
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pens");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.findElement(By.linkText("Paper Mate Flair Felt Tip Pens, Medium Point (0.7mm), Assorted Colors, 12 Count")).click();
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
        

	}

}
