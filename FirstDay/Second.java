package welearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		//Setting WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32/chromedriver.exe");
		
		//Defining WEBdriver object
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Setting URL
		driver.get("https://montrealcollege.omnivox.ca/");
		
		//Get Title of the webpage
		String actualResult = driver.getTitle();
		String expectedResult = "Montreal College of Information Technology";
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		
		//ENter UserName
		driver.findElement(By.xpath("//*[@id=\"Identifiant\"]")).sendKeys("201908210");
		
		//Enter password
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Abcd1234");
		
		//Click on login button
		driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[4]/div/button/span")).click();
		
		
		//Closing Browser
		driver.close();
		
		//Wait for 5 seconds
		Thread.sleep(5000);

	}

}
