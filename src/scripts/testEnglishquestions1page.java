package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.Englishquestions1;

public class testEnglishquestions1page implements Autoconstant {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	
	Englishquestions1 m1 =new Englishquestions1(driver);
	m1.taketestrbtn();
	m1.savebtn();

}
}
