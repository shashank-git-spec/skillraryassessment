package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taketestpage {
	
	
	
	
	@FindBy(name="code")
	private WebElement codetb;
	
	@FindBy(xpath="//button[@class='btn  btn-md login-button']")
	private WebElement takebutton;

	
	public taketestpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	
	
	public void codetb(String name)
	{
	
		codetb.sendKeys(name);	
	}
	
	public void takebutton()
	{
	
		takebutton.click();	
	}

	
}
