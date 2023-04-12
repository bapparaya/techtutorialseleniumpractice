package seleniumpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {

/*
 * Test cases
 * open browser
 * open url
 * enter us name password
 * click on login
 * move to that perticular page
 * 
 * excecute our test cases
 * 
 * logout
 * close url
 * close broser
 * 
 * 
 */
	
	
	@BeforeSuite
	public void openbrowser() {
		System.out.println("open browser");
	}
	
	
	@BeforeTest
	public void openurl() {
		System.out.println("open url");
	}
	
	
	@BeforeClass
	public void entercredentials() {
		System.out.println("enter credentials");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login to the app");
	}
	
	@Test
	public void verifytitle() {
		System.out.println("verify title of the page");
	}
	
	@Test
	public void verifylog() {
		System.out.println("verify logo of the page");
	}
	
	@Test
	public void verifydashboard() {
		System.out.println("verify dashboard of the page");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("log out");
	}
	
	@AfterClass
	public void deletecookies() {
		System.out.println("delete cookies");
	}
	
	@AfterTest
	public void closeurl() {
		System.out.println("close url");
	}
	
	@AfterSuite
	public void closebrowser() {
		System.out.println("close browser");
	}





}
