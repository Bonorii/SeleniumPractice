package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginwithbeforemethod {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Swadel\\Browserfolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel");
		
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("peeade04@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("@Swadel2");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("peeade04@gmail.com");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("@Swadel24");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void afterMyTest() {
		driver.quit(); 
	}
}
