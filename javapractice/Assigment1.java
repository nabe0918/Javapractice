package welearn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Assigment1 {
		
		public static void main(String[] args) throws InterruptedException {

			//Setting WebDriver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32/chromedriver.exe");
			//Defining WEBdriver object
			WebDriver driver = new ChromeDriver();
			//Maximize browser
			driver.manage().window().maximize();
			
	//Setting URL
	driver.get("https://form.jotform.com/201165787510252");
	//Enter Athlete's First Name 
	driver.findElement(By.xpath("//input[@id='first_5']")).sendKeys("Naveen");
	//Enter Athlete's  Last Name
	driver.findElement(By.xpath("//input[@id='last_5']")).sendKeys("Bellam");	
	
	//Wait for 1 seconds
	Thread.sleep(1000);
	
	//Select DOB
	Select drpMonth = new Select(driver.findElement(By.xpath("//*[@id=\"input_65_month\"]")));
	drpMonth.selectByVisibleText("March");
	Select drpDate = new Select(driver.findElement(By.xpath("//select[@id='input_65_day']")));
	drpDate.selectByVisibleText("18");
	Select drpYear = new Select(driver.findElement(By.xpath("//select[@id='input_65_year']")));
	drpYear.selectByVisibleText("1991");
	
	//Enter  Grade
	driver.findElement(By.xpath("//input[@id='input_67']")).sendKeys("1");
			
	//Select Gender
	WebElement radioMale = driver.findElement(By.xpath("//input[@id='input_66_0']"));
	radioMale.click();
		
	//Wait for 1 seconds
	Thread.sleep(1000);
	
	//Enter Address
		
	driver.findElement(By.xpath("//input[@id='input_3_addr_line1']")).sendKeys("2141");
	driver.findElement(By.xpath("//input[@id='input_3_addr_line2']")).sendKeys("Rue Montgomery");
	driver.findElement(By.xpath("//input[@id='input_3_city']")).sendKeys("Montreal");
	driver.findElement(By.xpath("//input[@id='input_3_state']")).sendKeys("Quebec");
	driver.findElement(By.xpath("//input[@id='input_3_postal']")).sendKeys("H2K2R7");
	Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='input_3_country']")));
		drpCountry.selectByVisibleText("Canada");
		
		//Wait for 1 seconds
		Thread.sleep(1000);
	
	// ENter Parent/Guardian Information
	
	driver.findElement(By.xpath("//input[@id='first_13']")).sendKeys("Aravind");
	driver.findElement(By.xpath("//input[@id='last_13']")).sendKeys("Yadav");
	driver.findElement(By.xpath("//input[@id='input_14_area']")).sendKeys("438");
	driver.findElement(By.xpath("//input[@id='input_14_phone']")).sendKeys("6566789");
	driver.findElement(By.xpath("//input[@id='input_15_area']")).sendKeys("414");
	driver.findElement(By.xpath("//input[@id='input_15_phone']")).sendKeys("2345436");
	driver.findElement(By.xpath("//input[@id='input_16']")).sendKeys("sadhana.academy9@gmail.com");
	
	//Wait for 1 seconds
	Thread.sleep(1000);
	
	//Emergency Information
	
	driver.findElement(By.xpath("//input[@id='first_18']")).sendKeys("Prasad");
	driver.findElement(By.xpath("//input[@id='last_18']")).sendKeys("Avulam");
	
	Select drpRelationship = new Select(driver.findElement(By.xpath("//select[@id='input_19']")));
	drpRelationship.selectByVisibleText("Other");
	
	//Wait for 1 seconds
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='input_20_area']")).sendKeys("538");
	driver.findElement(By.xpath("//input[@id='input_20_phone']")).sendKeys("2340789");
	driver.findElement(By.xpath("//input[@id='input_21_area']")).sendKeys("414");
	driver.findElement(By.xpath("//input[@id='input_21_phone']")).sendKeys("2142436");
	
	//Does the athlete have any allergies, chronic illness, or medical conditions? If yes, please describe.
	driver.findElement(By.xpath("//textarea[@id='input_22']")).sendKeys("NA");
	//Is the athlete prescribed an inhaler? If yes, please explain any instructions.
	driver.findElement(By.xpath("//textarea[@id='input_23']")).sendKeys("NA");
	
	//Wait for 1 seconds
	Thread.sleep(1000);
	
	//Submit 
	driver.findElement(By.xpath("//button[@id='input_2']")).submit();
		
	System.out.println("Form has been filled and submitted");					
    
	driver.close();		
	
		}

	}