package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccessTable {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		entersalaryforpersonSachintendulkar();
//		entersalaryforpersonSachintendulkar1();
		Fromrahuldravidnextsecondrecord();
//		FreedomfightrstatusActive();
//		sachintendulkarprevioussecondrecord();
//		basedreferenceoftextindentifythetable();
//		fourthrecordentersalary();
	}
	static void launchBrowser()
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
	static void navigate()
	{
		try			
		{
			oBrowser.get("file:\\E:\\notes\\selenium\\xpathaxes_27th_oct_2021\\XPathAxes_27th_OCT_2021\\WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * folowing-sibling
	 */
	static void entersalaryforpersonSachintendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("15000");
	}
	static void entersalaryforpersonSachintendulkar1()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("15000");
	}
	/**following
	 * 
	 */
	static void Fromrahuldravidnextsecondrecord()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("15000");
	}
	/**
	 * preceding-sibling
	 */
	static void FreedomfightrstatusActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
	}
	/**
	 * preceding
	 */
	static void sachintendulkarprevioussecondrecord()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	/**
	 * Ancestor
	 */
	static void basedreferenceoftextindentifythetable()
	{
	WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::table"));
	String val=oEle.getAttribute("id");
	System.out.println(val);
		
	}
	/**
	 * Decendent
	 */
	static void fourthrecordentersalary()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("15000");
	}
}
