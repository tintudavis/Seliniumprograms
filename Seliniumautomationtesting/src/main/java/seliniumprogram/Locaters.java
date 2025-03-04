package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locaters extends BaseClass{

	public void idLocater()
	{
		WebElement msgfield=driver.findElement(By.id("single-input-field"));
		WebElement button1=driver.findElement(By.id("button-one"));
	}
	
	public void nameLocater()
	{
		WebElement namefield=driver.findElement(By.name("description"));
		WebElement keyworldfield=driver.findElement(By.name("keywords"));
	}
	
	public void classLocater()
	{
		WebElement classfield=driver.findElement(By.className("navbar-brand"));
		WebElement classfield1=driver.findElement(By.className("navbar-toggler"));
	}
	
	public void linkLocater()
		
	{
		WebElement linkfield=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement linkfield1=driver.findElement(By.linkText("form-submit.php"));
	}
	
	public void partialLinkLocater()
	{
		WebElement partlinkfield=driver.findElement(By.partialLinkText("check-box"));
		WebElement partlinkfield1=driver.findElement(By.partialLinkText("form-submit"));
	}
	
	public void cssSelectereg()
	{
		/*tag and id
		tag and class
		tag and attribute
		tag,class and attribute*/
		
		//tag#id
		WebElement tagid=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid1=driver.findElement(By.cssSelector("button#button-two"));
		
		//tag.class
		WebElement tagclas=driver.findElement(By.cssSelector("ul.navbar-nav"));
		
		//tag[attributetype=attributevalue]
		WebElement tagattr=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement tagattr1=driver.findElement(By.cssSelector("button[id=button-one]"));
		
		//tag.class[attributetype=attributevalue]
		WebElement tagattr2=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
		WebElement tagattr3=driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
	}
	
	public void absoluteXpatheg()
	{
	
		
		WebElement absxpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
				
	}
	
	public void relativeXpatheg()
	{
		
		//Synatx is //tagname[@attributetype='attributevalue']
		
	WebElement relxpath=driver.findElement(By.xpath("//div[@id='message-one']"));
	WebElement relxpath1=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	
	//input[@type='text']
	}
	
	public void dynamicXpath()
	{
		//Syntax is //tagname[contains(@attributetype,'attributevalue')]
		
		//input[contains(@placeholder,'Message')]
		
		//button[contains(@id,'button-one')]
		
		WebElement dynxpath=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
		
		// text() method //tagname[text()='value']
		
		//button[text()='Show Message']
		
		WebElement txtpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
