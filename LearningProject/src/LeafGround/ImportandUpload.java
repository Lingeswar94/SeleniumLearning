package LeafGround;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImportandUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	
		WebElement download=driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		File file=new File("C:\\Users\\Kalaivani\\Downloads");
		File[] files=file.listFiles();
	for (File file2 : files) {
		if(file2.getName().equals("TestLeaf Logo.png")) {
			System.out.println("Image is downloaded");
		}break;
	}
	/*
	 * WebElement
	 * down=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt89_input']"));
	 * down.click();
	 * 
	 * StringSelection selection=new
	 * StringSelection("C:\\Users\\Kalaivani\\Desktop\\image2 (1).jpeg");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
	 * null);
	 * 
	 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
	 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
	 * robot.keyRelease(KeyEvent.VK_V); robot.keyPress(KeyEvent.VK_ENTER);
	 * robot.keyRelease(KeyEvent.VK_ENTER);
	 */
	}

}
