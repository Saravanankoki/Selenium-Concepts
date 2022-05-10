package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
     
     WebDriver driver = new ChromeDriver();
     
     driver.get("http://demo.automationtesting.in/Alerts.html");
     driver.manage().window().maximize();
     
     //simple alert
     Thread.sleep(2000);
     WebElement sa = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
     sa.click();
     Thread.sleep(2000);
     driver.switchTo().alert().accept();
     
     Thread.sleep(2000);
     
     
     // confirm alert
     WebElement ca = driver.findElement(By.xpath("(//a[@class='analystic'])[2]")); 
     ca.click();
     Thread.sleep(2000);
     WebElement ca2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
     ca2.click();
     
     Thread.sleep(2000);
     driver.switchTo().alert().dismiss();
     
     Thread.sleep(2000);
     
     //prompt alert
     WebElement pa = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
     pa.click();
     WebElement pa1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
     pa1.click();
     
     Thread.sleep(2000);
     driver.switchTo().alert().sendKeys("saravanan prompt alert program");
     Thread.sleep(2000);
    
     
      String text = driver.switchTo().alert().getText();
      System.out.println(text);
      
      Thread.sleep(2000);
      driver.switchTo().alert().accept();
      
      Thread.sleep(10000);
      driver.close();
	
      
     
     	
	}

}
