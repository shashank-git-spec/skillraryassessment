package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.QuantitativeAptitudeandStatisticsquestion1;

public class testQuantitativeAptitudeandStaticsquestion1page implements Autoconstant {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	

	
	QuantitativeAptitudeandStatisticsquestion1 m6 =new QuantitativeAptitudeandStatisticsquestion1(driver);
	m6.taketestrbtn();
	m6.savebtn();

}
}
