package MyTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPom;
import Utility.BaseClass;
import Utility.Library;
public class HomeTest extends BaseClass{
	@Test
	public void login()
	{
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.getclick(login.getAllList());
		
		Library.getclick(login.getBestSeller());
		Library.getclick(login.getTodaysDeal());
		Library.getclick(login.getMobiles());
		Library.getclick(login.getCustomerService());
		Library.getclick(login.getBooks());
		Library.getclick(login.getElectroncs());
		Library.getclick(login.getPrime());
		Library.getclick(login.getFashion());
		//Library.getclick(login.getNewRelease());
		
		
	}
}
