import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR']) [2]")).click();
		driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
		{
		System.out.println("its disabled");
		
		}
	
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 s1.selectByValue("AED");
		 
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}




	}

