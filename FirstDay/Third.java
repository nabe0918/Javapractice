package welearn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	public class Third {
		
		public static void main(String[] args) throws InterruptedException {
			//Setting WebDriver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32/chromedriver.exe");
			
			//Defining WEBdriver object
			WebDriver driver = new ChromeDriver();
			
			//Maximize browser
			driver.manage().window().maximize();
			
			//Setting URL
			driver.get("https://form.jotform.com/201165787510252");
			
			//ENter UserName
			driver.findElement(By.xpath("//*[@id=\"Identifiant\"]")).sendKeys("201908210");
			
		//Select DOB
		Select drpMonth = new Select(driver.findElement(By.xpath("//*[@id=\"input_65_month\"]")));
			
		Select drpDate = new Select(driver.findElement(By.xpath("//select[@id='input_65_day']")));
							
		Select drpYear = new Select(driver.findElement(By.xpath("//select[@id='input_65_year']")));		
			
		//Select Gender
		
		WebElement radioMale = driver.findElement(By.xpath("//input[@id='input_66_0']"));
		
		//Enter  Grade
		driver.findElement(By.xpath("//input[@id='input_67']")).sendKeys("1");
		
		//Enter Address
		
		driver.findElement(By.xpath("//input[@id='input_3_addr_line1']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='input_3_city']")).sendKeys("Montreal");
		driver.findElement(By.xpath("//input[@id='input_3_state']")).sendKeys("Quebec");
		driver.findElement(By.xpath("//input[@id='input_3_postal']")).sendKeys("H2K2R7");
		driver.findElement(By.xpath("//select[@id='input_3_country']")).sendKeys("Canada");
		
				
		}

	}
