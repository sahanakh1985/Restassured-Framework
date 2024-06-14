package practice.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Parameters({ "browser" })
	@Test
	public void testA(@Optional("chrome") String browser) throws InterruptedException {
		WebDriver driver;
		Reporter.log(browser, true);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().setPosition(new Point(700, 10));
		}

		driver.manage().window().setSize(new Dimension(600, 600));

		driver.get("https://online.actitime.com/skh/login.do\r\n" + "");
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("username")).sendKeys("sahana");
			Thread.sleep(500);
		}

		driver.quit();
	}
}
