package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pageFactory.Homepage;

import common.OutFitDataProperties;
import common.GetDriver;

public class Validate_selectionOfoptions {

	
	public static WebDriver driver = null;
	public static GetDriver getDriver =null;
	public String output="";
	public static OutFitDataProperties outfitDataProperties =null;
	

	@Test
	public void Validate_selectionOfoptions() {
		
			System.out.println("***Initializing the properties*****");
			outfitDataProperties = new OutFitDataProperties();
			getDriver =new GetDriver();
			driver = getDriver.getDriver(outfitDataProperties);
			driver.get(outfitDataProperties.getLink());
		
		
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			
			Homepage Validate_selectionOfoptions = PageFactory.initElements(driver, Homepage.class);
			/* Included sleep to analyse the page displayed*/
			Thread.sleep(1000);
			
			//output =homepage_navigation.getPageHeading().getText();
			//System.out.println("Section heading of page is: " + output);
			Validate_selectionOfoptions.getLetsGo().click();
			Thread.sleep(3000);
			
			/* Not selecting any option. Clicking on continue to check the warning */
			Validate_selectionOfoptions.getLeStyContinue().click();
			
			output = Validate_selectionOfoptions.getAlertMessage().getText();
			System.out.println("**** The warning message dislpayed as: " + output);
			Thread.sleep(1000);
			
			/* Closing the alert message window */
			Validate_selectionOfoptions.getAlertClose().click();
			Thread.sleep(1000);
			
			
			/* Making a minimum selection and clicking on Continue button */
			Validate_selectionOfoptions.getSelectOne().click();
			Thread.sleep(1000);
			
			Validate_selectionOfoptions.getLeStyContinue().click();
			Thread.sleep(1000);
			
			/* Closing the web page window */
			driver.quit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}