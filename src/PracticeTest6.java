import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.close();

	}

}
