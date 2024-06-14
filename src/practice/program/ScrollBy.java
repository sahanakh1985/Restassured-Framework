package practice.program;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);

		}
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(1000);
		}
	}

}
