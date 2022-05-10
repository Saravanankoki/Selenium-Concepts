package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("(//a[text()='Gmail'])"));
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();
		Robot rob = new Robot();
		rob.Ke
		



	}

}
