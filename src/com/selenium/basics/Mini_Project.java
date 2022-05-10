package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sundar\\eclipse-workspace\\Selenium_8pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    Thread.sleep(2000);
	  
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("SUNDAR12");
		
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("OC0EI2");
		
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		
		Thread.sleep(2000);
		
		WebElement Location = driver.findElement(By.id("location"));
		
		Select l = new Select(Location);
		l.selectByVisibleText("Los Angeles");
		
		Thread.sleep(2000);
		
		
	    WebElement hotel = driver.findElement(By.id("hotels"));
		
		Select h = new Select(hotel);
		h.selectByVisibleText("Hotel Hervey");
		
		Thread.sleep(2000);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select r = new Select(roomtype);
		r.selectByVisibleText("Double");
		
		Thread.sleep(2000);
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		
		Select n = new Select(roomno);
		n.selectByValue("2");
		
		Thread.sleep(2000);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("10/03/2022");
		
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("12/03/2022");
		
		Thread.sleep(2000);
		
		WebElement people = driver.findElement(By.id("adult_room"));
		Select p = new Select(people);
		p.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select c = new Select(childroom);
		c.selectByValue("3");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		
		Thread.sleep(2000);
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		Thread.sleep(2000);
		
		WebElement fn = driver.findElement(By.name("first_name"));
		fn.sendKeys("saravanan");
		
		Thread.sleep(2000);
		
		WebElement ls = driver.findElement(By.name("last_name"));
		ls.sendKeys("sekar");
		
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("Thiruvannamalai");
		
		Thread.sleep(2000);
		
		WebElement crdnum = driver.findElement(By.name("cc_num"));
		crdnum.sendKeys("9865321425468563");
		
		Thread.sleep(2000);
		
		WebElement crdtype = driver.findElement(By.id("cc_type"));
		
		Select t = new Select(crdtype);
		t.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select e = new Select(exp);
		e.selectByValue("3");
		
		Thread.sleep(2000);
		
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(expyr);
		y.selectByValue("2022");
		
		Thread.sleep(2000);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("982");
		
		Thread.sleep(2000);
	    
		WebElement b = driver.findElement(By.id("book_now"));
		b.click();
		
		Thread.sleep(2000);
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		String attribute = orderno.getAttribute("value");
		System.out.println(attribute);
		
		
		
		//WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		//logout.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
