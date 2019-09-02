package Site;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;;

public class Contactus {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Test\\Source\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://lmss4.littlemonkey.info/");
		Thread.sleep(50);
		
		
		//jump into contact page
		WebElement contactus = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[7]/a"));
		JavascriptExecutor contactexecutor = (JavascriptExecutor)driver;
		contactexecutor.executeScript("arguments[0].click();",contactus);
		Thread.sleep(80);
		//fill in the contact details
		driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_EditableTextField_b3d4b\"]")).sendKeys("ABCabc123,.*");
		Thread.sleep(80);
		driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_EditableTextField_d0a0d\"]")).sendKeys("ABCcdef1234*/,.@gmail.co");
		Thread.sleep(80);
		driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_EditableTextField_1b903\"]")).sendKeys("1241241");
		Thread.sleep(80);
		Select apptype = new Select(driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_EditableTextField_f8d29\"]")));
		apptype.selectByVisibleText("Custom Development");
		Thread.sleep(80);
		driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_EditableTextField_47103\"]")).sendKeys("ajifjdsd");
		
		//submit the information
		WebElement submitcontactdetail = driver.findElement(By.xpath("//*[@id=\"UserForm_Form_3_action_process\"]"));
		JavascriptExecutor submitcontactexecutor = (JavascriptExecutor)driver;
		submitcontactexecutor.executeScript("arguments[0].click();",submitcontactdetail);
		
		Thread.sleep(80);
		driver.navigate().back();
		

		
		
	}
	

}
