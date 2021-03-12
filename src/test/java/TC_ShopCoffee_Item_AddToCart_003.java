package test.java;

import main.java.pageEvents.HomePage;
import org.testng.annotations.Test;

public class TC_ShopCoffee_Item_AddToCart_003 extends BaseTest {

    String COFFEE_NAME = "Monarch";

    @Test(description = "Add Item to the Cart")
    public void shopCoffeeAddItemToCart()
    {
        HomePage hp = new HomePage();
        hp.clickOnShopCoffeeTab();
        hp.clickOnSearchIcon();
        hp.searchItem(COFFEE_NAME);
        hp.selectSearchedItem();
    }
}
