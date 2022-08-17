package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom {
	
	@FindBy(id = "nav-search-dropdown-card")
	private WebElement allList;

	public WebElement getAllList() {
		return allList;
	}
	
	
}
