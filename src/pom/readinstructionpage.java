package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class readinstructionpage {
	
	@FindBy(xpath="//label[@class='checkbox-custom-label']")
	private WebElement taketestbtn;
	
	@FindBy(xpath="//button[@class='startBtn']")
	private WebElement startbtn;
	
	public readinstructionpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void taketestbtn()
	{
	
		taketestbtn.click();	
	}
	
	public void startbtn()
	{
	
		startbtn.click();	
	}
	
	

}
