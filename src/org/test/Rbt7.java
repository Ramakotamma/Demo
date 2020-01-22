package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rbt7{
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(200);
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//span[text()='Introduction']"));
		Actions acc=new Actions(driver);
		//acc.keyDown(s, Keys.CONTROL);
		//acc.keyDown(s, Keys.);
		acc.doubleClick(s).perform();
		
		Robot r=new Robot();

		for(int i=1;i<=5;i++) {
			//acc.doubleClick(s).perform();	
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_DOWN);

		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_DOWN);



		//acc.contextClick(s).perform();
		
		//for(int i=1;i<=2;i++) {
	
			//r.keyPress(KeyEvent.VK_DOWN);
			//r.keyRelease(KeyEvent.VK_DOWN);
		//}
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
}
	
	}

