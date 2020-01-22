package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement s=driver.findElement(By.id("email"));
		s.sendKeys("rama");
		Actions a=new Actions(driver);
		a.moveToElement(s).perform();
		a.doubleClick(s).perform();
		Robot robot1=new Robot();
	robot1.keyPress(KeyEvent.VK_CONTROL);
	robot1.keyPress(KeyEvent.VK_X);
	robot1.keyRelease(KeyEvent.VK_CONTROL);
    robot1.keyRelease(KeyEvent.VK_X);
	robot1.keyPress(KeyEvent.VK_TAB);
  	robot1.keyRelease(KeyEvent.VK_TAB);
	robot1.keyPress(KeyEvent.VK_CONTROL);
	robot1.keyPress(KeyEvent.VK_V);
	robot1.keyRelease(KeyEvent.VK_CONTROL);
	robot1.keyRelease(KeyEvent.VK_V);
	}
}
