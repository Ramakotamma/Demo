package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rob3 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(200);
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));
		Actions c=new Actions(driver);
		c.doubleClick(s).perform();
		//Thread.sleep(500);
		Actions n=new Actions(driver);
		n.contextClick(s).perform();
		for(int i = 1;i<=3;i++)
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
	}

}
}