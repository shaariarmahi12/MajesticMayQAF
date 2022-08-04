 package com.careerhack.steps;




import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.careerhack.common.MajesticMayBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MajesticMayGoogleSearch extends MajesticMayBase {
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
	   //step.identify(locate) webElement
		//8 locators
		//1.id 2.name 3.class name 4.html tag 5.link text 6.partial link text 7.xpath 8.css selector
		//WebElement searchBox=driver.findElement(By.name("q");
		//searchBox.sendKeys(string)
		//step2: Action
		HomePage hp =new HomePage(driver);
		hp.enterSearch(string);
		}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement searchButton=driver.findElement(By.name("btnk");
		//searchButton.click();
		
		HomePage hp=new HomePage(driver);
		hp.clickSearch();
	}
		
		
	@Then("I receive relevent results")
	public void i_receive_relevent_results() {
		//WebElement searchResult=driver.findElement(By.id("result-stats"));
		//searchResult.click()
		//step:2 perform action
		HomePage hp=new HomePage(driver);
		hp.captureResults();
	
		closeBrowser();
	}

	
}
