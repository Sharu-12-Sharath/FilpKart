package com.flipkart.pos.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement SiginButton;
	@FindBy(xpath  = "//input[@name='email']")
	private WebElement MText;
	//continue-announce
	@FindBy(id  = "continue")
	private WebElement Continue;
	@FindBy(name = "password")
	private WebElement PText;
	@FindBy(id = "signInSubmit")
	private WebElement SignB;
	
	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SigButton() {
		return SiginButton;
	}
	public WebElement MobnumberF() {
		return MText;
	}
	public WebElement Continue() {
		return Continue;
	}
	public WebElement PassText() {
		return PText;
	}
	public WebElement SignBN() {
		return SignB;
	}
	
}
