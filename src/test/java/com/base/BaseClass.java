package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author LOGAPRIYA
 * @Description To maintain all the reusable methods
 * @CreationDate 28/06/2022
 */
public class BaseClass {
	static Alert alert;
	public static WebDriver driver;
      /**
       * 
       * @param browserType
       * @CreationDate 28/06/2022
       * @Description Used to launch browser
       * @CreationDate 28/06/2022
       */

	// 1 get Driver
	public void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
	}
/**
 * 
 * @param Key
 * @return String
 * @throws FileNotFoundException
 * @throws IOException
 * @Description Used to getPropertyFileValue
 * @CreationDate  
 */
	public String getPropertyFileValue(String Key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "//config.properties"));
		Object object = properties.get(Key);
		String value = (String) object;
		System.out.println(value);
		return value;
	}
/**
 * 
 * @param Url
 * @Description Used to get the URL
 * @CreatedDate 28/06/2022
 * 
 */
	// 2 get URL
	public static void getUrl(String Url) {
		driver.get(Url);
	}
/**
 * 
 * @param element
 * @param data
 * @Description Used to Pass the input data
 * @CreatedDate 28/06/2022
 */
	// 3
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
/**
 * 
 * @param element
 * @Description To perform click
 * @CreatedDate 28/06/2022
 */
	// 4 click
	public void click(WebElement element) {
		element.click();
	}
/**
 * 
 * @return String
 * @Description Used to get the title
 * @CreationDate 28/06/2022
 */
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
/**
 * 
 * @return String
 * @Description Used to get CurrenURL
 * @CreationDate 28/06/2022
 */
	// 5
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
/**
 * 
 * @param attributeValue
 * @return WebElement
 * @Description Used to locate AttributeValue by Id
 * @CreationDate 28/06/2022
 */
	// 6
	public static WebElement findElementByID(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
/**
 * 
 * @param attributeValue
 * @return WebElement
 * @Description Used to locate AttributeValue by Name
 * @CreationDate 28/06/2022
 */
	// 7
	public static WebElement findElementByname(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
/**
 * 
 * @param attributeValue
 * @return WebElement
 * @Description Used to locate AttributeValue by ClassName
 * @CreationDate 28/06/2022
 */
	// 8
	public static WebElement findElementByclassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}
/**
 * 
 * @param xpath
 * @return WebElement
 * @Description Used to find the locator using Xpath
 * @CreationDate 28/06/2022
 */
	// 9
	public static WebElement findElementByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
/**
 * 
 * @param element
 * @return String
 * @Description Used to get the Text
 * @CreationDate 28/06/2022
 */
	// 10
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
/**
 * 
 * @param element
 * @param AttributeName
 * @return String
 * @Description Used to get AttributeName
 * CreationDate 28/06/2022
 */
	// 11
	public String getAttribute(WebElement element, String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}
/**
 * 
 * @param element
 * @return String
 * @Description Used to get AttributeValue
 * @CreationDate 28/06/2022
 */
	// 12
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	/**
	 * 
	 * @param secs
	 * @throws InterruptedException
	 * @Description Used to set time Value
	 * @CreationDate 28/06/2022
	 */
	// 14
	public void sleep(int secs) throws InterruptedException {
		Thread.sleep(secs);
	}
/**
 * @Description Used to Close the window
 * @CreationDate 28/06/2022
 */
	// 15
	public static void closewindow() {
		driver.close();
	}
/**
 * @Description Used to CloseAllWindow
 * CreationDate 28/06/2022
 */
	// 16
	public static void closeAllWindow() {
		driver.quit();
	}
/**
 * @Description Used to maximize the Window
 * @CreationDate 28/036/2022
 */

	// 21
	public static void maximiseWindow() {
		driver.manage().window().maximize();
	}
/**
 * Description Used to minimize the Window
 * CreationDate 28/06/2022
 */
	// 22
	public static void minimizeWindow() {
		driver.manage().window().maximize();
	}
/**
 * 
 * @param toMove
 * @Description used to perform MouseOverAction
 * @CreationDate 28/06/2022
 */
	// 23
	public void mouseOverAction(WebElement toMove) {
		Actions actions = new Actions(driver);
		actions.moveToElement(toMove).perform();
	}
/**
 * 
 * @param source
 * @param target
 * @Description Used to perform dragAdnDrop
 */
	// 24
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
/**
 * 
 * @param target
 * @Description Used to Perform rightClick
 * @CreationDate 28/06/2022
 */
	// 25
	public void rightClick(WebElement target) {
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform();
	}
/**
 * 
 * @param target
 * @Description Used to perform doubleClick
 */
	// 26
	public void doubleClick(WebElement target) {
		Actions actions = new Actions(driver);
		actions.doubleClick(target).perform();
	}
/**
 * @Description Used to accept the prompt Message
 * @CreationDate 28/06/2022
 */
	// 27
	public static void okAlert() {
	 alert = driver.switchTo().alert();
		alert.accept();
	}
/**
 * @Description used to cancel the prompt Message
 * @CreationDate 28/06/2022
 */
	// 28
	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	/**
	 * 
	 * @return ScreenshotAs
	 * @Description Used to 
	 */

	// 29
	public static File screenShotOutputTypeFile() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	// 30
	public static void transferScreenshotfilewho3partyapplication(File screenshotAs, String name) throws IOException {
		FileUtils.copyFile(screenshotAs, new File(name));
	}

	// 31
	public void javaScriptExecutorInsertText(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	// 32
	public void javaScriptExecutorreturnText(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("returnarguments[0].getAttribute('value')");
	}

	// 33
	public void javaScriptExecutorClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}

	// 34
	public void alertinput(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	}

	// 35
	public String alertgettext() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	// 36
	public void javaScriptExecutorscrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoVieew(true)", element);
	}

	// 37
	public void javaScriptExecutorscrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoVieew(false)", element);
	}

	// 38
	public void SelectBytext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 39
	public void SelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 6. To Select Dropdown by Txt
	public void selectOptionByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 5.To Select Dropdown by value
	public void selectOptionByvalue(WebElement element, String attributevalue) {
		Select select = new Select(element);
		select.selectByValue(attributevalue);
	}
	// 53. to clear

	public void clear(WebElement element) {
		element.clear();
	}

	// 40
	public void SelectByvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 41
	public void DeSelectBytext(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 42
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 43
	public void deSelectByvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 44
	public List<WebElement> getallOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 45
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 46
	public List<WebElement> getAllselectedoption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 47
	public String WebelementToString(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 48
	public WebElement getFirstselectedoption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 49
	public WebElement LocatortagName(String tagName) {
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;
	}

	// 50
	public void SwitchToframebyindex(int index) {
		driver.switchTo().frame(index);
	}

	// 51
	public void SwitchToframebystringId(String id) {
		driver.switchTo().frame(id);
	}

	// 52
	public void SwitchToframebystringname(String name) {
		driver.switchTo().frame(name);
	}

	// 53
	public void SwitchToframebyWebElementRef(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 54
	public void switchtoWindow(String windowRef) {
		driver.switchTo().window(windowRef);
	}

	
	// 56
	public void navigationUrl(String url) {
		driver.navigate().to(url);
	}

	// 57
	public void navigationForward() {
		driver.navigate().forward();
	}

	// 58
	public void navigationBackward() {
		driver.navigate().back();
	}

	// 59
	public void navigationrefresh(String url) {
		driver.navigate().refresh();
	}

	
}
