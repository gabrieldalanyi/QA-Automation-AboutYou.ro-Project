package features;

import org.junit.Test;
import utils.Constans;

public class LoginTest extends Basetest {

    @Test
    public void loginWithValidCredentials() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.waitABit(6000);
        loginSteps.verifyUserIsLoggedIn("DALANYI");
        loginSteps.waitABit(2000);
}



}
