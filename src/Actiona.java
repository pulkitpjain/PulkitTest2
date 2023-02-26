import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		
		//Moves mouse to Specific Element
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		/*Option 2 to move a move to specific element
		  
		 Actions a = new Actions(driver);
		  
		 WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		 
		 a.moveToElement(move).build().perform();
		
		 */
		
		// Move Mouse and Enter Text in UPPERCASE
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//Move Mouse and Enter Text in UPPERCASE and Select That Text
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Right Click on an Element
		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();	
		
	}

}
