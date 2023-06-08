package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whishlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Swadel\\Browserfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel");
		
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.wishlist_header_1_right_3.inner_wishlist_header_1_right_1 > div > a > i")).click();	
	}

}
