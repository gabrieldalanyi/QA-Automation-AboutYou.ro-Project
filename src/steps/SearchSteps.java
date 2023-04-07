package steps;

import net.thucydides.core.annotations.Step;

public class SearchSteps extends BaseSteps {

    @Step
    public void searchFromKeyword(String keyword){
        homePage.clickCockiesAcceptButton();
        homePage.clickSearchFieldButton();
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();

    }



}
