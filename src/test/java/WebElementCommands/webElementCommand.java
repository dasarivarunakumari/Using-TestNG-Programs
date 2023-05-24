package WebElementCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class webElementCommand {
	public WebDriver driver;

	@BeforeMethod
	public void BrowserCheck() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void webElement() throws InterruptedException {
		// SendKeys()-used to send any keys "Mobile Phone"
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// clear()-used to clear
		// driver.findElement(By.id("user-name")).clear();
		// Thread.sleep(3000);
		// click()- to click something
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Login button Inspect have <form /> tag, if I use submit here it will work
		driver.findElement(By.id("login-button")).submit(); //Pass
		//driver.findElement(By.className("btn_action")).click(); //Pass
		Thread.sleep(3000);
		driver.close();
	}

//Submit()-Using this we can directly Login Page without Clicking/Inspecting the Login Button, adding submit method to any of the user or password elements
//It submits the details directly with SUBMIT method	
	/*@Test
	public void login2() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).submit();
		driver.close();*/
	

}
