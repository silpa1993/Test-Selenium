//Program for upload &download file
package practise;
import org.openqa.selenium.By;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class P4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/SILPA/workspace/Mytest/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//upload(driver);
		download(driver);
	}
	public static void download(WebDriver driver)
	{
	driver.get("http://demo.guru99.com/test/yahoo.html");	
	WebElement download=driver.findElement(By.id("messenger-download"));
	String source=download.getAttribute("href");
	
	String wget_cmd="cmd.exe /c C:\\Wget\\wget.exe -P D: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe";
	
	try
	{
	Process exec=Runtime.getRuntime().exec(wget_cmd);
	int exitval=exec.waitFor();
	System.out.println(exitval);
	}catch(InterruptedException|IOException ex)
	{
		System.out.println(ex.toString());
	}
	driver.close();
	}
	
	/*public static void upload(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.name("uploadfile_0"));
		upload.sendKeys("C:/Users/SILPA/workspace/Testdata1/pgm-hari.docx");
		driver.findElement(By.id("terms")).click();
		//driver.findElement(By.xpath("//input[@id="terms" and @name="terms"]")).click();
		driver.findElement(By.id("submitbutton"));
		//Threadsleep(100);
		System.out.println("upload successfull");
		driver.close();

	}*/

}
