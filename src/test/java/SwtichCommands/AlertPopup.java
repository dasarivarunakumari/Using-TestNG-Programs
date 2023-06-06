package SwtichCommands;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		//click to open the popup
		driver.findElement(By.id("alertBox")).click();
		//to close the popup by accepting it
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}
}
