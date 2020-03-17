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
       
    	
    	 String sauceUserName = "chandrareddy947";
	        String sauceAccessKey = "4b3d8829-7ac8-436a-892f-654ebf407d64";
	        try {

	    	capabilities.setCapability("deviceName","Samsung Galaxy S9 Plus FHD GoogleAPI Emulator");
//	        capabilities.setCapability(CapabilityType.PLATFORM, "Mac 10.8");

	        //zip file containing your app to be tested
//	        capabilities.setCapability("app", "http://appium.s3.amazonaws.com/TestApp6.0.app.zip");
	    	capabilities.setCapability("app","sauce-storage:RightTrack.apk");

	  
				driver = new RemoteWebDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub", sauceUserName, sauceAccessKey)),
				        capabilities);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
    }
}
