package main.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.base.TestBase;

public class SearchPage extends TestBase {
	
	public SearchPage() 	
	{
	PageFactory.initElements(driver, this);
	};
	
	@FindBy(xpath="//*/input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;

	@FindBy(xpath = "/*//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
	WebElement searchText;

	//Method to enter Search Item
	public void enterSearchItem(String Input) throws InterruptedException {
		buttonClick(searchTextBox);	
		searchTextBox.sendKeys(Input);
			
	}

	//Method to click on search button
	public void clickSearch() throws InterruptedException {
		buttonClick(searchButton);	
	}
	
	public String getSearchText() {
		return searchText.getText();
	}

	private void buttonClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();		
	}	

}
