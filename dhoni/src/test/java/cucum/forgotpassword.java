package cucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class forgotpassword extends FunctionalLibrary {
	@FindBy(className = "uiHeaderTitle")
	private WebElement forgetPasswordHeader;

	@FindBy(id = "identify_email")
	private WebElement identifyEmail;

	@FindBy(id = "did_submit")
	private WebElement submitBtn;

	@FindBy(xpath="//div[@class='_4rbf _53ij']")
	private WebElement alertMessage;
	
	
	public WebElement getAlertMessage() {
		return alertMessage;
	}

	public WebElement getForgetPasswordHeader() {
		return forgetPasswordHeader;
	}

	public WebElement getIdentifyEmail() {
		return identifyEmail;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public  forgotpassword() {
		PageFactory.initElements(driver, this);
	}

}


