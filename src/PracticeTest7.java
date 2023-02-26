import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1. Find out how many links are on the Page (Count)
		//For every link there will be a Tag 'a'
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Get me the count of links present in the Footer Section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());	//limiting to footer
		
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		//3. Get me the count from 1st section of Footer
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. Check on each link in the column and check if the pages are opening
		
		for (int i =1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(3000);
		}
			Set<String> abc = driver.getWindowHandles(); //[parentid,childid]
			Iterator<String> it = abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		driver.quit();
	}
}
