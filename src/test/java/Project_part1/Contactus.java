package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contactus {
	WebDriver d;
	public Contactus(WebDriver d) {
		this.d=d;
	}
   
	By contactus=By.xpath("//*[@id=\"button\"]/div/ul/li[10]/a");
    
    
	   
    By viewmap=By.tagName("a");
    By fname=By.xpath("//*[@id=\"wpcf7-f4061-p19-o1\"]/form/p[1]/span/input");
    By EMAIL=By.xpath("//*[@id=\"wpcf7-f4061-p19-o1\"]/form/p[3]/span/input");
    By phoneno=By.xpath("//*[@id=\"wpcf7-f4061-p19-o1\"]/form/p[4]/span/input");
    By enquiry=By.xpath("//*[@id=\"wpcf7-f4061-p19-o1\"]/form/p[6]/span/textarea");
    By checkbox4=By.xpath("//*[@id=\"recaptcha-anchor\"]");
    By Send=By.xpath("//*[@id=\"wpcf7-f4061-p19-o1\"]/form/p[7]/input");
    
    public void contactus() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	d.findElement(contactus).click();
    	Thread.sleep(2000);
     
     
     JavascriptExecutor js=(JavascriptExecutor)d;
     js.executeScript("window.scrollBy(0,250)", "");
     
     Thread.sleep(3000);	
     d.findElement(viewmap).click();
     Thread.sleep(3000);
     d.navigate().back();
     WebElement Fname=d.findElement(fname);
     js.executeScript("arguments[0].scrollIntoView(0);",Fname );
     
     Fname.sendKeys("Aswin");
     d.findElement(EMAIL).sendKeys("as9912@gmail.com");
     d.findElement(phoneno).sendKeys("8943091809");
     d.findElement(enquiry).sendKeys("vjwvvjV");
     //d.findElement(checkbox4).click();
     d.quit();
     
     
     
     }
}
