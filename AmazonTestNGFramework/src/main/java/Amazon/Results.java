package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class Results {
WebDriver driver;

public int ResultsToVerify() {
	int elements = driver.findElements(By.xpath("//*[text()='1-16 of over 200 results for'")).size();
	return elements;
}
@FindBy(xpath = "//*")

public Results(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
