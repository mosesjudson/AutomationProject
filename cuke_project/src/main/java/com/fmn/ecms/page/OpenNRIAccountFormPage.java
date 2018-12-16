package com.fmn.ecms.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fmn.ecms.util.ECMSAutomationConstant;
import com.fmn.ecms.util.ECMSAutomationUtil;

public class OpenNRIAccountFormPage {
	WebDriver driver = null;

	public void openNRIform(String bankName)
	{
		String url = "https://application.axisbank.com/webforms/NRI-Account-form/index.aspx?utm_source=google&utm_medium=cpc&utm_campaign=nri_brand_bmm-usa&utm_adgroup=open_acc&utm_term=%2Bopen%20%2Baxis%20%2Bbank%20%2Bnri%20%2Baccount&gclid=EAIaIQobChMIsPaA_Iee3wIVV1uGCh1miQQoEAAYASAAEgIgb_D_BwE";
		driver = ECMSAutomationUtil.opendriver();
		ECMSAutomationUtil.navigateURL(url);
	}

	public void selectTitle()
	{
		ECMSAutomationUtil.selectValue(ECMSAutomationConstant.title, ECMSAutomationUtil.createXPath("index1$ddlSalutation","select"));
	}

	public void enterFirstName()
	{
		ECMSAutomationUtil.fillTextbox(ECMSAutomationConstant.firstName, ECMSAutomationUtil.createXPath("index1$txtFirstName","txt"));
	}

	public void enterLastName()
	{
		ECMSAutomationUtil.fillTextbox(ECMSAutomationConstant.lastName, ECMSAutomationUtil.createXPath("index1$txtLastname","txt"));
	}

	public void enterEmail()
	{
		ECMSAutomationUtil.fillTextbox(ECMSAutomationConstant.email, ECMSAutomationUtil.createXPath("index1$txtEmail","txt"));
	}

	public void selectResidence()
	{
		ECMSAutomationUtil.selectValue(ECMSAutomationConstant.countryResidance, ECMSAutomationUtil.createXPath("index1$ddlOCountry","select"));
	}

	public void enterMobileNo()
	{
		ECMSAutomationUtil.fillTextbox(ECMSAutomationConstant.mobileNumber, ECMSAutomationUtil.createXPath("index1$txtOMobileNo","txt"));
	}

	public void captureCaptcha()
	{
		String xpathValue = "//*[@id=\"c_webforms_nriaccountform_index_index1_samplecaptcha1_CaptchaImage\"]" ;
		System.out.println("xpathValue" + xpathValue);
		WebElement img  = driver.findElement(By.xpath(xpathValue));
		String srcValue = img.getAttribute("src");
		System.out.println("srcValue"+ srcValue);
		ECMSAutomationUtil.retriveCaptcha(srcValue);
	}

	public void chkDisclaimer()
	{
		ECMSAutomationUtil.checkBoxClick(ECMSAutomationUtil.createXPath("index1$chkDisclaimer1","txt"));
	}
	
	public void submitNRIForm()
	{
		ECMSAutomationUtil.buttonClick(ECMSAutomationUtil.createXPath("index1$btnSubmit","txt"));
	}

}
