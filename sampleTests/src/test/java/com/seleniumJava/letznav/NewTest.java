package com.seleniumJava.letznav;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	@Test(description="sample Tests")
	public void SampleTest() {
		boolean result = driver.findElement(By.className("_2OJxl5")).isDisplayed();
		Assert.assertTrue(result);
	}
	// change the path of Chrome Driver 
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
