package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import genericlib.property;
import pom.AnalyticalReasoningquestion1;
import pom.AnalyticalReasoningquestion2;
import pom.Englishquestions1;
import pom.Englishquestions2;
import pom.Englishquestions3;
import pom.QuantitativeAptitudeandStatisticsquestion1;
import pom.QuantitativeAptitudeandStatisticsquestion2;
import pom.Singuppage;
import pom.loginpage;
import pom.profilepage;
import pom.readinstructionpage;
import pom.resultpage;
import pom.taketestpage;

public class testSinguppage implements Autoconstant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
		
		
		
		Singuppage s =new Singuppage(driver);
		
		s.fistnametb(property.getvalue(Propertyfilepath,"firstname"));
		s.lastnametb(property.getvalue(Propertyfilepath,"lastname"));
		s.gendertb(property.getvalue(Propertyfilepath,"gender"));
		s.mobiletb(property.getvalue(Propertyfilepath,"number"));
		s.emailtb(property.getvalue(Propertyfilepath,"email"));
		s.passwordtb(property.getvalue(Propertyfilepath,"password"));
		s.submitbtn();	
		
	
			
		
}
}
