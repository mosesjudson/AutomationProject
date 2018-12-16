/**
 * 
 */
package com.fmn.ecms.stepdefinition;

import com.fmn.ecms.impl.WebSearchHandler;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author moses
 *
 */
public class WebSearchStep {
	
	WebSearchHandler searchHandler = new WebSearchHandler();
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		System.out.println("Inside Definition File");
		searchHandler.openBrowser();
	}

	@Given("^Navigate to Google page$")
	public void navigate_to_Google_page() throws Throwable {
		 System.out.println("User Navigate to Google webpage");
		 searchHandler.navigatetoSearchPage();
	}

	@When("^Enter the content \"([^\"]*)\" in the search field$")
	public void enter_the_content_in_the_search_field(String content) throws Throwable {
		 System.out.println("User Navigate to Google webpage");
		 searchHandler.searchContent(content);    
	}

	@When("^Clich the search button$")
	public void clich_the_search_button() throws Throwable{
		 System.out.println("User Navigate to Google webpage");
		 searchHandler.searchClick();
	   	}

	@Then("^Confirm load the result page sucessfully based on page \"([^\"]*)\"$")
	public void confirm_load_the_result_page_sucessfully_based_on_page(String exspectedResult)  throws Throwable {		 
	 	System.out.println("User Navigate to Google webpage");
	 	searchHandler.confirmResultPage(exspectedResult);
		}
		 	
}
