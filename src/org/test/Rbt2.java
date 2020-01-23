package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Rbt2 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.co.in/web php ");
		driver.manage().window().maximize();
		WebElement d=driver.findElement(By.xpath("(//div[@class='gb_Ff'])[1]"));
		//Actions s=new Actions(driver);
		//s.moveToElement(d).perform();
		d.click();
		WebElement n=driver.findElement(By.id("Gmail"));
		Actions b=new Actions(driver);
		b.moveToElement(n).perform();
		System.out.println("run code successfully");
		System.out.println("run code successfully");
		System.out.println("run code successfully");
		b.click();
	}

}
