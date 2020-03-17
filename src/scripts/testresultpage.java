package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.resultpage;

public class testresultpage implements Autoconstant{
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	

	resultpage rs =new resultpage(driver);
	rs.logoutbtn();	

}
}
