package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	
	//HoemPage Outfittery Logo name
	@FindBy(xpath=".//*[@id='main_navigation']/div/div[1]/a/div")
	private WebElement LogoName;
	public WebElement getLogoName() {
		return LogoName;
	}
	
	
	//Clicking on 'Let's Go' Link. Starting the tour
	@FindBy(xpath=".//*[@id='teaser_section']/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")
	private WebElement LetsGo;
	public WebElement getLetsGo() {
		return LetsGo;
	}
	
	
	//Reading the page's tittle heading
		@FindBy(xpath=".//*[@id='main_navigation']/div/div[1]/a/div")
		private WebElement PageHeading;
		public WebElement getPageHeading() {
			return PageHeading;
		}
		
	
	//Continue button in Leisure Style's page
		@FindBy(xpath=".//*[@id='question_section']/div/div/div/div[3]/div[2]/a")
		private WebElement LeStyContinue;
		public WebElement getLeStyContinue() {
			return LeStyContinue;
		}
	
	
	
	//Warning alert message for not selecting any option
		//@FindBy(xpath=".//*[@id='alertModal']/div/div")
		@FindBy(xpath=".//*[@id='alertModal']/div/div/span")
		private WebElement AlertMessage;
		public WebElement getAlertMessage() {
			return AlertMessage;
		}
	
		
    //Closing the error message alert window
		@FindBy(xpath=".//*[@id='alertModal']/div/div/button")
		private WebElement AlertClose;
		public WebElement getAlertClose() {
			return AlertClose;
		}
	
	//Selecting any option from the choice given
		@FindBy(xpath=".//*[@id='question_section']/div/div/div/div[2]/div[1]/a/div")
		private WebElement SelectOne;
		public WebElement getSelectOne() {
			return SelectOne;
		}	
		
}
