package SwtichCommands;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class DragandDrop {	
@Test
	public void DragDro() throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	//Move to drag and drop Frame using IFrame concept
	WebElement frame = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	Thread.sleep(3000);
	Actions action = new Actions(driver); //Action class
	//dragAndDrop(WebELement source, WebElementtarget)-method and as action class is used call build().perform(); to perform action 
	action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(3000);
	driver.close();	
}
}
