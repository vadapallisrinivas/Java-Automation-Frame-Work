package main.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import main.base.TestBase;

public class HomePage extends TestBase{
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String getTitle() {
		return driver.getTitle();
	}

	
}
