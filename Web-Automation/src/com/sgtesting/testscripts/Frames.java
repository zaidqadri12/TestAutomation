package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		 launchBrowser();
		 navigate();
		 handleFrames();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void handleFrames()
	{
		try
		{
			oBrowser.switchTo().frame(0);//index
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			
			oBrowser.switchTo().defaultContent();
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			
			oBrowser.switchTo().defaultContent();
			WebElement oFrame=oBrowser.findElement(By.cssSelector(".rightIframe"));
			oBrowser.switchTo().frame(oFrame);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
