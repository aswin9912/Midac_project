package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Treatments {
	WebDriver d;
	public Treatments(WebDriver d) {
		this.d=d;
	}
	By Treatments=By.xpath("//*[@id=\"button\"]/div/ul/li[5]/a");
    By rootcanal=By.xpath("//*[@id=\"serv\"]/ul/li[3]/a");
    By plusbutton2=By.xpath("//*[@id=\"mapSlide\"]/div[3]/ul/li[9]/a/i");
    By plusbutton3=By.xpath("//*[@id=\"mapSlide\"]/div[3]/ul/li[10]/a/i");
  
	 public void Treatment() throws InterruptedException 
	    {
		 Thread.sleep(5000);
		 JavascriptExecutor t=(JavascriptExecutor)d;
	     d.findElement(Treatments).click();
	     Thread.sleep(2000);
	     d.findElement(plusbutton2).click();
	     d.navigate().back();
	     d.findElement(plusbutton3).click();
	     d.navigate().back();
	     t.executeScript("window.scrollBy(0,450)", "");
	     d.findElement(rootcanal).click();
	     
	    }
}
