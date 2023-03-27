package LeafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement a = driver.findElement(By.id("j_idt87:j_idt89"));
		a.click();

		WebElement s = driver.findElement(By.id("j_idt87:j_idt92"));
		s.click();

		WebElement d = driver.findElement(By.xpath("//span[contains(text(),'Click First Button')]"));
		d.click();

		WebElement f = driver.findElement(By.xpath("//span[contains(text(),'Click Second')]"));
		f.click();

		WebElement g = driver.findElement(By.xpath(
				"//button[@id='j_idt87:j_idt98']//span[@class='ui-button-text ui-c'][normalize-space()='Click']"));
		g.click();

		WebElement h = driver.findElement(By.id("j_idt87:j_idt99"));
		System.out.println(h.getText());

	}

}
