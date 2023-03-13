import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	 public static void main(String[] args) {
		System.setProperty("webriver.chrome.driver", "C:\\Users\\Veni\\eclipse-workspace\\Selen\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement alldata = driver.findElement(By.xpath("//table[@border='l']"));
		String text = alldata.getText();
		System.out.println(text);
		
		//particular data from the webtable
		
		List<WebElement> allrows = alldata.findElements(By.tagName("tr"));
		
WebElement allcol = allrows.get(allrows.size()-1);
		
List<WebElement> datas = allcol.findElements(By.tagName("td"));
	WebElement part = datas.get(datas.size()-1);
	String text2 = part.getText();
System.out.println(text2);	
//for (int i = 0; i < allrows.size(); i++) {
//			WebElement allcol = allrows.get(i);
//			
//			List<WebElement> datas = allcol.findElements(By.tagName("td"));
//			
//			for (int j = 0; j < datas.size(); j++) {
//				
//				WebElement out = datas.get(j);
//				String output = out.getText();
//				System.out.println(output);
//			
//			if (output.equals("first cell")) {
//					
//					System.out.println(output);
//				System.out.println("Row no: " + i);
//					System.out.println("COl no: " + j);
//				}
//			
//				
//			}
//			
//	}
//		


		
		
	}
	
	
}
