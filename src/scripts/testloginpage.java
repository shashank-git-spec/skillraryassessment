package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import genericlib.property;
import pom.loginpage;

public class testloginpage implements Autoconstant{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	
	
	
	
	loginpage l =new loginpage(driver);
	l.usernametb(property.getvalue(Propertyfilepath,"email"));
	l.passwordtb(property.getvalue(Propertyfilepath,"password"));
	l.loginbtn();

}
}
