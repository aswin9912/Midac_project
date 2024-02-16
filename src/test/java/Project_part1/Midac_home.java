package Project_part1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Midac_home {
	WebDriver d;
	 public Midac_home(WebDriver d) 
	   {
		   this.d=d;
		}
	By logo=By.xpath("//*[@id=\"logo\"]/a/img[3]");
	By ISO=By.xpath("//*[@id=\"right\"]/div[2]/a/img");
    By quickcontact=By.xpath("//*[@id=\"quickcontact\"]/div[1]/font/a[1]");
	By name=By.id("names");
	By Email=By.id("emails");
	By phone=By.id("phones");
	By Message=By.id("messages");
	By send=By.xpath("//*[@id=\"quick\"]/ol/div/div/input");
	By feedback=By.xpath("//*[@id=\"quickcontact\"]/div[1]/font/a[2]");
	By mail=By.xpath("//*[@id=\"contents\"]/div[1]/p[2]/a/b");
    By location=By.xpath("//*[@id=\"quickcontact\"]/div[2]/font/a");
    By time=By.xpath("//*[@id=\"quickcontact\"]/div[3]/font/a");
    By whatsapp=By.cssSelector("body > div.joinchat.joinchat--right.joinchat--show > div > div.joinchat__button__open");
    By facebook=By.xpath("//*[@id=\"footer\"]/div/div/div[4]/div/a[1]/i");
    By twitter=By.xpath("//*[@id=\"footer\"]/div/div/div[4]/div/a[2]/i");
    By mailicon=By.xpath("//*[@id=\"footer\"]/div/div/div[4]/div/a[4]/i");
    
   
   public void logodisplay()
  {
	boolean Logo=   d.findElement(logo).isDisplayed();
	assertTrue(Logo);
	
	
   }
    public void Certificationdisplay() 
    {
	   boolean iso=d.findElement(ISO).isDisplayed();
	   assertTrue(iso);
	   
	   
   }
    public void Quickcontact(String value,String email,String ph,String message) throws InterruptedException
    {
    	
    	d.findElement(quickcontact).click();
    	Thread.sleep(2000);
    	d.findElement(name).sendKeys(value);
    	d.findElement(Email).sendKeys(email);
    	d.findElement(phone).sendKeys(ph);
    	d.findElement(Message).sendKeys(message);
    	d.findElement(send).click();
    	d.navigate().back();
    }
    
   public void clickfunction() throws InterruptedException   
    {
	    Thread.sleep(2000);
	    WebElement element=d.findElement(facebook);
	    JavascriptExecutor js=(JavascriptExecutor)d;
	    Thread.sleep(2000);
	    d.findElement(whatsapp).click();
	    Thread.sleep(5000);
    	element.click();
    	Thread.sleep(5000);
    	d.findElement(twitter).click();
    	d.findElement(mailicon).click();
    	d.findElement(time).click();
    	Thread.sleep(5000);
    	d.findElement(location).click();
    	Thread.sleep(5000);
    	d.findElement(feedback).click();
    	Thread.sleep(5000);
    }
}
