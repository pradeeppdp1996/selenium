package cucum.dhoni;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login2 extends Login {
@FindBy(name="reg_passwd__")
private WebElement newp;
@FindBy(name="day")
private WebElement day;
}
