package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGforgoogle {

	WebDriver driver;


@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(cp);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://en-gb.facebook.com/login/");
}

@Test
public void verifyTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Log in to Facebook1");
}

@AfterMethod
public void close() {
	driver.quit();
}






}
