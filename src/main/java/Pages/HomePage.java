package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	By inputFormMenuOption= By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a");
	By inputFormSubmit= By.xpath("//a[contains(text(),'Input Form Submit')]");
	By close= By.xpath("//a[@title='Close']");
	By tableMenuOption= By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a");
	By tableDataSearch= By.xpath("//a[contains(text(),'Table Data Search')]");
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		}
	
	//getting Input Form dropdown
	public WebElement getInputFormsMenu() {
		
		return driver.findElement(inputFormMenuOption);
		
	}
	
	//getting input form submit
	public WebElement getInputFormSubmit() {
		
		return driver.findElement(inputFormSubmit);
		
	}
	
	//getting close icon
		public WebElement getCloseIcon() {
			
			return driver.findElement(close);
			
		}
	
		//getting table menu option
				public WebElement getTableMenu() {
					
					return driver.findElement(tableMenuOption);
					
				}
	
				//getting table search option
				public WebElement tableDataSearch() {
					
					return driver.findElement(tableDataSearch);
					
				}
	
	
}
