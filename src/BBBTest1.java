import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBBTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		//driver.get("https://www.bedbathandbeyond.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(10000);
		
		//driver.findElement(By.id("babyLogo")).click();
		
		//driver.findElement(By.cssSelector(".accountTxt")).click();
		
		//driver.findElement(By.linkText("sign in")).click(); //did not work
		//driver.findElement(By.tagName("p")).click(); //did not work
		
		//driver.findElement(By.className("headerBtn midCtr menuBurger")).click(); //did not work
		//driver.close();

	}

}
