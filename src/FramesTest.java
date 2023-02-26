import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//Find out how many frames are on the webpage
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		
		//Drag and Drop
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		//Switch back to normal window or come out of frame
		
		driver.switchTo().defaultContent();
		
		driver.close();
		

	}

}
