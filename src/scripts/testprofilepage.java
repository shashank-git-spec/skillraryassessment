package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.Autoconstant;
import genericlib.property;
import pom.profilepage;

public class testprofilepage implements Autoconstant {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, value);
	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/user/registration");
	    //Alert d = driver.switchTo().alert();
	
	
	
	
	
	
	

	profilepage p =new profilepage(driver);
	p.dateofbirthtb(property.getvalue(Propertyfilepath,"dob"));
	p.tenthboardtb(property.getvalue(Propertyfilepath,"tenth_branch"));
	p.tenthpytb(property.getvalue(Propertyfilepath,"tenth_py"));
	p.tenthpertb(property.getvalue(Propertyfilepath,"tenth_per"));
	p.twelvethboardtb(property.getvalue(Propertyfilepath,"twelveth_branch"));
	p.twelvethpytb(property.getvalue(Propertyfilepath,"twelveth_py"));
	p.twelvethpertb(property.getvalue(Propertyfilepath,"twelveth_per"));
	p.collegetb(property.getvalue(Propertyfilepath,"college"));
	p.branchtb(property.getvalue(Propertyfilepath,"branch"));
	p.degreetb(property.getvalue(Propertyfilepath,"degree"));
	p.degree_pytb(property.getvalue(Propertyfilepath,"degree_py"));
	p.degree_pertb(property.getvalue(Propertyfilepath,"degree_per"));
	p.universitytb(property.getvalue(Propertyfilepath,"university"));
	p.gapradiobtn(property.getvalue(Propertyfilepath,"gap"));
	p.statetb(property.getvalue(Propertyfilepath,"state"));
	p.citytb(property.getvalue(Propertyfilepath,"city"));
	p.pwltb(property.getvalue(Propertyfilepath,"pwl"));
	p.updateprofilebtn();
	p.taketestbtn();
	

}
}
