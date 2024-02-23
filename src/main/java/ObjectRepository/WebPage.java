package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPage {
	WebDriver driver;
	By Book_demo=By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button");
	
	public WebPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void demo()
	{
		driver.findElement(Book_demo).click();
	}

}
