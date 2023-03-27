package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\New Drivers\\104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
		button.click();
		driver.navigate().back();

		WebElement button1 = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean active = button1.isEnabled();
		System.out.println(active);

		WebElement value = driver.findElement(By.id("j_idt88:j_idt98"));
		Point xy = value.getLocation();
		int xv = xy.getX();
		int yv = xy.getY();
		System.out.println("xvalue" + xv);
		System.out.println("yvalue" + yv);

		WebElement Button2 = driver.findElement(By.id("j_idt88:j_idt96"));
		String Color = Button2.getCssValue("background-color");
		System.out.println("Color is :" + Color);

		WebElement summit = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension shape = summit.getSize();
		int h = shape.getHeight();
		int w = shape.getWidth();
		System.out.println(h);
		System.out.println(w);

		WebElement over = driver.findElement(By.id("j_idt88:j_idt100"));

		Actions actions = new Actions(driver);
		actions.moveToElement(over);
		String overcolor = over.getCssValue("background-color");
		System.out.println(overcolor);

		WebElement imagebutton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imagebutton.click();
		imagebutton.click();

		List<WebElement> round = driver.findElements(By.xpath("//div[@class='card']/Button"));
		int r = round.size();
		System.out.println(r);
	}

}
