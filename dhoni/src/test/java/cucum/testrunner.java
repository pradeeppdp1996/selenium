package cucum;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "json:D:\\eclipse dir\\dhoni\\json report\\reppor.json",
		"junit:D:\\eclipse dir\\dhoni\\junit report\\jnuit.xml",
		"html:D:\\eclipse dir\\dhoni\\report"},features="D:\\eclipse dir\\dhoni\\feature file\\Adactin.feature",tags="@Facebook",glue="cucum",strict=true,monochrome=true)
public class testrunner {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() throws Exception {
		FunctionalLibrary.browserlaunch("chrome");
	}
	
}