package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	//Page Object Model--using page factory
	public HomePage(WebDriver  driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//identify a web element  
     //WebElement SearchBox=driver.findElement(By.name("q"));
	
	@FindBy(name="q")
	WebElement searchBox;
	
	//searchBox.sendKeys(string);
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}   
	     //identify the element
		//WebElement searchButton=driver.findElement(By.name("btnK"));
		@FindBy(name="btnK")
		WebElement searchButton;
		
		//perform action
		//searchButton.click();
		public void clickSearch() {
			searchButton.click();
		}
		//WebElement searchResult=driver.findElement(By.id("result-stats"));
		@FindBy(id="result-stats")
		WebElement searchResults;
		
		public void captureResults() {
	    WebElement searchResult=driver.findElement(By.id("result-stats"));
		String numResults=searchResult.getText();
		System.out.println();
		System.out.println(numResults);
		System.out.println();
			
			
			
			
			
			
		}

		
			
			
		}
		
		
	
	

