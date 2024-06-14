package practice.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogout {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000);
		// enter valid user name (Admin)
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		// enter valid password (admin123)
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
