import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.path2usa.com/travel-companion/");
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getText());
		
		//driver.close();
		
		driver.get("https://www.makemytrip.com");
		Thread.sleep(5000);
		
		//Selecting a date
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
		
		Thread.sleep(5000);
		while (!driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dateInnerCell'][p]"));
		
		int count = driver.findElements(By.xpath("//div[@class='dateInnerCell'][p]")).size();
		
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.xpath("//div[@class='dateInnerCell'][p]")).get(i).getText();
			if (text.equalsIgnoreCase("3"))
			{
				driver.findElements(By.xpath("//div[@class='dateInnerCell'][p]")).get(i).click();
				break;
			}
		}
		
		
	}

}
