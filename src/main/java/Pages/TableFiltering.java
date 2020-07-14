package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableFiltering {

	public WebDriver driver;
	By searchData= By.xpath("//input[@id='task-table-filter']");
	By table= By.xpath("//*[@id=\"task-table\"]/thead/tr");
	By row1= By.xpath("//*[@id=\"task-table\"]/tbody/tr[1]");
	By tablepageHeader= By.xpath("//h2[contains(text(),'Type in your search to filter data by Tasks / Assignee / Status ')]");
	
		
	
	public TableFiltering(WebDriver driver) {
		
		this.driver=driver;
		
		}
	
	//getting Input Form dropdown
	public List<WebElement> getTable() {
		
		return driver.findElements(table);
		
	}
	
	//getting Page title
		public WebElement getTablePageHeader() {
			
			return driver.findElement(tablepageHeader);
			
			
		}
	
	//getting Search field
	public WebElement getSearchField() {
		
		return driver.findElement(searchData);
		
	}
	
	//getting row 1
	public WebElement getRow1() {
		
		return driver.findElement(row1);
		
	}
	
	
}
