package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {

	WebDriver driver;

	@Test
	public void titletest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions(); // this is new for new updated chrome version
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://live.techpanda.org/index.php/");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Home page";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

	@Test
	public void pagetitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String acttitle = driver.getTitle();
		String exptitle = "Mobile";
		Assert.assertEquals(acttitle, exptitle);
		driver.close();
	}

	@Test
	public void SortByName() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		WebElement sortby = driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
		Select sort = new Select(sortby);
		sort.selectByVisibleText("Name");
		driver.close();

	}
}