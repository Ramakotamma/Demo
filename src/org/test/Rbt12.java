package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rbt12 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(200);
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement s=driver.findElement(By.xpath("//img[@alt='IT2M Analog 24.13 cm X 24.13 cm Wall Clock']"));
		Actions acc=new Actions(driver);
		acc.contextClick(s).perform();
	
		Robot r=new Robot();
		for(int i=1;i<=2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
	
	
	}
		
				
}


