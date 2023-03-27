package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectfunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();

		WebElement fav = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(fav);
		select.selectByIndex(1);
		// fav.click();

		WebElement country = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
		country.click();

		List<WebElement> count = driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		for (WebElement webcount : count) {
			if (webcount.getText().equalsIgnoreCase("India")) {
				webcount.click();
			}
		}
	

	WebElement choose = driver.findElement(By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left']"));
	choose.click();

	WebElement course = driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));course.sendKeys("Selenium");

	Thread.sleep(3000);
	List<WebElement> data = driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));for(
	WebElement webElement:data)
	{
		if (webElement.getText().equals("Selenium WebDriver")) {
			webElement.click();
			break;
		}
	}

	WebElement lang = driver.findElement(By.id("j_idt87:lang_label"));lang.click();

	List<WebElement> langus = driver.findElements(By.xpath("//ul[@id='j_idt87:lang_items']/li"));
	for(WebElement webEle:langus)
	{
		if (webEle.getText().equals("Tamil")) {
			webEle.click();
			break;
		}
	}

	Thread.sleep(3000);
	WebElement two = driver.findElement(By.id("j_idt87:value_label"));
	two.click();

	List<WebElement> twos = driver.findElements(By.xpath("//ul[@id='j_idt87:value_items']/li"));for(
	WebElement web:twos)
	{
		if (web.getText().equals("இரண்டு")) {
			web.click();
			break;
		}
	}

	}

}
