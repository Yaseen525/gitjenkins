package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91932\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        
		   WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();    
		   driver.get("https://tide.com/en-us");
		   System.out.println("page title is:"+driver.getTitle());
		   
	        WebElement object= (WebElement) driver.findElements(By.partialLinkText("Register"));
			object.click();
			Thread.sleep(5000);
			WebElement object1= (WebElement) driver.findElements(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a"));
			  object1.click(); 
			  WebElement object2= (WebElement) driver.findElements(By.partialLinkText("Sign up now"));
			  object2.click();
			  Thread.sleep(2000);
			  WebElement object3 = (WebElement) driver.findElements(By.xpath("//*[@id=\"name\"]"));
			  object3.sendKeys("Yaseen");
			  WebElement object4 = (WebElement) driver.findElements(By.xpath("//*[@id=\"email\"]"));
			  object4.sendKeys("imyaseen.kh@gmail.com");
			  WebElement object5 = (WebElement) driver.findElements(By.xpath("//*[@id=\"password\"]"));
			  object5.sendKeys("Yaseen@123");
	WebElement object6 = (WebElement) driver.findElements(By.xpath("//*[@id=\"scroll\"]/div/div/div/div/div[2]/form/div[6]/div/input"));
			  object6.click();
	}
	
}


