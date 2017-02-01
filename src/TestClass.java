
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {
 
	
	@Test
	public  void TestClass(){	
		
		
		System.setProperty("webdriver.chrome.driver", "C:/javaTraining/ws/CallBy/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.co.in");
		
		
	}

}
