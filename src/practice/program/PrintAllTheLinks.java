package practice.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTheLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			String text = link.getText();

			System.out.print(i + " ");
			boolean displayed = link.isDisplayed();
			System.out.print(displayed + " ");
			System.out.println(text);

		}
		driver.quit();
	}

}
