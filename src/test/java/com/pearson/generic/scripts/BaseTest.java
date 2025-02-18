package com.pearson.generic.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.flipkart.pos.scripts.Elements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Elements e=new Elements(driver);
		e.SigButton().click();
		e.MobnumberF().sendKeys("6364282702");
		e.Continue().click();
		e.PassText().sendKeys("Sharath@123");
		e.SignBN().click();
		
	}
	@AfterMethod
	public void close() {
		
		driver.close();
	}

}
