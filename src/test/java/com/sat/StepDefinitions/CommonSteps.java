package com.sat.StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sat.Pages.CommonPages;
import com.sat.Pages.LeadsCreationPage;
import com.sat.testUtil.Log;
import com.sat.testUtil.Testutil;
import com.sat.testbase.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
	TestBase testbase = new TestBase();
	WebDriver driver= TestBase.getDriver();

	private LeadsCreationPage accountpage = new LeadsCreationPage(driver);
	private CommonPages common = new CommonPages(driver);

	Testutil testUtil = new Testutil(driver);
	@When("user click on {string} under customer")
	public void user_click_on_under_customer(String tab) {
		try {
			if (!driver.findElements(By.xpath("//button[@aria-label='Discard changes']")).isEmpty())
				driver.findElement(By.xpath("//button[@aria-label='Discard changes']")).click();
			Thread.sleep(2000);
			accountpage.entity(tab);
		} catch (Exception e) {
			System.out.println("Exception :" + e + " has occurred");}
	}
	@Then("user click on {string}")
	public void user_click_on_(String option) throws InterruptedException {
		try {

			Log.info("Option is == "+ option);
			Thread.sleep(3000);
			common.clickOn(option);
			Thread.sleep(3000);
			List<WebElement> li  = driver.findElements(By.xpath("//button[@aria-label='Confirm']"));
			if (li.size()!=0) 
			testUtil.clickOn(driver, driver.findElement(By.xpath("//button[@aria-label='Confirm']")), 1);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception :" + e + " has occurred");
		}
	}
	
	

}
