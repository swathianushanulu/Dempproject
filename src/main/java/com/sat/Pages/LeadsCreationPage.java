package com.sat.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

public class LeadsCreationPage {
	
	
	Wait wait = new Wait();
	TestBase testbase = new TestBase();
	WebDriver driver = TestBase.getDriver();
	Testutil testutil = new Testutil(driver);
	Actions action = new Actions(driver);

	//public By clickLeads = By.xpath("//div/h2[text()='Published Apps']");
	//public By clickNew = By.xpath("//input[@type='email']");
	public By enterTopic = By.xpath("//input[@aria-label='Topic']");
	public By EnterlastName = By.xpath("//input[@aria-label='Last Name']");
	public By clickSave = By.xpath("//button[@aria-label='Save (CTRL+S)']");
	public By clickQualifyBpf = By.xpath("//div[text()='Qualify']");
	
	public By checkIdentifyDecisionMaker = By.xpath("//input[contains(@aria-label,'Identify Decision Maker')]");
	public By clickQualify = By.xpath("//button[@aria-label='Qualify']");
	
	
	public LeadsCreationPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void enterTopic(String topic) throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(enterTopic).click();

		Thread.sleep(2000);
		
		
		driver.findElement(enterTopic).sendKeys(topic);

		Thread.sleep(2000);
	}
	
	public void EnterlastName(String lastname) throws InterruptedException
	{	
		driver.findElement(EnterlastName).click();
		Thread.sleep(2000);
		driver.findElement(EnterlastName).sendKeys(lastname);

		Thread.sleep(2000);
	}
	
	public void clicksave() throws InterruptedException
	{
		driver.findElement(clickSave).click();
		Thread.sleep(2000);
	}
	public void clickqualifybpf() throws InterruptedException{
		driver.findElement(clickQualifyBpf).click();
		Thread.sleep(1000);
	}
	public void checkidentifydecisionmaker() throws InterruptedException{
		driver.findElement(checkIdentifyDecisionMaker).click();
		Thread.sleep(1000);
	}
	public void clickqualify()
	{
		driver.findElement(clickQualify).click();
	}
	public void entity(String tab) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@title='" + tab + "']"))));
			driver.findElement(By.xpath("//div[@title='" + tab + "']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickonlead(String leadName) {
		driver.findElement(By.xpath("//span[text()='"+leadName+"']")).click();
	}
	
	

}
	
