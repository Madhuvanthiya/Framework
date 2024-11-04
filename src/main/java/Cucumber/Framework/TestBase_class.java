package Cucumber.Framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class TestBase_class {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static TakesScreenshot toss;
	
	public void launchbrowser() {//normal Browser launch
		driver = new EdgeDriver();
	}
	public void geturl(String url) {
		driver.get(url);
	}
	public void maximizebrowser() {
		driver.manage().window().maximize();
    }
	public void implicitwaits(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public void tofill(WebElement element, String data) {
		element.sendKeys(data);
	}
	public String getattribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	public void jsclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void radiobutton(WebElement element) {
		element.click();
	}
	
	public String retrivetext(WebElement element) {
		return element.getText();
	}
	public void checkbox(WebElement checkbox) {
		checkbox.click();
	}
	public void screenshots(String path) throws IOException {
		toss=(TakesScreenshot) driver;
		File source=toss.getScreenshotAs(OutputType.FILE);
	    File destination=new File(path);
		FileUtils.copyFile(source, destination);
	}
	public void quitdriver() {
		driver.quit();
	}
}
