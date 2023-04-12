package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdrivercommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.get("https://mbasic.facebook.com/reg");
		/*String title = driver.getTitle();
		System.out.println(title);
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		///System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("xyz...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@name='firstname']")).clear();
		
		//driver.findElement(By.xpath("//*[@name='submit']")).click();
		
		//String text = driver.findElement(By.xpath("//*[@id=\"firstname\"]/div")).getText();
		//System.out.println(text);
		
		boolean flag = driver.findElement(By.xpath("//*[text()='Female']//parent::label/input")).isSelected();
		
		System.out.println(flag);
		
		driver.findElement(By.xpath("//*[text()='Female']//parent::label/input")).click();
		
		boolean flag2 = driver.findElement(By.xpath("//*[text()='Female']//parent::label/input")).isSelected();
		
		System.out.println(flag2);
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Female']//parent::label/input")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Female']//parent::label/input")).isEnabled());
		
		
		int sizeofclass = driver.findElements(By.xpath("//*[@class = 'p']")).size();
		
		System.out.println(sizeofclass);
		
		
		//driver.findElement(By.xpath("//*[@name= 'lastname']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@name= 'lastname']")).sendKeys("ttttt");*/
		
		
		/*driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
		//driver.close();
		//driver.quit();
		
		driver.findElement(By.xpath("//*[@id='newTabBtn']")).click();
		//driver.close();
		driver.quit();*/
		
		driver.get("https://www.facebook.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to("https://www.amazon.in/");
		
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		
	
		
		
		
	}

}
