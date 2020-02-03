package cucum;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FunctionalLibrary {
	public static WebDriver driver;

	public static WebDriver browserlaunch(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\eclipse dir\\dhoni\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {

			} else {
				throw new Exception("Not a valid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void driverQuit() {
		driver.quit();
	}
	public static void website(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Not a Valid Url");
		}
	}

	public static void waitForVisibilityOfWebElement(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static boolean elementIsEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void text(WebElement element, String values) throws Exception {
		try {
			waitForVisibilityOfWebElement(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				clearValuesintheElement(element);
				element.sendKeys(values);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static void clearValuesintheElement(WebElement element) throws Exception {
		waitForVisibilityOfWebElement(element);
		element.clear();
	}

	public static void clickOntheElement(WebElement element) throws Exception {
		waitForVisibilityOfWebElement(element);
		if (elementIsDisplayed(element)) {
			element.click();
		}
	}

	public static String getElementText(WebElement element) throws Exception {
		waitForVisibilityOfWebElement(element);
		String text = element.getText();
		return text;
	}

	public static void selectoptioninDropDown(WebElement element, String values, String options) throws Exception {
		try {
			waitForVisibilityOfWebElement(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("values")) {
				sc.selectByValue(values);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(values);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(values));
			} else {
				throw new Exception("not a valid option");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void navigateOptions(String option) throws Exception {
		try {
			if (option.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (option.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (option.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			} else if (option.contains("http")) {
				driver.navigate().to(option);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getElementInputValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void scrollToElement(WebElement element) throws Exception {
		try {
			waitForVisibilityOfWebElement(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void scrollToCoordinates(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + x + "," + y + ")");
	}

	public static void scrollToTopOrBottomPage(String options) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (options.equalsIgnoreCase("top")) {
				js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			} else if (options.equalsIgnoreCase("bottom")) {
				js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static File takeScreenShot(String fileName) throws Exception {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\facebook\\reports\\screenshots\\" + fileName + ".png");
			FileUtils.copyFile(screenshotAs, des);
			return des;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void mouseHovertoElement(WebElement element) throws Exception {
		waitForVisibilityOfWebElement(element);
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}

	public static void rightClickOntheElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.contextClick(target).build().perform();
	}

	public static String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public static void switchToWindows(String title) {
		Set<String> pid = driver.getWindowHandles();
		boolean winFlag = false;
		for (String winId : pid) {
			driver.switchTo().window(winId);
			String winTitle = driver.getTitle();
			if (winTitle.equalsIgnoreCase(title)) {
				System.out.println("Title Matched");
				winFlag = true;
				break;
			}
		}
		Assert.assertTrue("Window Id Match -- ?" + winFlag, winFlag);
	}

	public static void switchToWindows(int winIndex) {
		Set<String> pid = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(pid);
		String winId = winList.get(winIndex);
		driver.switchTo().window(winId);

	}

}



