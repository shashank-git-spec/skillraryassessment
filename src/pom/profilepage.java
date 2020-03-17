package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilepage {
			
	@FindBy(name="dob")
	private WebElement dateofbirthtb;
		
	@FindBy(name="tenth_branch")
	private WebElement tenthboardtb;
	
	@FindBy(name="tenth_py")
	private WebElement tenthpytb;
	
	@FindBy(name="tenth_per")
	private WebElement tenthpertb;
	
	@FindBy(name="twelveth_branch")
	private WebElement twelvethboardtb;
	
	@FindBy(name="twelveth_py")
	private WebElement twelvethpytb;
	
	@FindBy(name="twelveth_per")
	private WebElement twelvethpertb;
	
	@FindBy(name="college")
	private WebElement collegetb;
	
	@FindBy(name="degree")
	private WebElement degreetb;
	
	@FindBy(name="branch")
	private WebElement branchtb;
	
	@FindBy(name="degree_py")
	private WebElement degree_pytb;
	
	@FindBy(name="degree_per")
	private WebElement degree_pertb;
	
	@FindBy(name="university")
	private WebElement universitytb;
	
	@FindBy(name="gap")
	private WebElement gapradiobtn;
	
	@FindBy(name="state")
	private WebElement statetb;
	
	@FindBy(name="city")
	private WebElement citytb;
	
	@FindBy(name="pwl")
	private WebElement pwltb;
	
	@FindBy(xpath="//button[@class='subtn']")
	private WebElement updateprofilebtn; 
	
	@FindBy(xpath="(//a[.='Take Test'])[1]")
	private WebElement taketestbtn;
	
	
	
	public profilepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void dateofbirthtb(String name)
	{
	
		dateofbirthtb.sendKeys(name);	
	}
	
	public void tenthboardtb(String name)
	{
	
		tenthboardtb.sendKeys(name);	
	}
	
	public void tenthpytb(String name)
	{
	
		tenthpytb.sendKeys(name);	
	}
	
	public void tenthpertb(String name)
	{
	
		tenthpertb.sendKeys(name);	
	}
	
	public void twelvethboardtb(String name)
	{
	
		twelvethboardtb.sendKeys(name);	
	}
	
	public void twelvethpytb(String name)
	{
	
		twelvethpytb.sendKeys(name);	
	}
	
	public void twelvethpertb(String name)
	{
	
		twelvethpertb.sendKeys(name);	
	}
	
	public void collegetb(String name)
	{
	
		collegetb.sendKeys(name);	
	}
	
	public void degreetb(String name)
	{
	
		degreetb.sendKeys(name);	
	}
	
	public void branchtb(String name)
	{
	
		branchtb.sendKeys(name);	
	}
	
	public void degree_pytb(String name)
	{
	
		degree_pytb.sendKeys(name);	
	}
	
	public void degree_pertb(String name)
	{
	
		degree_pertb.sendKeys(name);	
	}
	
	public void universitytb(String name)
	{
		 universitytb.sendKeys(name);
	
	}

	public void gapradiobtn(String no)
	{
	
		gapradiobtn.sendKeys(no);	
	}
	
	public void statetb(String name)
	{
	
		statetb.sendKeys(name);	
	}
	
	public void citytb(String name)
	{
	
		citytb.sendKeys(name);	
	}
	
	public void pwltb(String name)
	{
	
		 pwltb.sendKeys(name);	
	}
	
	public void updateprofilebtn()
	{
	
		updateprofilebtn.click();	
	}
	
	public void taketestbtn()
	{
	
		taketestbtn.click();	
	}
	
	
}
