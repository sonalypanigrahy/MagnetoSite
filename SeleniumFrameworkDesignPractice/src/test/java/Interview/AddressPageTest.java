package Interview;

import static Helpers.Constants.EMAIL;
import static Helpers.Constants.PASSWORD;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseClassesInterviewPractice.AddressPage;

public class AddressPageTest extends BaseTest {
	@Test(enabled=false)
	public void LogInDetails() {
		objLandingPage = objLandingPage.GoToSignIn().Login(EMAIL, PASSWORD);
	}

	@Test()
	public void AddressforDelivery() throws InterruptedException, IOException {
		AddressPage objAddressPage = new AddressPage(objWebDriver);
		objAddressPage.GoToAddress();
		String confirmationMessageforAddress = objAddressPage.SelectDefaultAddress();
		Assert.assertEquals(confirmationMessageforAddress, "You saved the address.");
		TakeScreenshot("AddressforDelivery");
	}

}
