/**
 * 
 */
package com.fmn.ecms.stepdefinition;

import com.fmn.ecms.impl.NRIAccountFormImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author moses
 *
 */
public class NRIAccountFormStep {
	
	NRIAccountFormImpl nriActForm = new NRIAccountFormImpl(); 
	
	@When("^Select the Title of Name$")
	public void select_the_Title_of_Name() throws Throwable  {
		nriActForm.selectTitle();
	}
	
	@Given("^Open the \"([^\"]*)\" bank NRI Form$")
	public void open_the_bank_NRI_Form(String bankName) throws Throwable {
		nriActForm.openNRIform(bankName);
	}
	    

	@When("^Enter the First Name$")
	public void enter_the_First_Name() throws Throwable {
		nriActForm.enterFirstName();
	}

	@When("^Enter the Last Name$")
	public void enter_the_Last_Name() throws Throwable {
		nriActForm.enterLastName();
	}

	@When("^Enter the Email ID$")
	public void enter_the_Email_ID() throws Throwable { 
		nriActForm.enterEmail();
	}

	@When("^Select the country of Residance$")
	public void select_the_country_of_Residance() throws Throwable  {
		nriActForm.selectResidence();
	}

	@When("^Enter Mobile Number$")
	public void enter_Mobile_Number() throws Throwable  {
		nriActForm.enterMobileNo();
	}

	@When("^Enter text as in image$")
	public void enter_text_as_in_imatchage() throws Throwable {
		nriActForm.captureCaptcha();
	}

	@When("^Click Authorization$")
	public void click_Authorization() throws Throwable  {
		nriActForm.chkDisclaimer();
	}

	
	@When("^Click Submit button$")
	public void click_Submit_button() throws Throwable {
		nriActForm.submitNRIForm();
	}
	
	@Then("^Submitted the NRI form sucessfully$")
	public void submitted_the_NRI_form_sucessfully() throws Throwable  {
	    
	}

}
