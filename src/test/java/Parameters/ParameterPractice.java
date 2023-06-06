package Parameters;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {
	//Add Parameter Annotation for which the data is stored in testng.xml
	@Parameters({"user-name","password"})
	@Test
	public static void main(String Uname, String Pword) throws InterruptedException {	//give the string values to store the username and password
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		//Implicit wait of 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Uname);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(Pword);
		driver.findElement(By.className("btn_action")).click();	  
		driver.close();
	}
}
