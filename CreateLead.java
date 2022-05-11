package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.ByteProcessor.IndexNotOfProcessor;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasanth");
		driver.findElement(By.name("birthDate")).sendKeys("14/11/1999");
		
		
		WebElement eleDropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(eleDropDown1);
		dd1.selectByVisibleText("Employee");

		WebElement eleDropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(eleDropDown2);
		dd2.selectByIndex(2);
		
		WebElement eleDropDown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(eleDropDown3);
		dd3.selectByValue("OWN_CCORP");
		
		WebElement eleDropDown4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4 = new Select(eleDropDown4);
		dd4.selectByVisibleText("Automobile");
		
		WebElement eleDropDown5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd5 = new Select(eleDropDown5);
		dd5.selectByVisibleText("India");
		
		WebElement eleDropDown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6 = new Select(eleDropDown6);
		dd6.selectByVisibleText("TAMILNADU");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("071");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9551718793");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vigneshmani2017@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.10, Karthik Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sekkadu");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600071");
		
		
		driver.findElement(By.name("submitButton")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		String text=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		//System.out.println(driver.findElement(By.id("viewLead_firstName_sp")));
		
	
				
				
	}
	

}
