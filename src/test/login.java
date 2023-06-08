package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Swadel\\Browserfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel");
		
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("peeade04@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("@Swadel24");
		
		driver.findElement(By.name("login")).click();
	}

}
