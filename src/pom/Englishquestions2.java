package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Englishquestions2 {
	
	@FindBy(xpath="(//input[@name='answer'])[1]")
	private WebElement taketestrbtn;
	
	@FindBy(xpath="//button[@class='saveBtn']")
	private WebElement savebtn;
	
	public  Englishquestions2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void taketestrbtn()
	{
	
		taketestrbtn.click();	
	}
	
	
	public void savebtn()
	{
	
		savebtn.click();	
	}

}
