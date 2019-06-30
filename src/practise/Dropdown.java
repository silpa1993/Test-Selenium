package practise;
import java.io.File;

import org.openqa.selenium.NoSuchElementException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/SILPA/workspace/Mytest/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//String S=driver.findElement(By.xpath("//table[@class='tsc_table_s13']")).getText();
		String s1=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr[1]//td[2]")).getText();
		System.out.println(s1);
		String s3="Clock Tower Hotel";
		for(int i=1;i<5;i++)
		{
						String s2=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+i+"]//th")).getText();
				System.out.println(s2);
				if(s2.equalsIgnoreCase(s3))
				{
					for(int j=1;j<5;j++)
					{
					String s4=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+i+"]//td["+j+"]")).getText();
						System.out.println(s4);
					}
				}
			
		}
		driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr[1]//td[6]")).click();
		driver.close();
		
		
	}

}
