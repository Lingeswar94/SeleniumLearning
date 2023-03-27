package LeafGround;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();

		String old = driver.getWindowHandle();

		WebElement oldwindow = driver.findElement(By.id("j_idt88:new"));
		oldwindow.click();

		Set<String> count = driver.getWindowHandles();
		int x = count.size();
		System.out.println(x);

		WebElement mult = driver.findElement(By.id("j_idt88:j_idt91"));
		mult.click();

		Set<String> count2 = driver.getWindowHandles();
		int y = count2.size();
		System.out.println(y);

		WebElement open = driver.findElement(By.id("j_idt88:j_idt95"));
		open.click();

		Thread.sleep(3000);

		Set<String> wincount = driver.getWindowHandles();
		Iterator<String> it = wincount.iterator();
		while (it.hasNext()) {
			String all = it.next();
			if (!it.equals(old)) {
				driver.switchTo().window(all);
				driver.close();

			}
		}
	}

}
