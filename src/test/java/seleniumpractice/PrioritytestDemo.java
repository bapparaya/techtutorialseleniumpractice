package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrioritytestDemo {

	WebDriver driver;

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(cp);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Test(priority=1)
public void verifya() {
	String title = driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
}

@Test
public void verifyc() {
	boolean logoflg = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/div/img")).isDisplayed();
	System.out.println(logoflg);
}

@Test
public void verifyb() {
	boolean forlink = driver.findElement(By.xpath("//*[text()='Forgot your password? ']")).isDisplayed();
	System.out.println(forlink);
}

@Test(priority=2)
public void verifye() {
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin1");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin1231");
}

@Test(priority=3)
public void verifyd() {
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
}



@AfterMethod
public void tearDown() {
	driver.quit();
}


}
