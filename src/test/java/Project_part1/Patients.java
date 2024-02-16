package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Patients {
   WebDriver d;
   public Patients(WebDriver d) {
	this.d=d;
     }
   
   By Patients=By.xpath("//*[@id=\"button\"]/div/ul/li[8]/a");
   By midactourism=By.xpath("//*[@id=\"history\"]/div[2]/div[1]/ul/li[2]/a");
   By tourismkerala=By.xpath("//*[@id=\"history\"]/div[2]/div[1]/ul/li[3]/a");
   By accomodation=By.xpath("//*[@id=\"history\"]/div[2]/div[1]/ul/li[4]/a");
   By procedure=By.xpath("//*[@id=\"history\"]/div[2]/div[1]/ul/li[6]/a");
   By howtoreach=By.xpath("//*[@id=\"history\"]/div[2]/div[1]/ul/li[7]/a");
   By brochure=By.xpath("//*[@id=\"history\"]/div[1]/figure[1]/a/img");
   
   public void patient() throws InterruptedException  
   { 
	  
    Thread.sleep(3000);
    d.findElement(Patients).click();
    Thread.sleep(2000);
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("window.scrollBy(0,350)", "");
    d.findElement(midactourism).click();
    d.findElement(tourismkerala).click();
    d.findElement(accomodation).click();
    d.findElement(procedure).click();
    d.findElement(howtoreach).click();
    d.navigate().back();
    d.navigate().back();
    d.navigate().back();
    d.navigate().back();
    d.navigate().back();
    WebElement Brochure=d.findElement(brochure);
    js.executeScript("window.scrollBy(0,500)","");
    Brochure.click();
    Thread.sleep(2000);
    d.navigate().back();
    d.navigate().back();
    
    }
}
