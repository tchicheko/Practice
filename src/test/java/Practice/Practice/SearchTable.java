package Practice.Practice;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.InputForm;
import Pages.TableFiltering;
import Resources.base;

public class SearchTable extends base {

	public WebDriverWait w;
	public  TableFiltering tableFilteringElements;
	public  HomePage homePageElements;
	public SoftAssert softAssert;
	
	@BeforeTest
	
	public void initialise() throws IOException {
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		 softAssert= new SoftAssert();
		
		 homePageElements = new HomePage(driver);
		 w= new WebDriverWait(driver, 5);
		 
		 w.until(ExpectedConditions.visibilityOf(homePageElements.getCloseIcon()));
		  	homePageElements.getCloseIcon().click();
		
		  	
		  
		tableFilteringElements= new TableFiltering(driver);
		w.until(ExpectedConditions.visibilityOf(homePageElements.getTableMenu()));
		homePageElements.getTableMenu().click();
		w.until(ExpectedConditions.visibilityOf(homePageElements.getInputFormSubmit()));
		
		homePageElements.tableDataSearch().click();

		
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();		
	}
	
	@Test(dataProvider= "getSeachData", dataProviderClass=dataProvider.class)
	public void submitForm(String searchText ) {
		
		w.until(ExpectedConditions.visibilityOf(tableFilteringElements.getTablePageHeader()));
		tableFilteringElements.getSearchField().sendKeys(searchText);
		
		w.until(ExpectedConditions.visibilityOf(tableFilteringElements.getRow1()));
		
		softAssert.assertEquals(tableFilteringElements.getRow1().getText(), searchText);
		softAssert.assertAll();
		
		
	
	}
	
}
