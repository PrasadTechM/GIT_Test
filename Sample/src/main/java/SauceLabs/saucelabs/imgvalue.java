package SauceLabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.asprise.util.ocr.OCR;


public class imgvalue {
	
	public static void main(String arg[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://secure.aarp.org/applications/user/register?intcmp=DSO-HDR-REG&referrer=https%3A%2F%2Fwww.aarp.org%2Fabout-aarp%2Fcontact-us%2F");
		 String imageUrl=driver.findElement(By.xpath("//img[@id='nucaptcha-media']")).getAttribute("src");
		 System.out.println("Image source path : \n"+ imageUrl);

		 URL url = new URL(imageUrl);
		 Image image = ImageIO.read(url);
		 String s = new OCR().recognizeCharacters((RenderedImage) image);
		 System.out.println("Text From Image : \n"+ s);
		 System.out.println("Length of total text : \n"+ s.length());
		 driver.quit();
		
	}

}
