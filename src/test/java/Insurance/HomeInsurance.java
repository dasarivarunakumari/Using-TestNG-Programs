package Insurance;

import org.testng.annotations.Test;

public class HomeInsurance {
	
	@Test(priority=1)
	public void WebLoginHomeInsurance()
	{
		System.out.println("Home Insurance Weblogin");
	}
	@Test(priority=-1)
	public void WebLogoutHomeInsurance()
	{
		System.out.println("Home Insurance Weblogout");
	}
	@Test(priority=0)
	public void MobileLoginHomeInsurance()
	{
		System.out.println("Home Insurance Mobilelogin");
	}
	@Test(priority=2)
	public void MobileLogoutHomeInsurance()
	{
		System.out.println("Home Insurance Mobilelogout");
	}

}
