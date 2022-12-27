package com.nttdata.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElementFacade productTitle;

    public boolean productTitleVisible(){
        return productTitle.isVisible();
    }

}
