package com.qa.testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamenterDemo {

	WebDriver driver;


@BeforeMethod
@Parameters({"url","browser"})
public void setUp(String url, String browser) {
	
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cp);
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			ChromeOptions cp = new ChromeOptions();
			cp.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
		}
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get(url);
}

@Test
@Parameters({"username","password"})
public void Login(String un, String pwd) {
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys(un);
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[text() = ' Login ']")).click();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}





}
