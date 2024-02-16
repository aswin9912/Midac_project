package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Midac_aboutus {
	WebDriver d;
	public Midac_aboutus(WebDriver d) {
		this.d=d;
	}
	By aboutus=By.xpath("//*[@id=\"button\"]/div/ul/li[2]/a");
	By calicut=By.cssSelector("#smalldrop > li:nth-child(1) > a");
    By malappuram=By.xpath("//*[@id=\"smalldrop\"]/li[2]/a");
    By MPDC=By.xpath("//*[@id=\"smalldrop\"]/li[3]/a");
    By MM=By.xpath("//*[@id=\"smalldrop\"]/li[4]/a");
    By MCC=By.xpath("//*[@id=\"smalldrop\"]/li[5]/a");
    By ramanattukara=By.xpath("//*[@id=\"smalldrop\"]/li[6]/a");
    
    public void Aboutus() throws InterruptedException   
    {
    	
    d.findElement(aboutus).click();
    Thread.sleep(3000);
    
     
     }
}
