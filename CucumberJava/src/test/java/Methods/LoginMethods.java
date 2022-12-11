package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginMethods {
	final static WebDriver driver = new ChromeDriver();
	
	static String URL = "https://www.hudl.com/";
	static String chromedriverLocation = "...\\chromedriver_win32\\chromedriver.exe";
	
	public static String actualTitle = driver.getTitle();
	
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", chromedriverLocation);
		driver.get("https://www.hudl.com/");
	}
	
	public static void GetHomePage() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://static.hudl.com/craft/home/homepage-us-hero_short.png?mtime=20220829103413')]")));
	}
	
	public static void GetLoginPage() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".styles_pageContainer_31NnIgZuiQzDKnKlPaGLsi")));
	}

	public static void ClickLogin() {
		driver.findElement(By.linkText("Log in")).click();
	}

	public static void EnterUsername(String username) {
		driver.findElement(By.id("email")).sendKeys(username);
	}

	public static void EnterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public static void SubmitLogin () {
		driver.findElement(By.id("logIn")).click();
	}
	
	public static void GetWelcomePage() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("home-content")));
	}

	public static void CloseBrowser() {
		driver.quit();
	}

}
