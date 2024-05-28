package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableOperations {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://Atomation Testing Project//edgedriver_win64//msedgedriver.exe");

	  WebDriver driver = new EdgeDriver();

	  driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	  driver.manage().window().maximize();
     int r = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
     System.out.println(r);
     int c = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th")).size();
      System.out.println(c);

      for(int i =2; i<=r ; i++) {
    	  for(int j=1;j<=c;j++) {
    		  String xpath = "//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]";
              WebElement cell = driver.findElement(By.xpath(xpath));
              System.out.print(cell.getText() + "\t");

    	  }
    	  System.out.println();
      }

      driver.close();
	}

}
