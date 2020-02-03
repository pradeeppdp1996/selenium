package cucum.dhoni;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Employee {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;
	@FindBy(xpath="//span[@class='rush-component s-latency-cf-section']//li[2]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]")
	private WebElement redmi;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getRedmi() {
		return redmi;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public Login() {
	PageFactory.initElements(driver, this);
}
	
}
