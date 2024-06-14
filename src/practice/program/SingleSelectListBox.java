package practice.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/dell/Documents/Sample15.html");
		WebElement listbox = driver.findElement(By.id("A1"));

		Select select = new Select(listbox);
		select.selectByIndex(1);

		List<WebElement> allOptions = select.getOptions();

		int count = allOptions.size();
		System.out.println(count);
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);

		}
		System.out.println("______________________________");
		WebElement element = select.getWrappedElement();
		String text = element.getText();
		System.out.println(text);
		driver.quit();

	}

}
