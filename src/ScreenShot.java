import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5);
		driver.get("https://news.google.com");
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcImfFile = t.getScreenshotAs(OutputType.FILE);
		File dstImgFile = new File("./Image/news.png");
		FileUtils.copyFile(srcImfFile, dstImgFile);
		driver.quit();

	}

}
