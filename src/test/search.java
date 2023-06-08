package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Swadel\\Browserfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("s")).sendKeys("Marco Tank");
		
		//driver.findElement(By.id("menu-header_2-1357")).click();
		
		//driver.findElement(By.linkText("Mirko Artist Tee off white")).click();
		
		//driver.findElement(By.partialLinkText("Tee off white")).click();	
		
		//ClassName
		//int sliders=driver.findElements(By.className("slide")).size();
		//System.out.println(sliders);
		
		//TagName
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}
