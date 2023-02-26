import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Pulkit");
		driver.findElement(By.name("email")).sendKeys("pulkit@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pulkit123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select Gender = new Select(dropdown);
		Gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1990");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
		
		//class form-control ng-untouched ng-pristine ng-invalid
		//id exampleInputPassword1
		//id exampleCheck1
		

	}

}
