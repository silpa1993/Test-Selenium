package practise;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/SILPA/workspace/Mytest/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//List<WebElement>r1=(List<WebElement>) driver.findElement(By.xpath("//input[@id='sex-1']"));
		List<WebElement> radio1= driver.findElements(By.name("sex"));
		boolean bval=false;
		System.out.println(radio1.get(0));
		
		bval=radio1.get(0).isSelected();
		System.out.println("aval"+bval);
		if(bval==true)
		{
			radio1.get(0).click();
			System.out.println(radio1.get(1));
		}
		else
		{
			radio1.get(1).click();
			bval=radio1.get(1).isSelected();
			System.out.println("bval" +bval);
		}
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.close();
		

	}

}
