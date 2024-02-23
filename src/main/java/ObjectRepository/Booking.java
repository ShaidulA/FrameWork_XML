package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Booking {
	WebDriver driver;
	By full_name=By.name("FullName");
	By email= By.name("Email");
	By company_name=By.name("CompanyName");
	By contact=By.name("Contact");
	By Action_form=By.xpath("//input[@id='Form_getForm_action_submitForm']");
	
	public Booking(WebDriver driver)
	{
		this.driver=driver;
	}
	public void credentials() throws InterruptedException
	{
		driver.findElement(full_name).sendKeys("Shaidul Azam");
		driver.findElement(email).sendKeys("shaidul@gmail.com");
		driver.findElement(company_name).sendKeys("Raymour");
		WebElement ele=driver.findElement(By.name("Country"));
		Select s=new Select(ele);
		s.selectByVisibleText("United States");
		Thread.sleep(1000);
		driver.findElement(contact).sendKeys("9292508691");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("recaptcha-checkbox-border")).click();
		Thread.sleep(1000);
		driver.findElement(Action_form).click();
		Thread.sleep(2000);
		
		
	}
}
			

