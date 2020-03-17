package SauceLabs.saucelabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class App 
{
	public DesiredCapabilities capabilities = new DesiredCapabilities("mobileOS", "", Platform.ANY);
	public static RemoteWebDriver driver = null;
	@Test
    public  void Testrun( )
    {
       
		String  chrome_srvr_path = System.getProperty("user.dir")+"\\libs\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_srvr_path);
		ChromeOptions options = new ChromeOptions();
		driver1 = new ChromeDriver();
		driver=new EventFiringWebDriver(driver1);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Chrome Browser opened");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

    }
}
