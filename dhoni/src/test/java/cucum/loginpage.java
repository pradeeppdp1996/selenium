package cucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginpage extends FunctionalLibrary {
	@FindBy(id="username")
	private WebElement emailIdFeild;
	
	@FindBy(id="password")
	private WebElement passWordFeild;
	
	@FindBy(id="login")
	private WebElement loginbutton;
	
	@FindBy(xpath="//input[@value='Hello PDPKUMAR1996!']")
	private WebElement loginconfirmation;

	
	public WebElement getLoginconfirmation() {
		return loginconfirmation;
	}
	public WebElement getEmailIdFeild() {
		return emailIdFeild;
	}
	public WebElement getPassWordFeild() {
		return passWordFeild;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
}

