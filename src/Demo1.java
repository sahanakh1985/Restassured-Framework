
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	//AutoSuggestion

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		String xp = "//span[contains(text(),'java')]";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));

		int count = allASE.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = allASE.get(i).getText();
			System.out.println(text);
		}

		Thread.sleep(1000);
//			allASE.get(0).click();  //select 1st AS

//			allASE.get(count-1).click();//select last AS

		String expected = "java interview questions";
		for (int i = 0; i < count; i++) {
			String text = allASE.get(i).getText();
			if (expected.equals(text)) {
				allASE.get(i).click();
				break;
			}
		}

		driver.quit();
	}
}
