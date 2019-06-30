package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:/Users/SILPA/workspace/Mytest/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div]/p/a")).click();
		driver.close();
	}

}
