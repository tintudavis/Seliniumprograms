package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFormPage extends BaseClass{

	public void verifyMessageFiled()
	{
	 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	 WebElement msgfield=driver.findElement(By.id("single-input-field"));
	 msgfield.sendKeys("Hello");
	 WebElement showmsgbutton=driver.findElement(By.id("button-one"));
	 showmsgbutton.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFormPage inputformpage=new InputFormPage();
		inputformpage.browserInitialisation();
		inputformpage.verifyMessageFiled();
		inputformpage.quitAndClose();
	}

}
