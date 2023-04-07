package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @FindBy(partialLinkText = "Rochie tricotat 'Christina'")
    private WebElementFacade navigateToProduct;

    public void clickNavigateToProduct(){clickOn(navigateToProduct);}


}
