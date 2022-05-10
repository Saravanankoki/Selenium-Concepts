package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement backTotop = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();", backTotop);
	
	//scroll up
	js.executeScript("window.scrollBy(0, -3000);");

   // scrolldown
	js.executeScript("window.scrollBy(0, 3000);");
	
	
	
	
	
}

}
