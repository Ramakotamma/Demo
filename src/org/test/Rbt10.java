package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rbt10 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(200);
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(s).perform();
		WebElement s1=driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		s1.click();
		WebElement s3=driver.findElement(By.id("ap_email"));
		s3.sendKeys("7731078130");
		Robot r=new Robot();
		//acc.doubleClick(s3).perform();
			r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
WebElement s4=driver.findElement(By.id("continue"));
s4.click();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);







		
		
		
		

		

		
		
	
	}
}
