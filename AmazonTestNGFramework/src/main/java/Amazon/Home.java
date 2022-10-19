package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
@FindBy(name = "field-keywords") WebElement Search;
@FindBy(id = "nav-search-submit-button") WebElement searchbuttonclick;
public WebDriver driver;

public void searchfieldsend(String wordings) {
	Search.sendKeys(wordings);
}

public void searchbuttonclicking() {
	searchbuttonclick.click();
}

public Home(Webdriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
