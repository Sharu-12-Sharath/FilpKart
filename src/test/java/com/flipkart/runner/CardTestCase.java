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
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Here we need add the card details manually 
		//WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(c.addcardN()));
		//ele1.sendKeys("4011384102611958");
		//WebElement mDD = driver.findElement(By.xpath("(//label[.='Expiry date']/ancestor::div[@class='a-row a-spacing-small']/descendant::span[@role='button'])[1]"));
		//Select s= new Select(mDD);
		//s.selectByVisibleText("09");
		//WebElement yDD = driver.findElement(By.xpath("(//label[.='Expiry date']/ancestor::div[@class='a-row a-spacing-small']/descendant::span[@role='button'])[2]"));
		//Select s1= new Select(yDD);
		//s1.selectByVisibleText("2028");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@name='apx-secure-field-addCreditCardVerificationNumber']")));
		driver.switchTo().frame(element);
		c.cvvT().sendKeys("532");
		driver.switchTo().parentFrame();
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(c.Check()));
		ele.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(c.useTPB()));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(c.PayNB()));
		element2.click();
	}	
}
