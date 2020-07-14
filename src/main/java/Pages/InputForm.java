package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InputForm {

	public WebDriver driver;
	
	By firstName= By.xpath("//input[@name='first_name']");
	By lastName = By.cssSelector("input[name='last_name']");
	By email= By.xpath("//input[@name='email']");
	By phone= By.xpath("//input[@name='phone']");
	By address= By.xpath("//input[@name='address']");
	By city= By.xpath("//input[@name='city']");
	//By state= By.xpath("//input[@name='state']");
	By zip= By.xpath("//input[@name='zip']");
	By website= By.xpath("//input[@name='website']");
	By yesOption= By.xpath("//input[@value='yes']");
	By noOption= By.xpath("//input[@value='no']");
	By projectDescription= By.xpath("//textarea[@name='comment']");
	By submitButton= By.xpath("//button[@type='submit']");
	By pageHeader= By.xpath("//h2[contains(text(),'Input form with validations')]");

	
	//class constructor
	public InputForm (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//getting First Name field
	public WebElement getFirstName() {
		
		return driver.findElement(firstName);
		
		
	}
	
	//getting Page title
	public WebElement getPageHeader() {
		
		return driver.findElement(pageHeader);
		
		
	}
	
	//getting Last Name field
	public WebElement getLastName() {
		
		return driver.findElement(lastName);
		
		
	}
	
	//getting Email field
	public WebElement getEmail() {
		
		return driver.findElement(email);
		
		
	}
	
	//getting Phone field
	public WebElement getPhone() {
		
		return driver.findElement(phone);
		
		
	}
	
	//getting Address field
		public WebElement getAddress() {
			
			return driver.findElement(address);
			
			
		}
		
		//getting City field
				public WebElement getCity() {
					
					return driver.findElement(city);
					
					
				}
				
				//getting State field
				public Select getState() {
					
					Select stateOptions= new Select(driver.findElement(By.xpath("//select[@name='state']")));
					return stateOptions;
					
					
				}
				
				//getting Zip code field
				public WebElement getZipcode() {
					
					return driver.findElement(zip);
					
					
				}
				
				//getting Website domain field
				public WebElement getWebsite() {
					
					return driver.findElement(website);
					
					
				}
				
				//getting Yes Option radio button
				public WebElement getYesOption() {
					
					return driver.findElement(yesOption);
					
					
				}
				
				//getting No Option radio button
				public WebElement getNoOption() {
					
					return driver.findElement(noOption);
					
					
				}
				
				//getting Project Description  field
				public WebElement getProjectDescription() {
					
					return driver.findElement(projectDescription);
					
					
				}
				
				//getting Submit button
				public WebElement getSubmitButton() {
					
					return driver.findElement(submitButton);
					
					
				}
	
	
}
