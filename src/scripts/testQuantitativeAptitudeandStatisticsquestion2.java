package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import pom.QuantitativeAptitudeandStatisticsquestion2;

public class testQuantitativeAptitudeandStatisticsquestion2 implements Autoconstant {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    Alert d = driver.switchTo().alert();
	
	
	
	
	
	
	QuantitativeAptitudeandStatisticsquestion2 m7 =new QuantitativeAptitudeandStatisticsquestion2(driver);
	m7.taketestrbtn();
	m7.savebtn();
}

}
