package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("form:conpnl_header"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drag).build().perform();
		
		WebElement Target=driver.findElement(By.xpath("//p[normalize-space()='Drag to target']"));
	    WebElement to=	driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(Target, to).build().perform();
		
		WebElement cat=driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt97']"));
		WebElement qu=driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt99']"));
		Actions actions3=new Actions(driver);
		actions3.clickAndHold(cat).moveToElement(qu).release(qu).build().perform();
		
		List<WebElement> name=driver.findElements(By.xpath("//tbody[@id='form:j_idt111_data']/tr"));
		
		WebElement	Fromele =name.get(0);
		WebElement Toele=name.get(5);
		
		Actions actions4=new Actions(driver);
		actions4.dragAndDrop(Fromele, Toele);
		//actions4.moveToElement(Toele);
		actions4.release(Toele);
		actions4.build().perform();
		
	}

}
