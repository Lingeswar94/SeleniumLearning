package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();

		WebElement take = driver.findElement(By.linkText("Go to Dashboard"));
		take.click();
		driver.navigate().back();

		WebElement where = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
		String a = where.getAttribute("href");
		System.out.println(a);

		WebElement brok = driver.findElement(By.linkText("Broken?"));
		brok.click();

		String ac = driver.getTitle();
		if (ac.contains("404")) {
			System.out.println("Link is Broken");
		}
		driver.navigate().back();
		
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int x = count.size();
		System.out.println(x);
	}

}
