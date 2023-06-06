import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		// IMPLICIT wait is a global wait-is applicable for all the webElements for which driver is interacting-5sec
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//EXPLICIT Wait= WebDriverWait(class), wait(variable), create an object to it using constructors WebDriverWait(Web driver, Duration)
		
		WebDriverWait waitfor = new WebDriverWait(driver, Duration.ofSeconds(15));
		//where ever we use this "waitfor" it is applicable for explicit wait
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//waitfor is used with condition until Webelement is visible using preconditions
		waitfor.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.close();
	}
}