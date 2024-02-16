package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hospital_tour {
	WebDriver d;
	public Hospital_tour(WebDriver d) {
		this.d=d;
	}
	 By hospitaltour=By.xpath("//*[@id=\"button\"]/div/ul/li[3]/a");
	 By keralatourism=By.xpath("//*[@id=\"keralaside\"]/a/img");
	 
	 public void Hospitaltour() throws InterruptedException 
	    {
		 Thread.sleep(3000);
	     d.findElement(hospitaltour).click();
	     d.findElement(keralatourism).click();
	     d.navigate().back();
	     d.navigate().back();
	    
	    }
}
