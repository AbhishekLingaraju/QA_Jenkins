import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Application 
{
	@Test(priority=1,description="Firt test case")
	public static void launch()
	{
		WebDriver driver;
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("Login successful");
	}
}
