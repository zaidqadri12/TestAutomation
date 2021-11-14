package com.sgtesting.assigenment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
		public static WebDriver oBrowser=null;
		
		public static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();	
			}
		}
		public static void navigate()
		{
			try
			{
				oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
				oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			}catch(Exception e)
			{
				e.printStackTrace();	
			}
		}
		public static void login()
		{
			try 
			{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void minimizeFlyoutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void createcustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void closeApplication()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
}