package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handlealerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple alert
		//driver.findElement(By.xpath("//*[@id='alertBox']")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		//confirmation alert
		/*driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		//alert.accept();
		alert.dismiss();*/
		
		//prompt alert
		
		driver.findElement(By.xpath("//*[@id='promptBox']")).click();
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Alert alert = driver.switchTo().alert();
		
		//alert.sendKeys("automation");
		
		
		//System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		
		
		

	}

}
