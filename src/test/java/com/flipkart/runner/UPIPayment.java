package com.flipkart.runner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		c.RadioUpi().click();
		c.upiTextF().sendKeys("872289151@ybl");
		c.VB().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(c.useTPB()));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(c.PayNB()));
		element1.click();
	}

}
