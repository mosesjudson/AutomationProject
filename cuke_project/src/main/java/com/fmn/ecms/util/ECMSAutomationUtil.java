package com.fmn.ecms.util;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.asprise.ocr.Ocr;


public class ECMSAutomationUtil {		

	static WebDriver driver = null;
	/*
	 * Create the chrome driver
	 * return driver
	 */
	public static WebDriver opendriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Automation_Testing\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * Navigate to the particular URL
	 */
	public static void navigateURL(String URL)
	{
		driver.navigate().to(URL);
	}

	/*
	 * Fill the content in text box
	 */
	public static void fillTextbox(String text, String xpathValue)
	{
		if(text != null && xpathValue != null)
		{
			WebElement searchElement = driver.findElement(By.xpath(xpathValue));
			searchElement.sendKeys(text);
		}
	}

	public static String createXPath(String inputString,String componentName)
	{
		String xpathValue = null;
		if(componentName.equals("txt"))
		{
			xpathValue = "//input[@name='"+inputString+ "']";
		}
		else if(componentName.equals("select"))
		{
			xpathValue = "//select[@name='"+inputString+ "']";
		}
		return xpathValue;
	}

	public static void selectValue(String visible, String xpathValue )
	{
		Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropdown.selectByVisibleText(visible);
	}

	public static String retriveCaptcha(String imageUrl)
	{
		/* URL url = new URL(imageUrl);
		 Image image = ImageIO.read(url);
		 String s = new Ocr().recognizeCharacters((RenderedImage) image);
		 System.out.println("Text From Image : \n"+ s);*/

		Ocr.setUp(); // one time setup
		Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String str = ocr.recognize(new File[] {new File(imageUrl)}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + str);
		// ocr more images here ...
		ocr.stopEngine();
		return str;
	}

	public static void checkBoxClick(String xpathValue)
	{
		if ( !driver.findElement(By.xpath(xpathValue)).isSelected() )
		{
			driver.findElement(By.xpath(xpathValue)).click();
		}
	}

	/*
	 * Search the Web Page content
	 */
	public static void buttonClick(String xpathValue)
	{
		driver.findElement(By.xpath(xpathValue)).click();
	}

}

