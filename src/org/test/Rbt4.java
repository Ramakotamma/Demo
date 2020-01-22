package org.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rbt4 {
	public static void main(String[] args, TimeUnit Time_Units) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(200);
		driver.manage().timeouts().implicitlyWait(20, Time_Units);
		driver.get("  http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	    s.click();
	
	}
}
