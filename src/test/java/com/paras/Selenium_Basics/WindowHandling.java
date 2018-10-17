package com.paras.Selenium_Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public WebDriver driver;
	public void openApplication() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
	}
	
	public void handleWindow() throws InterruptedException{
	String parent = driver.getWindowHandle();
		System.out.println("main window: " + parent);
		driver.findElement(By.id("button1")).click();
		//driver.manage().window().maximize();
		Set<String> s1=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
		 
		if(!parent.equals(child_window))
		{
		Thread.sleep(4000);
		driver.switchTo().window(child_window);
		 
		System.out.println(driver.switchTo().window(child_window).getTitle());
		 
		driver.close();
		System.out.println(child_window);
		}}
		 
		driver.switchTo().window(parent);
		driver.close();
	}}


