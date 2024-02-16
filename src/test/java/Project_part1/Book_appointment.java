package Project_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Book_appointment {
	WebDriver d;
	public Book_appointment(WebDriver d) {
		this.d=d;
	}
	
	By appointment=By.xpath("//*[@id=\"quickcontact\"]/div[1]/span/a");
	By firstname=By.name("FirstName");
	By lastname=By.name("LastName");
	By email=By.name("Email");
	By dob=By.xpath("//*[@id=\"wpcf7-f4063-p146-o1\"]/form/p[4]/span/input");
	By department=By.xpath("//*[@id=\"wpcf7-f4063-p146-o1\"]/form/p[5]/span/select");
	By message=By.xpath("//*[@id=\"wpcf7-f4063-p146-o1\"]/form/p[6]/span/textarea");
    By checkbox1=By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
    By booking=By.xpath("//*[@id=\"wpcf7-f4063-p146-o1\"]/form/p[7]/input");
    By mailbook=By.xpath("//*[@id=\"contents\"]/div[1]/p[2]/a/b");
    By page=By.xpath("//*[@id=\"contents\"]/div[2]");
    
    public void getappointment(String fname,String lname,String mailid,String DOB,String content) throws InterruptedException {
    	Thread.sleep(5000);
    	d.findElement(appointment).click();
    	Thread.sleep(5000);
    	d.findElement(firstname).sendKeys(fname);
    	d.findElement(lastname).sendKeys(lname);
    	d.findElement(email).sendKeys(mailid);
    	d.findElement(dob).sendKeys(DOB);
    	WebElement dep=d.findElement(department);
    	dep.click();
    	Select s=new Select(dep);
    	s.selectByValue("Root Canal Treatment");
    	d.findElement(message).sendKeys(content);
    	//d.findElement(checkbox1).click();
    	d.findElement(booking).click();
    	Thread.sleep(2000);
    	
    	//d.findElement(mailbook).click();
    	
        
        
    	}

}
