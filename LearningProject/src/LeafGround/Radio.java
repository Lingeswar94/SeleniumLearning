package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement browser = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		browser.click();

		List<WebElement> Unselect = driver.findElements(By.xpath("//div[@class='grid formgrid']"));
		int x = Unselect.size();

		for (WebElement webElement : Unselect) {
			if (!webElement.isSelected()) {
				System.out.println(webElement);
				break;
			}
		}
		
		WebElement def=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']"));
		def.click();

	}

}
