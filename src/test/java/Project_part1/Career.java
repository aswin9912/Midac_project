package Project_part1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Career {
	WebDriver d;
	public Career(WebDriver d) {
		this.d=d;
	}
	By career=By.xpath("//*[@id=\"footer\"]/div/div/div[3]/ul/li[9]/a");
    By resume=By.xpath("//*[@id=\"history\"]/div[1]/form/p/a");
    By cvname=By.xpath("//*[@id=\"history\"]/div[1]/form/table[1]/tbody/tr[1]/td/input");
    By surname=By.xpath("//*[@id=\"history\"]/div[1]/form/table[1]/tbody/tr[2]/td/input");
    By mailaddress=By.xpath("//*[@id=\"history\"]/div[1]/form/table[1]/tbody/tr[3]/td/input");
    By radio1=By.xpath("//*[@id=\"history\"]/div[1]/form/table[3]/tbody/tr[1]/td/input[1]");
    By cvupload=By.xpath("//*[@id=\"history\"]/div[1]/form/table[3]/tbody/tr[4]/td/input");
    By checkbox2=By.name("jobman-field-18[]");
    By submit=By.name("submit");
    
    public void career(String CVname,String Surname,String Mailid) throws IOException, InterruptedException 
    {
    	Thread.sleep(5000);    
    	WebElement Career=d.findElement(career);
    	//WebElement file=d.findElement(cvupload);
    	JavascriptExecutor j=(JavascriptExecutor)d;
    	j.executeScript("arguments[0].scrollIntoView();", Career);
        Career.click();
        d.findElement(resume).click();
        d.findElement(cvname).sendKeys(CVname);
        d.findElement(surname).sendKeys(Surname);
        d.findElement(mailaddress).sendKeys(Mailid);
        d.findElement(radio1).click();
        j.executeScript("window.scrollBy(0,250)", "");
       // WebDriverWait wait=new WebDriverWait(d, Duration.ofMillis(30));
        //wait.until(ExpectedConditions.elementToBeClickable(file));
        //file.click();
        //Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\R.exe");
        
        d.findElement(checkbox2).click();
       // d.findElement(submit).click();
        d.navigate().back();
        d.navigate().back();
        d.navigate().back();
        
        
    }

}
