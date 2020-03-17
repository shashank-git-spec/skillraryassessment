package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singuppage {
	
	
	@FindBy(name="firstname")
	private WebElement fistnametb;
	
	@FindBy(name="lastname")
	private WebElement lastnametb;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement mobiletb;
	
	@FindBy(name="gender")
	private WebElement gendertb;
	
	@FindBy(name="email")
	private WebElement emailtb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@class='subtn']")
	private WebElement submitbtn;
	
	
	public Singuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	public void fistnametb(String name)
{
	
		fistnametb.sendKeys(name);
}
	public void lastnametb(String name)
{
	
		lastnametb.sendKeys(name);
}

	public void mobiletb(String number)
{
	
		 mobiletb.sendKeys(number);
}
	
	public void gendertb(String name) {
		gendertb.sendKeys(name);
		
}	
	
	public void emailtb(String name)
{
	
		emailtb.sendKeys(name);	
}
	
	public void passwordtb(String name)
{
	
		passwordtb.sendKeys(name);	
}
	
	public void submitbtn()
{
	
		submitbtn.click();	
}
	
}
