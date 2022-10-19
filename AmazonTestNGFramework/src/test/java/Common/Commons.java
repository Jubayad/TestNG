package Common;


import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commons {
	public WebDriver driver;
	@Parameters({"browser" , "website"})
  @Test
  public void f() {
  }
  @BeforeClass
	  public void browser(String Ibrowser,String website) {
		  String location = System.getProperty("user.dir");
		  if(Ibrowser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver", location+"\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.navigate().to(ur);
			  
		  }
		  else if (Ibrowser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", location+"\\Drivers\\msedgedriver.exe");
			  driver = new EdgeDriver();
			  driver.navigate().to(ur);
		  }
  }

  @AfterClass
  public void AfterTestClass() throws IOException{
	Screenshot();  
  }
  
  public void Screenshot() throws IOException {
  String jk = System.getProperty("user.dir");//any other want ur project
  System.out.println(jk);
  Date ob = new Date();
  System.out.println(ob);
  String files=ob.toString().replace(" ", "_").replace(":", "_");
  System.out.println(files);
  File pages=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(pages, new File(jk+"\\Pictures\\"+folder+"\\" +files +"Home3.jpg"));
  }
	  }
