package Practice;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivr", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		// First Name
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Abhay");
		// Last Name
		driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("Patel");
		// Gender
		driver.findElement(By.xpath("//input[@id='vfb-31-1']")).click();
		// Address
		driver.findElement(By.xpath("//input[@id='vfb-13-address']")).sendKeys("Mumbai");
		// Street address
		driver.findElement(By.xpath("//input[@id='vfb-13-address-2']")).sendKeys("Marine Drive");
		// City
		driver.findElement(By.xpath("//input[@id='vfb-13-zip']")).sendKeys("Mumbai");
		// Select Country
		driver.findElement(By.xpath(
				"//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/ul[1]/li[4]/div[1]/span[6]/span[1]/span[1]/span[1]"))
				.click();
		List<WebElement> Countrylist = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
		for (WebElement Country : Countrylist) {
			if (Country.getText().equals("India")) {
				Country.click();
				break;
			}
		}

        // Email
		driver.findElement(By.xpath("//input[@id='vfb-14']")).sendKeys("xyz@gmail.com");
		// date of Demo
		String year = "April 2023";
		String date = "1";
		driver.findElement(By.xpath("//input[@id='vfb-18']")).click();
		Thread.sleep(2000);
		while (true) {
			String text = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]")).getText();
			if (text.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}

			driver.findElement(By.xpath("//tbody/tr/td/a[contains(text()," + date + ")]")).click();

		}

		// Convenient time
		driver.findElement(By.xpath(
				"//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/ul[1]/li[7]/span[1]/span[1]/span[1]/span[1]/span[2]"))
				.click();
		List<WebElement> HHtime = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
		for (WebElement HH : HHtime) {
			if (HH.getText().equals("02")) {
				HH.click();
				break;
			}
		}

		driver.findElement(By.xpath(
				"//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/ul[1]/li[7]/span[2]/span[1]/span[1]/span[1]/span[2]"))
				.click();
		List<WebElement> MMtime = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
		for (WebElement MM : MMtime) {
			if (MM.getText().equals("10")) {
				MM.click();
				break;
			}
		}

		// Mobile number
		driver.findElement(By.xpath("//input[@id='vfb-19']")).sendKeys("123456789");
		// Course Interested
		driver.findElement(By.xpath("//input[@id='vfb-20-0']")).click();
		// Enter your query
		driver.findElement(By.xpath("//textarea[@id='vfb-23']")).sendKeys("NA");
		// Verification
		driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("99");

	}

}
