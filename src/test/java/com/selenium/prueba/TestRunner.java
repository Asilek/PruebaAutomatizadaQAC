package com.selenium.prueba;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRunner {

	private WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod()
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		new HashMap<String, Object>();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.falabella.com/falabella-cl/");
		//
		System.out.println("Successfully opened the website https://www.falabella.com/falabella-cl/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@SuppressWarnings("static-access")
	@Test
	public void buscarConsola()  {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".HamburgerIcon_hamburgerText__3_7OL")).click();
		driver.findElement(By.cssSelector("#item-3 > .FirstLevelItems_menuText__UYB9A")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Consolas")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("Selecciono Consolas");
		{
			WebElement element = driver.findElement(By.cssSelector(".fb-huincha-link-03"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".fb-huincha-link-02"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		js.executeScript("window.scrollTo(0,167)");
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		js.executeScript("window.scrollTo(0,600)");
		driver.findElement(By.cssSelector("#testId-Accordion-Marca > .icon")).click();
		driver.findElement(By.id("testId-Multiselect-Marca")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(
				By.cssSelector(".jsx-4207689641:nth-child(3) .jsx-53718149:nth-child(12) .jsx-394545448:nth-child(2)"))
				.click();
		System.out.println("Filtro Nintendo");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.id("testId-Pod-action-8014967")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    js.executeScript("window.scrollTo(0,188)");
	    js.executeScript("window.scrollTo(0,206)");
	    {
	      WebElement element = driver.findElement(By.cssSelector(".fb-product-cta__controls--actions--choose"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".fb-quantity-input__plus")).click();
	    driver.findElement(By.cssSelector(".fb-quantity-input__plus")).click();
	}
	
	@AfterMethod()
	public void teardownTest() {
		// Close browser and end the session
		driver.quit();
	}

}
