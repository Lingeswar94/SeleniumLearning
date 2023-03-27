package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement fram=driver.findElement(By.id("Click"));
		fram.click();
		driver.switchTo().defaultContent();
		
	List<WebElement> total=	driver.findElements(By.tagName("iframe"));
	int x=	total.size();
	System.out.println(x);
	
	driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement sec=driver.findElement(By.xpath("//button[@id='Click']"));
		sec.click();
		
		
		
	}

}
