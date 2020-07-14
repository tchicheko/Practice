package Practice.Practice;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.InputForm;
import Resources.base;


public class CaptureForm extends base {

	public WebDriverWait w;
	public  HomePage homePageElements;
	
	@BeforeTest
	
	public void initialise() throws IOException {
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		SoftAssert softAssert= new SoftAssert();
		
		 w= new WebDriverWait(driver, 5);
		 homePageElements = new HomePage(driver);
		  
		w.until(ExpectedConditions.visibilityOf(homePageElements.getCloseIcon()));
	  	homePageElements.getCloseIcon().click();
	  	
	  	InputForm inputFormElements= new InputForm(driver);
		w.until(ExpectedConditions.visibilityOf(homePageElements.getInputFormsMenu()));
		homePageElements.getInputFormsMenu().click();
		w.until(ExpectedConditions.visibilityOf(homePageElements.getInputFormSubmit()));
		
		homePageElements.getInputFormSubmit().click();

		
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();		
	}
	
	@Test(dataProvider= "getData", dataProviderClass=dataProvider.class)
	public void submitForm(String Name, String LastName, String email,String PhoneNumber, String address,String city,String state, String zipcode, String website,String hosting,String projectDescription ) {
		
		
		InputForm inputFormElements= new InputForm(driver);
		//w.until(ExpectedConditions.visibilityOf(homePageElements.getInputFormsMenu()));
		//homePageElements.getInputFormsMenu().click();
		//w.until(ExpectedConditions.visibilityOf(homePageElements.getInputFormSubmit()));
		
		//homePageElements.getInputFormSubmit().click();
		w.until(ExpectedConditions.visibilityOf(inputFormElements.getPageHeader()));
		
		inputFormElements.getFirstName().sendKeys(Name);
		inputFormElements.getLastName().sendKeys(LastName);
		inputFormElements.getEmail().sendKeys(email);
		inputFormElements.getPhone().sendKeys(PhoneNumber);
		inputFormElements.getAddress().sendKeys(address);
		inputFormElements.getCity().sendKeys(city);
		inputFormElements.getState().selectByVisibleText(state);
		inputFormElements.getZipcode().sendKeys(zipcode);
		inputFormElements.getWebsite().sendKeys(website);
		
		if(hosting.equals("Yes")) {
			
			inputFormElements.getYesOption().click();
			
		}
		
		else {
			
			inputFormElements.getNoOption().click();
		}
		
		inputFormElements.getProjectDescription().sendKeys(projectDescription);
		inputFormElements.getSubmitButton().click();
		
	
	
	}
	
}
