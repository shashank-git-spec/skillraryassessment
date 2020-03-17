package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.AnalyticalReasoningquestion2;

public class testanalyticalReasoningquestion2page implements Autoconstant {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    Alert d = driver.switchTo().alert();
	
	
	
	

	AnalyticalReasoningquestion2 m5 =new AnalyticalReasoningquestion2(driver);
	m5.taketestrbtn();
	m5.savebtn();

}
}
