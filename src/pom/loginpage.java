  package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(name="email")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbtn;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void usernametb(String name)
	{
	
		usernametb.sendKeys(name);	
	}
	
	public void passwordtb(String name)
	{
	
		passwordtb.sendKeys(name);	
	}
	
	public void loginbtn()
	{
	
		loginbtn.click();	
	}
	
}
