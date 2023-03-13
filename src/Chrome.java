
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Chrome {

	
	
	public static void main(String[] args) throws IOException, Throwable {
	System.setProperty("webdriver.chorme.driver", "C:\\Users\\Veni\\eclipse-workspace\\Selen\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
		dr.get("http://www.greenstechnologys.com/");
		Actions a = new Actions(dr);
				
		WebElement certf = dr.findElement(By.xpath("//a[text()='Certifications']"));
		a.moveToElement(certf).perform();
		
		a.keyDown("Ionic").perform();
				
//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//WebElement txtb = dr.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//txtb.click();
//WebElement altbtn = dr.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
//altbtn.click();
//
//Alert a = dr.switchTo().alert();
//String text = a.getText();
//System.out.println(text);
//a.sendKeys("Students");
//a.dismiss();
//dr.navigate().refresh();



//TakesScreenshot t = (TakesScreenshot)dr;
//t.getScreenshotAs(OutputType.FILE);

// boolean mkdir = f.mkdir();
// System.out.println(mkdir);
// 
//		boolean sub = f.mkdirs();
//		System.out.println(sub);
//		
//boolean File = f.createNewFile();
//System.out.println(File);
// 	
//		boolean directory = f.isDirectory();
//		System.out.println(directory);

//		List<String> readLines = FileUtils.readLines(f);
//		System.out.println(readLines.contains("java"));
		
	//FileUtils.write(f, "Hi everyone. This s veni from Chennai, pursuing testing course in Greens Technology, velachery Brach, Chennai.");
		
//String[] li = f.list();
//for (int i = 0; i < li.length; i++) {
//	System.out.println(li[i]);
//}
//	
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		Actions a = new Actions(dr);
//				WebElement course = dr.findElement(By.xpath("//a[text()='COURSES']"));
//a.moveToElement(course).perform();
//
//WebElement python = dr.findElement(By.xpath("(//span[text()='Python'])[1]"));
//				python.click();				
//				
//				WebElement expl = dr.findElement(By.xpath("(//button[@class='btn'])[2]"));
//						a.contextClick(expl).perform();
//						
//						r.keyPress(KeyEvent.VK_ENTER);
//						r.keyRelease(KeyEvent.VK_ENTER);
//						
//						r.keyPress(KeyEvent.VK_ENTER);
//						r.keyRelease(KeyEvent.VK_ENTER);
//				Robot r = new Robot();
//				r.keyPress(KeyEvent.VK_ENTER);
//				r.keyRelease(KeyEvent.VK_ENTER);
//				
//				WebElement first = dr.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/612/612/kybvo280/mask-respirator/i/j/8/free-size-100-ts-pl-blue-100-surgical-mask-taos-original-imagahgrvw2dgwg8.jpeg?q=70']"));
//				first.click();
//					
//				
//				String pw = dr.getWindowHandle();
//				System.out.println("Parentwindow:" + pw);
//				Set<String> all = dr.getWindowHandles();
//				System.out.println("All windows:" + all);
//				
//				for (String itr : all) {
//					if (itr!=pw) {
//						dr.switchTo().window(itr);
//					}
//				}
//				WebElement pin = dr.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
//				pin.sendKeys("606801");
//				
//		WebElement first = dr.findElement(By.xpath("//img[@src='https://images.thdstatic.com/productImages/7c1408b6-76bc-44f6-9ec8-d1f6aebc3866/svn/brushed-nickel-ceiling-fans-with-lights-al383led-bn-64_300.jpg']"));
//	first.click();
//		
//	WebElement re = dr.findElement(By.xpath("//img[@alt='Ashby Park 52 in. White Color Changing Integrated LED Brushed Nickel Ceiling Fan with Light Kit and Remote Control']"));
//	re.click();
	
		//String pw = dr.getWindowHandle();
		//System.out.println("parent id:" + pw);
		
		//Set<String> all = dr.getWindowHandles();
		//System.out.println("all id:" + all);
		
		//for (String itr : all) {
			
			//if (itr != pw) {
				
				//dr.switchTo().window(itr);
				
			//}
			
//		}
//		
//		WebElement add = dr.findElement(By.xpath("//span[text()='add to cart']"));
//		add.click();
//		WebElement price = dr.findElement(By.xpath("(//span[text()='Rs. 199'])[2]"));
//		String pr = price.getText();
//		System.out.println(pr);
		
		
		//Select s =new Select(sel);
		//s.selectByIndex(0);
		//s.selectByIndex(1);
		//s.selectByIndex(2);
		//s.selectByIndex(3);

		
		
		//List<WebElement> options = s.getAllSelectedOptions();
		//int size = options.size();
	
	//for (int i = 0; i < size; i++) {
//if (i%2!=0) {
	//System.out.println(i);
//}
	//}
		
		//Select s = new Select(day);
		//s.selectByValue("4");
		//List<WebElement> list = s.getOptions();
		//for (int i = 1; i < list.size(); i++) {
			//if (i%2==0) {
			//System.out.println(i);	
			//}
	//	}
		
		
		//Alert a =dr.switchTo().alert();
		//a.accept();
		
		//Actions a = new Actions(dr);
		
	//WebElement intr = dr.findElement(By.xpath("//input[@alt='Fashion']"));
	//a.moveToElement(intr).perform();
		
		//Thread.sleep(1000);
		
	//TakesScreenshot ts = (TakesScreenshot)dr;
		
//	File img = ts.getScreenshotAs(OutputType.FILE);
	//File target = new File("C:\\Users\\Veni\\eclipse-workspace\\Selen\\Screenshots\\job.png");
	//FileUtils.copyFile(img, target);
		
		
		
	}
}
