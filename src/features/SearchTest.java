package features;

import org.junit.Test;
import pages.ProductPage;


public class SearchTest extends Basetest {

    @Test
    public void SearchForFemaleProductNotLoggedIn() {
        searchSteps.searchFromKeyword("Rochii premium");
        productSteps.clickNavigateToProduct();
        searchSteps.waitABit(2000);
    }



}
