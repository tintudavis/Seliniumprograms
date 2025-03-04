package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputformMsgbox extends BaseClass{

	public void verifymsgfield()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgfield1=driver.findElement(By.id("single-input-field"));
		System.out.println(msgfield1.isEnabled());
		msgfield1.sendKeys("Hello");
		WebElement showmsgbutton=driver.findElement(By.id("button-one"));
		showmsgbutton.click();
		
	}
	
	public void gettotal()
	{
		WebElement msgfield2=driver.findElement(By.id("value-a"));
		msgfield2.sendKeys("10");
		WebElement msgfield3=driver.findElement(By.id("value-b"));
		msgfield3.sendKeys("20");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputformMsgbox inputformmsgbox=new InputformMsgbox();
		inputformmsgbox.browserInitialisation();
		inputformmsgbox.verifymsgfield();
		inputformmsgbox.gettotal();
	}

}
