package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		// property setup
		// key---------> driver name
		// value---------> path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		// browser launch
		WebDriver driver = new ChromeDriver();  //upcasting concept
		//interface          //class
		//parent             //child
		
		//WebDriver driver1=new WebDriver();
		//ChromeDriver driver2=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");   
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
	
	}
}
