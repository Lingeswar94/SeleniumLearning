package LeafGround;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();

		WebElement Basic = driver
				.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		Basic.click();

		WebElement Note = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']"));
		Note.click();

		WebElement favr = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div"));
		favr.click();

		WebElement tri = driver.findElement(By.id("j_idt87:ajaxTriState"));
		tri.click();

		WebElement Toggle = driver.findElement(By.id("j_idt87:j_idt100"));
		Toggle.click();

		WebElement dis = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean check = dis.isDisplayed();
		System.out.println(check);

		WebElement multi = driver.findElement(By.id("j_idt87:multiple"));
		multi.click();

		//Thread.sleep(3000);
		WebElement multicheck = driver.findElement(By.xpath("//li[@data-item-value='London']"));
		 multicheck.click();
		 
		  }
		 
	}
	

