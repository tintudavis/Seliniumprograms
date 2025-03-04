package seliniumprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileuploadexample {

	public WebDriver driver;
	
	public void fileupload()
	{
		driver=new EdgeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(choosefile));
		choosefile.click();
		choosefile.sendKeys("C:\\Users\\Mariya\\Downloads\\DOC-20250219-WA0011_250219_141138.pdf");
	}
	
	public void roboclass() throws AWTException
	{
		driver=new EdgeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		choosefile.click();
		StringSelection stringselect=new StringSelection("C:\\Users\\Mariya\\Downloads\\DOC-20250219-WA0011_250219_141138.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null); //copy path to clipboard
		Robot robot=new Robot();
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL); //virtual keys
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Fileuploadexample fileuploadeg=new Fileuploadexample();
		//fileuploadeg.fileupload();
		fileuploadeg.roboclass();		
	}

}
