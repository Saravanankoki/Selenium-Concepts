package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement testleaf = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(testleaf).build().perform();
		
		WebElement rpa = driver.findElement(By.xpath("//a[text()='RPA']"));
		
		rpa.click();
		
	}

}
