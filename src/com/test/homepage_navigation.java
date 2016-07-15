package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pageFactory.Homepage;

import common.OutFitDataProperties;
import common.GetDriver;

public class homepage_navigation {

	
	public static WebDriver driver = null;
	public static GetDriver getDriver =null;
	public String output="";
	public static OutFitDataProperties outfitDataProperties =null;
	

	@Test
	public void homepage_navigation() {
		
			System.out.println("***Initializing the properties*****");
			outfitDataProperties = new OutFitDataProperties();
			getDriver =new GetDriver();
			driver = getDriver.getDriver(outfitDataProperties);
			driver.get(outfitDataProperties.getLink());
		
		
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			
			Homepage homepage_navigation = PageFactory.initElements(driver, Homepage.class);
			/* Included sleep to analyse the page displayed*/
			Thread.sleep(1000);
			//output =homepage_navigation.getPageHeading().getText();
			//System.out.println("Section heading of page is: " + output);
			homepage_navigation.getLetsGo().click();
			Thread.sleep(3000);
			
			driver.quit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
