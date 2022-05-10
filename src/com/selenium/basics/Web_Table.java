package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
		driver.get("http://www.leafground.com/pages/table.html");
	
	    driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		System.out.println("===================All Data=====================");
	
		 List<WebElement> all_Data = driver.findElements(By.xpath("//table[@id='table_id']"));
		
		for (WebElement all : all_Data) {
			String value = all.getText();
			System.out.println(value);
		}

		System.out.println("====================Particular Row=====================");
		
		List<WebElement> p_Row= driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr[4]/td"));
		
		for (WebElement row : p_Row) {
			String text1 = row.getText();
			System.out.println(text1);
		
		}
	//driver.findElements(By.xpath("))
	
	}
}
			
			
		
		
		
		
	


