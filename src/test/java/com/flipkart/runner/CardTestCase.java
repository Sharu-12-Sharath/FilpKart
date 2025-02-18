package com.flipkart.runner;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		c.RedioB().click();
		c.addcardI().click();
		//Here we need add the card details manually 
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@name='apx-secure-field-addCreditCardVerificationNumber']")));
		driver.switchTo().frame(element);
		c.cvvT().sendKeys("532");
		driver.switchTo().parentFrame();
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(c.useTPB()));
		ele.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(c.useTPB()));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(c.PayNB()));
		element2.click();
		
	}
	
}
