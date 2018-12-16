package com.fmn.ecms.impl;
import static org.junit.Assert.assertEquals;

import com.fmn.ecms.page.WebSearchPage;

/**
 * The WebSearchHandler program implements business logic
 * for the open a Google Page in chrome browser.
 *
 * @author  Moses Judson
 * @version 1.0
 * @since   2018-12-08
 */
public class WebSearchHandler {

	WebSearchPage webSearchPage = new WebSearchPage();

	/*
	 *  Open the chrome browser using  the chrome driver - Moses
	 */
	public void openBrowser()
	{
		System.out.println("Inside Handler Class");
		webSearchPage.openBrowser();

	}

	/*
	 *  Use the google.com URL to 
	 */
	public void navigatetoSearchPage()
	{
		System.out.println("Inside Navigaotor Class");
		webSearchPage.navigatetoSearchPage();
	}

	/*
	 *  Use the google.com URL to 
	 */
	public void searchContent(String content)
	{
		System.out.println("search the content");
		webSearchPage.searchContent(content);
	}
	
	/*
	 *  Use the google.com URL to 
	 */
	public void searchClick()
	{
		System.out.println("search the content");
		webSearchPage.searchClick();
	}
	
	/*
	 *  Use the google.com URL to 
	 */
	public void confirmResultPage(String exspectedResult)
	{
		System.out.println("Confirm the Result Page ");
		String pageTitle = webSearchPage.confirmResultPage();
		assertEquals(exspectedResult, pageTitle);
	}

}
