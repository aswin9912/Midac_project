package Project_part1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Econsultation {
	WebDriver d;
	public Econsultation(WebDriver d) {
		this.d=d;
	}
   
	    By econsultation=By.xpath("//*[@id=\"button\"]/div/ul/li[9]/a");
	    By upload1=By.cssSelector("#wpcf7-f4062-p185-o1 > form > p:nth-child(2) > span > input");
	    By upload2=By.cssSelector("#wpcf7-f4062-p185-o1 > form > p:nth-child(3) > span > input");
	    By description=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[3]/span/textarea");
	    By messag=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[4]/span/textarea");
	    By Firstname=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[5]/span/input");
	    By Lastname=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[6]/span/input");
	    By address=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[7]/span/textarea");
	    By radio2=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[8]/span/span/span[1]/input");
	    By telephone=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[9]/span/input");
	    By Eemail=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[10]/span/input");
	    By checkbox3=By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]");
	    By sendenquiry=By.xpath("//*[@id=\"wpcf7-f4062-p185-o1\"]/form/p[11]/input");
	    
	    public void econsult() throws IOException, AWTException, InterruptedException
	    {
	     Thread.sleep(2000);
	     d.findElement(econsultation).click();
	     Thread.sleep(3000);
	     
	     JavascriptExecutor j=(JavascriptExecutor)d;
	     j.executeScript("window.scrollBy(0,250)","");
	    //WebElement file1=d.findElement(upload1);
	   //WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
	   // wait.until(ExpectedConditions.elementToBeClickable(file1));
	    // file1.click();
	     /*StringSelection s=new StringSelection("C:\\Users\\user\\OneDrive\\Desktop\\Aswin.png");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);*/
	     
	     //d.findElement(upload2).click();
	     //Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\photo2.exe");
	     d.findElement(description).sendKeys("There is small gap and pain on the front tooth");
	     j.executeScript("window.scrollBy(0,300)", "");
	     d.findElement(messag).sendKeys("Tooth pain");
	     d.findElement(Firstname).sendKeys("Aswin");
	     d.findElement(Lastname).sendKeys("P P");
	     d.findElement(address).sendKeys("avshvhs");
	     d.findElement(radio2).click();
	     d.findElement(telephone).sendKeys("9847073011");
	     d.findElement(Eemail).sendKeys("asw99@gmail.com");
	     //d.findElement(checkbox3).click();
	     d.findElement(sendenquiry).click();
	     
	     
        }

		
		
}
