import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		WebDriverWait wait= new WebDriverWait (driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List <WebElement> products= driver.findElements(By.cssSelector(".card-footer"));
		
		for(int i=0;i<products.size(); i++)
		{
			products.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		//driver.findElement(By.partialLinkText("Checkout")).click();
		//System.out.println(driver.findElement(By.xpath("//label[@for='country']")).getText());
		driver.close();
		
	}

}
