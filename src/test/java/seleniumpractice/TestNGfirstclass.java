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

public class TestNGfirstclass {

@BeforeSuite
public void beforesuite() {
	System.out.println("this is before suite");
}

@BeforeTest
public void beforetest() {
	System.out.println("this is before test");
}

@BeforeClass
public void beforeclass() {
	System.out.println("this is before class");
}	
	
@BeforeMethod
public void setup() {
	System.out.println("this is before method");
}

@Test
public void verifytitle() {
	System.out.println("test 123");
}

@AfterMethod
public void teardown() {
	System.out.println("this is after method");
}
@AfterClass
public void afterclass() {
	System.out.println("this is after class");
}
@AfterTest
public void aftertest() {
	System.out.println("this is after test");
}
@AfterSuite
public void aftersuite() {
	System.out.println("this is after suite");
}

}
