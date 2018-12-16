package com.fmn.ecms.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fmn.ecms.util.ECMSAutomationUtil;

/**
 * The WebSearchHandler program to interact with Google Chrrome Browser.
 *
 * @author  Moses Judson
 * @version 1.0
 * @since   2018-12-08
 */
public class WebSearchPage {


	WebDriver driver = null;

	/*
	 * Open the chrome Browser
	 */
	public void openBrowser()
	{
		driver = ECMSAutomationUtil.opendriver();
	}

	/*
	 * Navigate to google.com web site
	 */
	public void navigatetoSearchPage()
	{
		ECMSAutomationUtil.navigateURL("https://www.google.com");
	}


	/*
	 * Search the Web Page content
	 */
	public void searchContent(String content)
	{
		if(content != null)
		{
		WebElement searchElement = driver.findElement(By.xpath("//input[@name='q']"));
		searchElement.sendKeys(content);
		}
	}
	
	/*
	 * Search the Web Page content
	 */
	public void searchClick()
	{
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	}
	/*
	 * Search the Web Page content
	 */
	public String confirmResultPage()
	{
		String pageTitle =  driver.getTitle();
		return pageTitle;
	}
	
	
}