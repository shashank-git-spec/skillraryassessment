package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.Englishquestions2;

public class testEnglishquestions2page implements Autoconstant{
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	
	
	Englishquestions2 m2 =new Englishquestions2(driver);
	m2.taketestrbtn();
	m2.savebtn();

}
}
