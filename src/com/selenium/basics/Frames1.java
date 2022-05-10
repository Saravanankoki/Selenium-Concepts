package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.switchTo().frame("singleframe");

		WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text1.sendKeys("padma");

		driver.switchTo().defaultContent();
		
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		
		Thread.sleep(2000);
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(inner);
		
		
		WebElement text2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text2.sendKeys("priya");
		
		
		







	}

}
