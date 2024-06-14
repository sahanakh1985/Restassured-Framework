package practice.program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("java");
		Thread.sleep(1000);
		String xp = "//span[contains(text(),'java')]";
		List<WebElement> allATS = driver.findElements(By.xpath(xp));
		int count = allATS.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = allATS.get(i).getText();
			System.out.println(text);
		}
		String expected = "java interview questions";
		for (int i = 0; i < count; i++) {
			String text = allATS.get(i).getText();
			if (expected.equals(text)) {
				allATS.get(i).click();
				break;

			}

		}
		Thread.sleep(2000);
		driver.quit();

	}

}
