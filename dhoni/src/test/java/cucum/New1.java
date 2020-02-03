package cucum;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\eclipse dir\\cucumber\\Feature\\new.feature",glue="cucum",monochrome=true,tags="@pradeep")
public class New1 {

}
