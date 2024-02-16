package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dr_and_gallery {
	WebDriver d;
	public Dr_and_gallery(WebDriver d) {
		this.d=d;
	}
	By Doctors=By.xpath("//*[@id=\"button\"]/div/ul/li[6]/a");
	By plusbutton4=By.xpath("//*[@id=\"link\"]/i");
	By Gallery=By.xpath("//*[@id=\"button\"]/div/ul/li[7]/a");
	By drphoto=By.xpath("//*[@id=\"img\"]");
    By Mcalicut=By.xpath("//*[@id=\"photoGallery_\"]/a[1]/div/img");
    By smile=By.xpath("//*[@id=\"photoGallery_\"]/a[2]/div/img");
    By interiors=By.xpath("//*[@id=\"photoGallery_\"]/a[3]/div/img");
    By designsmile=By.xpath("//*[@id=\"photoGallery_\"]/a[4]/div/img");
    By photo=By.xpath("//*[@id=\"ngg-image-0\"]/div/a/img");
    By videogallery=By.xpath("//*[@id=\"smalldrop\"]/li[2]/a");
    By videolink=By.xpath("//*[@id=\"history\"]/div[2]/a[3]/span");
	
	 public void doctors() throws InterruptedException 
	    {
		 Thread.sleep(3000);
		 JavascriptExecutor j=(JavascriptExecutor)d;
		 d.findElement(Doctors).click();
		 Thread.sleep(2000);
	     j.executeScript("window.scrollBy(0,350)", "");
	     d.findElement(drphoto).click();
	     d.navigate().back();
	     d.findElement(plusbutton4).click();
	     
	    }
	    public void gallery() throws InterruptedException 
	    {
	     Thread.sleep(3000);
	     WebElement g=d.findElement(Gallery);
	     g.click();
	     JavascriptExecutor ga=(JavascriptExecutor)d;
	     ga.executeScript("window.scrollBy(0,350)", "");
	     d.findElement(Mcalicut).click();
	     d.findElement(photo).click();
	     ga.executeScript("window.scrollBy(0,350)", "");
	     Thread.sleep(2000);
	     d.navigate().back();
	     d.findElement(interiors).click();
	     ga.executeScript("window.scrollBy(0,350)", "");
	     d.navigate().back();
	     d.findElement(smile).click();
	     ga.executeScript("window.scrollBy(0,350)", "");
	     d.navigate().back();
	     d.findElement(designsmile).click();
	     ga.executeScript("window.scrollBy(0,350)", "");
	     /*WebDriverWait wait=new WebDriverWait(d, null);
	     wait.until(ExpectedConditions.visibilityOf(g));
	     
	     Actions v=new Actions(d);
	     v.moveToElement(g).perform();;
	     d.findElement(videogallery).click();
	     d.findElement(videolink).click();
	     d.navigate().back();*/
	     
	     
	    
	    }
    
    

}
