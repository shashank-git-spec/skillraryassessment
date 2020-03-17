package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import genericlib.property;
import pom.taketestpage;

public class testtaketestpage implements Autoconstant {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	
	
	
	
	taketestpage t =new taketestpage(driver);
	
	t.codetb(property.getvalue(Propertyfilepath,"code"));
	Thread.sleep(3000);
	t.takebutton();

}
}
