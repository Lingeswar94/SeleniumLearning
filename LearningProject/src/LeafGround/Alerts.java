package LeafGround;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		WebElement simple=driver.findElement(By.id("j_idt88:j_idt91"));
		simple.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement con=driver.findElement(By.id("j_idt88:j_idt93"));
		con.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		WebElement conss=driver.findElement(By.id("j_idt88:j_idt95"));
		con.click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement sweet=driver.findElement(By.id("j_idt88:j_idt104"));
		sweet.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("qwerer");
		alert3.accept();
		
		WebElement del=driver.findElement(By.id("j_idt88:j_idt106"));
		del.click();
		Alert alert4=driver.switchTo().alert();
		WebElement yes=driver.findElement(By.id("j_idt88:j_idt108"));
		yes.click();
		
		
		WebElement minmax=driver.findElement(By.id("j_idt88:j_idt111"));
		minmax.click();
		Alert alert5=driver.switchTo().alert();
		
	}

}
