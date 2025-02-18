package com.flipkart.runner;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.flipkart.pos.scripts.CardPaymentElements;
import com.flipkart.pos.scripts.Elements;
import com.pearson.generic.scripts.BaseTest;

public class CardTestCase extends BaseTest{
	
	@Test
	public void Card() {
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
		driver.findElement(By.name("ppw-instrumentRowSelection")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter UPI ID']")).sendKeys("sdfgh");
	}
	
}
