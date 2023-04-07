package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(css = ".sc-3ffazj-1.dMHBmb:nth-child(2)")
    private WebElementFacade logareButton;
    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade passwordField;

    @FindBy(css = ".sc-iprg3j-0.jZFTVF.sc-ovefx6-15.sc-12p7jvx-3.gjvFNR.dEGtEE")
    private WebElementFacade loginButton;

    @FindBy(css = "ul.woocommerce-error")
    private WebElementFacade errorMessageElement;


    public void clickLogareButton() {
        clickOn(logareButton);
    }
    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }



    public String getErrorMessage(){
        return errorMessageElement.getText();
    }





}
