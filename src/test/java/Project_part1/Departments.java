package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Departments {
	WebDriver d;
	public Departments(WebDriver d) {
		this.d=d;
	}
	    By Departments=By.xpath("//*[@id=\"button\"]/div/ul/li[4]/a");
	    By Dentalimplants=By.xpath("//*[@id=\"contents\"]/div[2]/div[1]/ul/li[2]/a");
	    By plusbutton1=By.xpath("//*[@id=\"link\"]/i");
	    
	    public void Department() throws InterruptedException 
	    {
	     Thread.sleep(3000);
	     WebElement Dept=d.findElement(Departments)	;
         Actions b=new Actions(d);
         b.moveToElement(Dept).perform();
         Dept.click();
         d.findElement(Dentalimplants).click();
         d.findElement(plusbutton1).click();
	    }

}
