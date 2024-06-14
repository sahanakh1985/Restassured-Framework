import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("<a class="vglnk" href="http://www.google.com"
		// rel="nofollow"><span>http</span><span>://</span><span>www</span><span>.</span><span>google</span><span>.</span><span>com</span></a>");

		driver.get("https://www.google.com");
	}
}