package MyTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPom;
import Utility.BaseClass;
import Utility.Library;
public class LoginTest extends BaseClass{
	@Test
	public void login()
	{
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.getclick(login.getAllList());
	}
}
