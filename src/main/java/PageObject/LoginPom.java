package PageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom {
	
	@FindBy(id = "nav-search-dropdown-card")
	private WebElement allList;

	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_bestsellers']")
	private WebElement bestSeller ;
	
	@FindBy(css = "a[href*='deals']")
	private WebElement  todaysDeal;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement  mobiles;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_help']")
	private WebElement  customerService;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_books']")
	private WebElement  books;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_electronics']")
	private WebElement  electroncs;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_fashion']")
	private WebElement  fashion;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_newreleases']")
	private WebElement newRelease ;
	
	
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_primelink_nonmember']")
	private WebElement prime ;

	
	

	
	
	public WebElement getPrime() {
		return prime;
	}

	public WebElement getBestSeller() {
		return bestSeller;
	}

	public WebElement getTodaysDeal() {
		return todaysDeal;
	}

	public WebElement getMobiles() {
		return mobiles;
	}

	public WebElement getCustomerService() {
		return customerService;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getElectroncs() {
		return electroncs;
	}

	public WebElement getFashion() {
		return fashion;
	}

	public WebElement getNewRelease() {
		return newRelease;
	}

	public WebElement getAllList() {
		return allList;
	}
	
	
}
