package firstWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class geicoQuote {

	public static void main(String[] args) {
		
		String TestUrl="https://www.geico.com/#"; 
		String zipcode= "22031"; 
		String firstName="Bob"; 
		String lastName="Oden"; 
		String address= "9335 lee hwy"; 
		String apt= "609";
		//String birthmonth="10"; 
		
		WebDriver driver; 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohail\\Desktop\\WebDrivers\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.navigate().to(TestUrl);
		
	/*	driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		
		// Another way of navigating to an url
		driver.get(TestUrl);
		
		WebElement zipcodeLocation= driver.findElement(By.xpath(".//*[@id='zip']")); 
		WebElement submitbuttonlocation=  driver.findElement(By.xpath(".//*[@id='submitButton']")); 
		//WebElement firstNamelocation=driver.findElement(By.xpath(".//*[@id='CustomerForm:firstName']")); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		zipcodeLocation.sendKeys(zipcode); 
		submitbuttonlocation.click(); 
		//firstNamelocation.sendKeys(firstName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// start a new page

		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath(".//*[@id='street']")).sendKeys(address); 
		driver.findElement(By.xpath(".//*[@id='apt']")).sendKeys(apt); 
		driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys(address); 
		driver.findElement(By.xpath(".//*[@id='apt']")).sendKeys(apt); 
		
		
		// starting the date of birth section 
		driver.findElement(By.xpath(".//*[@id='date-monthdob']")).sendKeys("10"); 
		driver.findElement(By.xpath(".//*[@id='date-daydob']")).sendKeys("23"); 
		driver.findElement(By.xpath(".//*[@id='date-yeardob']")).sendKeys("1989"); 
		
		// choosing the options
		
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click(); 
		//driver.findElement(By.xpath(".//*[@id='CustomerForm:continueBtn']")).click(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		Select ddYear=new Select
				(driver.findElement(By.xpath(".//*[@id='VehicleForm:year']"))); 
		ddYear.selectByVisibleText("2015");
		
		// need to make sure the next object is present or visible , choosing the make
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='VehicleForm:make']")));
		
		
		Select ddMake=new Select (driver.findElement(By.xpath(".//*[@id='VehicleForm:make']"))); 
		ddMake.selectByVisibleText("Audi");
		
		// choosing the model
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='VehicleForm:model']")));
		
		
		Select ddModel=new Select (driver.findElement(By.xpath(".//*[@id='VehicleForm:model']"))); 
		ddModel.selectByVisibleText("A5 2.0T Premium");
		
		driver.quit();
		
		

	}

}

