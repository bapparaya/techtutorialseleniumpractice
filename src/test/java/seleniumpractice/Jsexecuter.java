package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Jsexecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.id("persistent")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement checkbox = driver.findElement(By.id("persistent"));
		System.out.println(checkbox.isSelected());
		js.executeScript("arguments[0].click()", checkbox);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(checkbox.isSelected());
		//js.executeScript("alert('checkbox is unchecked')");
		//js.executeScript("prompt('checkbox is unchecked')");
		
		//js.executeScript("confirm('records are not available')");
		
		driver.close();

	}

}
