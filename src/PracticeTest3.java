import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PracticeTest3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.manage().window().maximize();
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Potato","Walnuts"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit Wait
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.close();
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			//splitting the text
			String[] name=products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//check wheather name you extracted is present in array or not
			//convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//Click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}
}
