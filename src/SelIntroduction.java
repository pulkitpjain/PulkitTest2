import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver exten -> Methods close get
		//Firefox - FirefoxDriver -> methods close get
		//Safari - SafariDriver -> methods close get
		// Webdriver close get
		// Webdriver methods + Class methods
		// chromedriver.exe -> chrome browser
		//below path is not needed as it is already taken care by chrome team
		//System.setProperty("WebDriver.chrome.driver", "/Users/pulkitpjain/Documents/chromedriver_mac64/chromedriver");
		//webdriver.chrome.driver->value of path
		
		//Chrome Browser = ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Firefox Browser = geckodriver
		//WebDriver.gecko.driver
		//System.setProperty("WebDriver.gecko.driver", "/Users/pulkitpjain/Documents/");
		//WebDriver driver = new FireFoxDriver();
		
		//Microsoft Edge
		//WebDriver.edge.driver
		//System.setProperty("WebDriver.edge.driver", "/Users/pulkitpjain/Documents/");
		//WebDriver driver = new EdgeDriver();
		
		//driver.get("https://rahulshettyacademy.com/");
		driver.get("https://www.bedbathandbeyond.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		//driver.findElement(By.cssSelector("p.accountTxt")).click();
		//driver.quit();
		
		// difference between close and quit is close will close the current window, quit will close all windows open by selenium 
	}

}
