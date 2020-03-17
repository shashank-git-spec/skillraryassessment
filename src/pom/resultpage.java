package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultpage {	
	
	@FindBy(xpath="(//a[@class='btn registerBtn'][4]")
	private WebElement logoutbtn;
	

	public resultpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logoutbtn()
	{
	
		logoutbtn.click();	
	}
	
}
