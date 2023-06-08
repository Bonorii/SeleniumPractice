package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginwithbeforetest {
	WebDriver driver;
	@BeforeTest
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Swadel\\Browserfolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel");
	}
	
	@Test
	public void invalidLogin() {
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("peeade04@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("@Swadel2");
		
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void validLogin() {
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("peeade04@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("@Swadel24");
		
		driver.findElement(By.name("login")).click();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
