package welearn;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.annotations.AfterClass;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.Test;

		import java.util.ArrayList;
		import java.util.List;

		public class Assignment3 {

		    private static WebDriver driver;
		    private static String url = "http://demo.guru99.com/test/newtours/register.php/";
		    String googleURL = "https://www.google.com/";
		    List<String> countries = new ArrayList<>();

		   @BeforeClass
		    public void beforeClass() {
		   //Setting Chrome driver path
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32/chromedriver.exe");

		    //Initialization of WebDriver object
		   driver = new ChromeDriver();
		    driver.navigate().to(url);
		    }
		    @Test()
		    public void testMethodOne() throws InterruptedException {

		        Select countryDropDown = new Select(getDriver().findElement(By.name("country")));
		        List<WebElement> listOfAllCountries = countryDropDown.getOptions();

		        for(int i = 0; i < 5; i++){
		            countries.add(listOfAllCountries.get(i).getText());
		        }

		        System.out.println(countries);
		        for(String country: countries){
		            getDriver().navigate().to(googleURL);
		            WebElement searchBox = getDriver().findElement(By.xpath("//input[@name='q']"));
		            searchBox.clear();
		            searchBox.sendKeys("Places " + country);
		            searchBox.submit();
		            Thread.sleep(3000);
		        }
		    }

		    @AfterClass
		    public void afterClass() {
		    //Quit the browser
		        driver.quit();
		    }

		    public static WebDriver getDriver() {
		        return driver;
		    }

		    public static String getUrl() {
		        return url;
		    }

		}

