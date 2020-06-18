package welearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		//Open browser
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		//Setting URL
		driver.get("https://montrealcollege.omnivox.ca/");
		
		//Code
		
		
		//Wait for 5 seconds
		Thread.sleep(5000);
		
		//Close
		driver.close();
		}
}
