package project_test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project_part1.Book_appointment;
import Project_part1.Career;
import Project_part1.Contactus;
import Project_part1.Departments;
import Project_part1.Dr_and_gallery;
import Project_part1.Econsultation;
import Project_part1.Hospital_tour;
import Project_part1.Midac_aboutus;
import Project_part1.Midac_home;
import Project_part1.Patients;
import Project_part1.Treatments;


public class Midac_test  {
	WebDriver d;
	String baseurl="https://midac.in/";
	
	@BeforeTest
	public void setup() {
		
		d=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		d.get(baseurl);
		d.manage().window().maximize();
	}
	@Test(priority = 0)
	
	public void home () throws Exception 
	{

		Midac_home mh=new Midac_home(d);
		mh.logodisplay();
		mh.Certificationdisplay();
		mh.Quickcontact("Aswin", "aswin97@gmail.com", "9956458723", "yvuvu");
		mh.clickfunction();
		
	}
	@Test(priority = 3)
	public void aboutus() throws Exception {
		Midac_aboutus ma=new Midac_aboutus(d);
		ma.Aboutus();
	
	}
	
	@Test(priority = 4)
	public void hospitaltour() throws InterruptedException {
		Hospital_tour ht=new Hospital_tour(d);
		ht.Hospitaltour();
	}
	
	@Test(priority = 5)
	public void department() throws InterruptedException {
		Departments dp=new Departments(d);
		dp.Department();
	}
	@Test(priority = 6)
	public void DrandGallery() throws InterruptedException {
	try 
		{
			Dr_and_gallery dg=new Dr_and_gallery(d);
			dg.doctors();
			dg.gallery();
		}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test(priority = 7)
	public void treatment() throws InterruptedException {
		Treatments ts=new Treatments(d);
		ts.Treatment();
	}
	@Test(priority = 8)
	public void patients() throws InterruptedException  {
		Patients p=new Patients(d);
		p.patient();
	}
	@Test(priority =9)
	public void econsult() throws IOException, AWTException, InterruptedException {
		Econsultation ec=new Econsultation(d);
		ec.econsult();
	}
	@Test(priority = 10)
	public void contactus() throws InterruptedException {
		Contactus ct=new Contactus(d);
		ct.contactus();
	}
	@Test(priority = 1)
	public void getappointment() throws InterruptedException {
		Book_appointment ba=new Book_appointment(d);
		ba.getappointment("aswin", "p p", "aswin9912@gmail.com", "09-01-1999", "vjvwf");
	}
	
	@Test(priority = 2)
	public void career() throws IOException, InterruptedException {
		Career cv=new Career(d);
		cv.career("aswin", "p p", "aswin9912@gmail.com");
		
	}
}
