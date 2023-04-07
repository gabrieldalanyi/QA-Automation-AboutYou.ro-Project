package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.aboutyou.ro/")
public class HomePage extends PageObject {

    @FindBy(css = "#onetrust-button-group #onetrust-accept-btn-handler")
    private WebElementFacade cockiesAcceptButton;

    @FindBy(css = ".sc-eqdo26-1.nEqzo")
    private WebElementFacade searchFieldButton;

    @FindBy( css = ".sc-eqdo26-0.iKHNlg")
    private WebElementFacade searchField;

    @FindBy(css = ".sc-eqdo26-1.nEqzo")
    private WebElementFacade searchButton;

    @FindBy(css = ".userIcon--_rKlp")
    private WebElementFacade accountLink;

    @FindBy(css = "span .sc-t6bp6s-3.sc-t6bp6s-5.figUyy.hykRlf")
    private WebElementFacade welcomeTextElement;



    public void clickCockiesAcceptButton(){clickOn(cockiesAcceptButton);}

    public void clickSearchFieldButton(){clickOn(searchFieldButton);}

    public void setSearchField(String value){typeInto(searchField,value);}

    public void clickSearchButton(){clickOn(searchButton);}

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }


}
