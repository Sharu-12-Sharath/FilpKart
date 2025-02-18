package com.flipkart.runner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flipkart.pos.scripts.CardPaymentElements;
import com.pearson.generic.scripts.BaseTest;

public class UPIPayment extends BaseTest{
	
	@Test
	public void upi() {
		CardPaymentElements c=new CardPaymentElements(driver);
		c.CartB().click();
		c.prodect1().click();
		Set<String> allw = driver.getWindowHandles();
		String pId = driver.getWindowHandle();
		allw.remove(pId);
		for(String s:allw) {
			driver.switchTo().window(s);
		}
		c.BuyNowB().click();
		c.FNText().sendKeys("Sharath S");
		c.MNText().sendKeys("8618865631");
		c.PNCText().sendKeys("562132");
		c.Ad1T().sendKeys("House No: 05");
		c.Ad2T().sendKeys("Harivesandra");
		c.Land().sendKeys("Dabaspete Industrial area");
		c.cityT().sendKeys("Nelamangala");
		//Select s= new Select(c.DD());
		//s.selectByVisibleText("KARNATAKA");
		c.UseB().click();
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter UPI ID']")).sendKeys("872289151@ybl");
		driver.findElement(By.xpath("(//span[.='Verify'])[1]")).click();
		WebElement ele1 = driver.findElement(By.xpath("(//span[.='Use this payment method'])[1]"));
		int y = ele1.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		ele1.click();
	}

}
