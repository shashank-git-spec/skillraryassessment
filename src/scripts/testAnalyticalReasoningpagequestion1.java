package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.AnalyticalReasoningquestion1;

public class testAnalyticalReasoningpagequestion1 implements Autoconstant {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	

	AnalyticalReasoningquestion1 m4 =new AnalyticalReasoningquestion1(driver);
	m4.taketestrbtn();
	m4.savebtn();
	

}
}
