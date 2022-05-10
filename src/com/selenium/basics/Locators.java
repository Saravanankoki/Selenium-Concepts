package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("saravanan");
		
		//Thread.sleep(2000);
		
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("12345");
		
		//WebElement saravanan = driver.findElement(By.xpath("//button[@type='submit']"));
		//saravanan.click();
		
		Thread.sleep(2000);
		
		WebElement dhanush = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		dhanush.click();
		
		Thread.sleep(2000);
		
		WebElement shameer = driver.findElement(By.id("day"));
		
		Select s = new Select(shameer);
		s.selectByIndex(6);
		
		WebElement senthil = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		senthil.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
