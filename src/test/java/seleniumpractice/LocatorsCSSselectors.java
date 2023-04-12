package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsCSSselectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");
		
		//tag and id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		//tag and class
		
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector(""))
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector("[type=submit]")).click();
		
		//tag,class and attribute
		//driver.findElement(By.cssSelector("input.nav-input[id=twotabsearchtextbox]")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector(".nav-input[type=submit]")).click();
		
		//abosule xpath
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("1234");
		
		//relative xpath
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pqrst");
		//driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//and and or oparatoers
		//driver.findElement(By.xpath("//*[@type='text' or  @name ='email1']")).sendKeys("1234");
		//driver.findElement(By.xpath("//*[@id='pass' and @name ='pass1']")).sendKeys("qwert");
		
		//driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("123");
		//driver.findElement(By.xpath("//*[starts-with(@type, 'pass')]")).sendKeys("abcd");
		//driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
		
		//driver.findElement(By.xpath("//*[@id='pageFooter']//ul//li[2]//a")).click();

	}

}
