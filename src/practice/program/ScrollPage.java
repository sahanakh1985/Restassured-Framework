package practice.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.actimind.com");
		WebElement interactivePrototype = driver.findElement(By.xpath("//div[text()='Interactive Prototyping']"));
		int y = interactivePrototype.getLocation().getY();
		System.out.println(y);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0," + y + ")");

	}

}
