import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		options.setLogLevel(FirefoxDriverLogLevel.TRACE);

		WebDriver driver = new FirefoxDriver(options);

		driver.get("http://google.com");

		driver.quit();
	}
}
