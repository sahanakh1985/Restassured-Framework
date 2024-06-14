package practice.program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample9.html");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		String code = "document.getElementById('A4').value='Ravi'";
		j.executeScript(code);
		Thread.sleep(2000);
		String code2 = "document.getElementById('A4').value=' '";
		j.executeScript(code2);
	}

}
