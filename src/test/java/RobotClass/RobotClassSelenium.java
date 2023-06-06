package RobotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
@Test
public class RobotClassSelenium {
	
	public void KeyBoard() throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//opening a pdf url to save it using keyboard actions
		driver.get("https://www.africau.edu/images/default/sample.pdf");
		driver.manage().window().maximize();
		//creating object of the robot class
		Robot rb = new Robot();
		//press on Ctrl key+Save
		rb.keyPress(KeyEvent.VK_CONTROL);
		//save
		rb.keyPress(KeyEvent.VK_S);
		//Release the keys
		rb.keyRelease(KeyEvent.VK_CONTROL);//control
		rb.keyRelease(KeyEvent.VK_S);//save
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);//Enter to save it in folder
		Thread.sleep(2000);		
		driver.close();
		
	}
}
