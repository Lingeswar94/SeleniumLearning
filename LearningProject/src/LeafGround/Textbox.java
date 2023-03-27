package LeafGround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\New Drivers\\104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.id("j_idt88:name"));
		text.sendKeys("Lingesh");

		WebElement append = driver.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys(" Coimbatore");

		WebElement dis = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean value = dis.isEnabled();
		System.out.println(value);

		WebElement Allclear = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		Allclear.clear();

		WebElement ret = driver.findElement(By.id("j_idt88:j_idt97"));
		String x = ret.getAttribute("Value");
		System.out.println("text=" + x);

		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("lingeswar94.ak@gmail.com" + Keys.TAB);

		WebElement your = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		your.sendKeys("qwertyuiopasdfghjkzxcvbnm");

		WebElement error = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
		error.sendKeys(Keys.ENTER);

		String message = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();

		if (message.contentEquals(message)) {
			System.out.println("Error is " + message);
		}

		WebElement third = driver.findElement(By.id("j_idt106:auto-complete_input"));
		third.sendKeys("Ling");

		List<WebElement> Auto = driver.findElements(By.xpath("//span[@role='status']"));

		int u = Auto.size();
		System.out.println("Auto is :" + u);
		for (WebElement xvn : Auto) {
			if (xvn.getText().equals("Ling2")) {
				xvn.click();
				break;
			}
		}

		WebElement date = driver.findElement(By.id("j_idt106:j_idt116_input"));
		date.sendKeys("6/6/1994");
		//date.click();

		WebElement Slider = driver.findElement(By.id("j_idt106:slider"));
		Slider.sendKeys("82");

		WebElement Key = driver.findElement(By.id("j_idt106:j_idt122"));
		Key.click();

	}

}
