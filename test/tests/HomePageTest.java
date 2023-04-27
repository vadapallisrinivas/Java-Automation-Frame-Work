package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import main.base.TestBase;
import main.pages.HomePage;

public class HomePageTest extends TestBase{

	static HomePage homePage;		
	@BeforeMethod
	public  void setup() {	
		homePage = new HomePage();
	}


	
	@Test
	public static void homePageTitle() {
		String title = homePage.getTitle();
		System.out.println("Title ::"+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");		
	}	
	

}
