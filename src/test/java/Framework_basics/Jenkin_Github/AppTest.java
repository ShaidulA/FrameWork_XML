package Framework_basics.Jenkin_Github;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.Booking;
import ObjectRepository.WebPage;
import Utilities.CrossBrowser;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    @BeforeMethod
    public void Application() throws InterruptedException, IOException
    {
    	CrossBrowser br=new CrossBrowser();
		driver=br.browserinitiate();
		driver.manage().window().maximize();
		Thread.sleep(1000);   
		}
    @Test
    public void Title()
    {
    	System.out.println("The title is" + " " + driver.getTitle());
    }
    @Test
    public void booking() throws InterruptedException
    {
    	WebPage web=new WebPage(driver);
    	web.demo();
    	Booking book=new Booking(driver);
    	book.credentials();
    }
    @AfterMethod
    public void teardown()
    {
    	driver.close();
    }
}
