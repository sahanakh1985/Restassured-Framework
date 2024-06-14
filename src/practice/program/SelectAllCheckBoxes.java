package practice.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample14.html");

		List<WebElement> allCkbx = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int count = allCkbx.size();
		System.out.println(count);

		for (WebElement checkBox : allCkbx) {
			checkBox.click();
			Thread.sleep(500);
		}

		for (int i = count - 1; i >= 0; i--) {
			allCkbx.get(i).click();
			Thread.sleep(500);

		}

		for (int i = 0; i < count; i += 2) {
			allCkbx.get(i).click();
			Thread.sleep(500);

		}

		for (int i = count - 1; i >= 0; i -= 2) {
			allCkbx.get(i).click();

		}

	}

}
