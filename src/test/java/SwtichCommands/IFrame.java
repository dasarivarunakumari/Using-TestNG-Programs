package SwtichCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		driver.findElement(By.id("accept-choices")).click();
		driver.findElement(By.id("runbtn")).click();
		WebElement ele = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		driver.findElement(By.id("w3loginbtn")).click();
		//driver.switchTo().defaultContent();
	}

}
