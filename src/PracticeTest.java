import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();

	}

}
