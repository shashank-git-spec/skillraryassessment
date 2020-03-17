package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.Englishquestions3;

public class testEnglishquestions3page implements Autoconstant {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    Alert d = driver.switchTo().alert();
	
	
	

	Englishquestions3 m3 =new Englishquestions3(driver);
	m3.taketestrbtn();
	m3.savebtn();

}
}
