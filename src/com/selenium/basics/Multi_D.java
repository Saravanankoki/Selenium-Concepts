package com.selenium.basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_D {
   public static void main(String[] args) throws InterruptedException {
	   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
   
   WebDriver driver = new ChromeDriver();
   
   driver.get("http://www.leafground.com/pages/Dropdown.html");
   
   driver.manage().window().maximize();
   
   Thread.sleep(2000);
   
   WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
   Select s = new Select(multiple);
   boolean multiple2 = s.isMultiple();
   System.out.println(multiple2);
   
   s.selectByValue("1");
   s.selectByVisibleText("UFT/QTP");
   s.selectByIndex(4);
   
   Thread.sleep(2000);
   
   s.deselectByValue("3");
   System.out.println("===============All Options=================");
   List<WebElement> options = s.getOptions();
   for (WebElement All : options) {
	   String text = All.getText();
	   System.out.println(text);
   } 
	System.out.println("===============All Selected Options===============");
	List<WebElement> selected = s.getAllSelectedOptions();
	for (WebElement All : selected) {
		String text1 = All.getText();
		System.out.println(text1);
		
	}
	
	System.out.println("=============First Selected option============");
	WebElement first = s.getFirstSelectedOption();
	String text2 = first.getText();
	System.out.println(text2);
		s.deselectAll();
	}

   
   
   
}

