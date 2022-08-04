package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		//html tag [@ attribute = 'value']
		//Absolute  xpath==/== location dependent--locate in by location-never ever use absolute
		//Relative xpath--/-- location independent--locate it attributes/properties-always use relative xpath
		//Grammar of finding relative xpath:
		//html tag[@attribute='value']
		WebElement chk1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement chk2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(chk1.isSelected()==false)
			chk1.click();
		if(chk2.isSelected()==false)
			chk2.click();
		
		
		

	}

}
