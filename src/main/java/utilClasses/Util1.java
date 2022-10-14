package utilClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {
	
	//Explicit waits 
	public void waitTillElementVisible( WebDriver driver , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	public void waitTillElementVisible( WebDriver driver , WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitTillElementVisibleLocated (WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}
	
	public static Object javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("arguments[0].click;",element);
	}
	
	public static void scroll(WebDriver driver, int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static Object scrollwithElement ( WebDriver driver , WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("arguments[0].scrollintoView(true)", element);
		
	}
	
	}
	
	

