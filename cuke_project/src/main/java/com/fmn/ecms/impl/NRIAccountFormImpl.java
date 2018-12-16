package com.fmn.ecms.impl;


import com.fmn.ecms.page.OpenNRIAccountFormPage;


public class NRIAccountFormImpl {

	OpenNRIAccountFormPage page = new OpenNRIAccountFormPage();
	
	public void selectTitle()
	{
		page.selectTitle();
	}
	
	public void openNRIform(String bankName)
	{
		page.openNRIform(bankName);
	}
	
	public void enterFirstName()
	{
		page.enterFirstName();
	}
	
	public void enterLastName()
	{
		page.enterLastName();
	}
	
	public void enterEmail()
	{
		page.enterEmail();
	}
	
	public void selectResidence()
	{
		page.selectResidence();
	}
	
	public void enterMobileNo()
	{
		page.enterMobileNo();
	}
	
	public void captureCaptcha()
	{
		page.captureCaptcha();
	}
	
	public void chkDisclaimer()
	{
		page.chkDisclaimer();
	}
	
	public void submitNRIForm()
	{
		page.submitNRIForm();
	}
}
