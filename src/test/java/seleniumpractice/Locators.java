package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en-gb.facebook.com/login/");
		
		//driver.findElement(By.id("email")).sendKeys("1234");
		
		
		//locate element by id 
		//WebElement username = driver.findElement(By.id("email"));
		//username.sendKeys("ttt");
		
		//driver.findElement(By.id("pass")).sendKeys("343434");
		
		//locate element by name
		//driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
		//locate element by link text
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//locate element by partial link text
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.findElement(By.partialLinkText("account")).click();
		
		
		
		//int numofelem = driver.findElements(By.className("clearfix")).size();
		//System.out.println(numofelem);
		
		 //int tagelemnts = driver.findElements(By.tagName("input")).size();
		 //System.out.println(tagelemnts);
		
		//Css selectors tag and id 
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("ruyuey");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("574674");
		
		//Css selectors tag and class
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("@@");
		
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("//");
		
		//Css selectors tag and attribute
		
		//driver.findElement(By.cssSelector("[type=text]")).sendKeys("werere");
		
		//driver.findElement(By.cssSelector("[autocomplete = current-password]")).sendKeys("2348");
		
		//Css selectors tag class and attribute
		
		//driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("uuuu");
		
		//driver.findElement(By.cssSelector(".inputtext[name=pass]")).sendKeys("0000");
		
		//driver.findElement(By.cssSelector("[id=loginbutton]")).click();
		
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("1234");
		
		//rel xpath
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("qwert");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("shshs");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		
		
		
		
		
		

	}

}
