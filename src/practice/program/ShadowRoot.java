package practice.program;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample10.html");
		SearchContext shadowRoot = driver.findElement(By.id("shadow_host")).getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#t1")).sendKeys("sahana");

		shadowRoot.findElement(By.cssSelector("#c1")).click();
	}

}
