package cucum.dhoni;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Employee {
public static WebDriver driver;
public static void launch() {
	try {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse dir\\\\pradeep\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	} catch (Exception e) {
System.out.println(e.getStackTrace());
	}
	}
public static void website(String url) {
	
	try {
		driver.get(url);	
	} catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
}
public static void click(WebElement element) {
	element.click();
}
public static void text(WebElement element,String value) {
try {
	element.sendKeys(value);
} catch (Exception e) {
	System.out.println(e.getStackTrace());
}
}
public static void dropdw(WebElement element,Integer index) {
	element.click();
	Select s=new Select(element);
	s.selectByIndex(index);
}
public static void dropdv(WebElement element,String va) {
	element.click();
	Select s=new Select(element);
	s.selectByValue(va);
}
public static void dropdy(WebElement element,String text) {
	element.click();
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
public static String windowhandle() {
	return driver.getWindowHandle();
}
public static Set<String> windowhandles() {
	return driver.getWindowHandles();
}
}
