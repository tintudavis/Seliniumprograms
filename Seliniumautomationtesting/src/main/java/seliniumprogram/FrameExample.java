package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameExample {

	public WebDriver driver;
	
	public void displayframes()
	{
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement clickframe=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		clickframe.click();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameExample frameeg=new FrameExample();
		frameeg.displayframes();
	}

}
