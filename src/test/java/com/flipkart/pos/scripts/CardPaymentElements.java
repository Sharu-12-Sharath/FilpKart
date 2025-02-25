package com.flipkart.pos.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPaymentElements {
	
	@FindBy(id = "nav-cart-text-container")
	private WebElement CartButton;
	@FindBy(xpath  = "//h2[@id='sc-active-items-header']/../../../descendant::form/div[2]/descendant::img[@class='sc-product-image']")
	private WebElement Prodect;
	@FindBy(xpath  = "//input[@id='buy-now-button']")
	private WebElement BuyNow;
	@FindBy(id = "address-ui-widgets-enterAddressFullName")
	private WebElement FN;
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
	private WebElement MN;
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	private WebElement PNC;
	//address-ui-widgets-enterAddressLine1
	@FindBy(id = "address-ui-widgets-enterAddressLine1")
	private WebElement ad1;
	@FindBy(id = "address-ui-widgets-enterAddressLine2")
	private WebElement ad2;
	@FindBy(id = "address-ui-widgets-landmark")
	private WebElement Lm;
	@FindBy(id = "address-ui-widgets-enterAddressCity")
	private WebElement city;
	@FindBy(xpath = "(//span[.='Choose a state'])[1]")
	private WebElement dd;
	@FindBy(xpath = "(//span[.='Use this address'])[1]")
	private WebElement use;
	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']")
	private WebElement RadB;
	@FindBy(xpath = "(//img[contains(@src,'PlusIcon')])[1]")
	private WebElement addCard;
	@FindBy(xpath = "//h4[.='Save Card']/../../div[1]/div[1]/descendant::input[@name='addCreditCardNumber']")
	private WebElement cardNum;
	@FindBy(id = "field")
	private WebElement cvv;
	@FindBy(xpath = "//span[text()='Save card as per new RBI guidelines.']/../descendant::input[@type='checkbox']")
	private WebElement CheckB;
	
	//UPI Payments
	
	@FindBy(xpath = "//span[.='Other UPI Apps']/../../../../div[1]")
	private WebElement upiRadio;
	@FindBy(xpath = "//input[@placeholder='Enter UPI ID']")
	private WebElement upiText;
	@FindBy(xpath = "(//span[.='Verify'])[1]")
	private WebElement verify;
	@FindBy(xpath = "//span[.='Items:']/../../../../../descendant::span[@data-action='buy-button-as-primary-action']")
	private WebElement useTP;
	@FindBy(xpath = "//span[.='Items:']/../../../../../descendant::form")
	private WebElement PayNow;
	
	public CardPaymentElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement CartB() {
		return CartButton;
	}
	public WebElement prodect1() {
		return Prodect;
	}
	public WebElement BuyNowB() {
		return BuyNow;
	}
	public WebElement FNText() {
		return FN;
	}
	public WebElement MNText() {
		return MN;
	}
	public WebElement PNCText() {
		return PNC;
	}
	public WebElement Ad1T() {
		return ad1;
	}
	public WebElement Ad2T() {
		return ad2;
	}
	public WebElement Land() {
		return Lm;
	}
	public WebElement cityT() {
		return city;
	}
	public WebElement DD() {
		return dd;
	}
	public WebElement UseB() {
		return use;
	}
	public WebElement addcardI() {
		return addCard;
	}
	public WebElement addcardN() {
		return cardNum;
	}
	public WebElement RedioB() {
		return RadB;
	}
	public WebElement RadioUpi() {
		return upiRadio;
	}
	public WebElement upiTextF() {
		return upiText;
	}
	public WebElement VB() {
		return verify;
	}
	public WebElement useTPB() {
		return useTP;
	}
	public WebElement PayNB() {
		return PayNow;
	}
	public WebElement cvvT() {
		return cvv;
	}
	public WebElement Check() {
		return CheckB;
	}
}