package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonElement{

	public static void main(String[] args) throws InterruptedException  {
    
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Wrist Watches");
	        driver.findElement(By.xpath("(//input)[5]")).click();
	        driver.findElement(By.xpath("//li[@id='p_89/Titan']/../li/span/a/div")).click();
	        JavascriptExecutor j=(JavascriptExecutor) driver;
	        j.executeScript("window.scrollBy(0,850)");
	        driver.findElement(By.xpath("//span[text()='25% Off or more']")).click();
	        j.executeScript("window.scrollBy(0,850)");
                driver.findElement(By.xpath("//span[contains(text(),'Analogue')]")).click();
                j.executeScript("window.scrollBy(0,900)");
                driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
                Thread.sleep(4000);
                j.executeScript("window.scrollTo(0,0)");
                driver.findElement(By.xpath("//span[normalize-space()='2,096']")).click();		
	}

}
