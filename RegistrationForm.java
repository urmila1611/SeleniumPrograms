package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivr", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Abhay");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='nf-field-20']")).sendKeys("1234567891");

		WebElement choosecourse = driver.findElement(By.xpath("//select[@id='nf-field-22']"));
		Select course = new Select(choosecourse);
		course.selectByVisibleText("Selenium Automation");

		WebElement choosemonth = driver.findElement(By.xpath("//select[@id='nf-field-24']"));
		Select month = new Select(choosemonth);
		month.selectByVisibleText("June");

		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-1']")).click();
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();

	}

}
