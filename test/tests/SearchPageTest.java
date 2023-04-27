package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import main.base.TestBase;
import main.pages.SearchPage;

public class SearchPageTest  extends TestBase{

	static SearchPage searchPage;		
	@BeforeMethod
	public  void setup() {	
		searchPage = new SearchPage();
	}

	@Test
	public static void searchPage() throws InterruptedException {
		String inputString ="Nike Shoe";
		searchPage.enterSearchItem(inputString);
		searchPage.clickSearch();
		String searchString = searchPage.getSearchText();	
		assertTrue(searchString.contains(inputString));
	}
}
