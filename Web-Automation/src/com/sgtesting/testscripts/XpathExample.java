package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathExample {
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXpath();
	//	relativeXpath();
	//	relativeXpath2();
	//	relativeXpath3();
	//	relativeXpath4();
	//	relativeXpath5();
	//	relativeXpath6();
	//	relativeXpath7();
	//	relativeXpath8();
	//	relativeXpath9();
	//	relativeXpath10();
	//	relativeXpath11();
	//	relativeXpathClick12();
	//	relativeXpathClickEndsswith13();
	//	relativeXpathClickStatswith14();
	//	relativeXpathUsingText14();
	//	relativeXpathUsingText15();
		startWithendsWith17();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:\\E:\\notes\\selenium\\XPATH_26th_OCT_2021//Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Maximus");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*case 2:Based on tag name
	*Syntax:
	* //<tagName>
	*/
	static void relativeXpath()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("Maximus");
	}
	
	/*Case 3:Index
	 * Syntax:
	 *  //<tagName>[index]
	 *  start with index[1]
	 */
	static void relativeXpath2()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Maximus");
	}
	/*Case 4:With attribute and attribute value combo
	 * Syntax:
	 *  //<tagName>[@attributename='attributevalue']
	 *  start with index[1]
	 */
	static void relativeXpath3()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	/*Case 4:Irrespective of any tag
	 * Syntax:
	 *  //*[@attributename='attributevalue']
	 */
	static void relativeXpath4()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	/*Case 5:Irrespective of any tag any attribute value
	 *  //*[@*='attributevalue']
	 */
	static void relativeXpath5()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	/*Case 6:Multiple 
	 *  //<tagName>[@attributename='attributevalue'][@attributename='attributevalue']
	 */
	static void relativeXpath6()
	{
		oBrowser.findElement(By.xpath("//input[@name='submit1btn1'][@value='Submit']")).click();
	}
	/*Case 7:Using AND operator for multiple
	 *  Syntax:<tagName>[@attributename='attributevale']and[@attributename='attributevalue']
	 */
	static void relativeXpath7()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @onclick='display()']")).click();
	}
	/*Case 8:Using OR
	 *  Syntax:
	 *  //<tagName>[@attributename='attributevalue' or @attributename='attributevalue']
	 */
	static void relativeXpath8()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @id='btn1submit1button1']")).click();
	}
	/*Case 9:Using Starts with ends with contains
	 * Syntax:
	 *  //<tagName>[starts-with @attributename,'partial attributevalue']
	 *  //<tagName>[ends-with @attributename,'partial attributevalue']
	 *  //<tagName>[cotains @attributename,'partial attributevalue'] 
	 */ 
	static void relativeXpath9()
	{
		oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
	//	oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	/*Case 10:Link
	 *  <tagName>[@attributename]
	 */
	static void relativeXpath10()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("Noumber of links: "+olinks.size());
	}
	static void relativeXpath11()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();		
			System.out.println(content);
		}
	}
	static void relativeXpathClick12()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		olinks.get(1).click();
	}
	static void relativeXpathClickEndsswith13()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("HQ"))
			{
				link.click();
			}
		}
	}
	static void relativeXpathClickStatswith14()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.startsWith("POI"))
			{
				link.click();
				break;
			}
		}
	}
	/*Case 11:Identify based on text
	 * Syntax:
	 *  //*[text()='textcontent']
	 */
	static void relativeXpathUsingText14()
	{
		oBrowser.findElement(By.xpath("//*[text()='SeleniumHQ']")).click();
	}
	/*Case 12:Irrespective of any tag
	 * Syntax:
	 *   //*[text()='textcontent']
	 */
	static void relativeXpathUsingText15()
	{
		oBrowser.findElement(By.xpath("//*[text()='Maven Build Tool']")).click();
	}
	/*Case 13:Start with Ends With
	 */
	static void startWithendsWith17()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Build')]")).click();
	}
}


