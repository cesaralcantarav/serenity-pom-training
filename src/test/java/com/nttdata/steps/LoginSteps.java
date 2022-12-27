package com.nttdata.steps;

//import com.epam.healenium.SelfHealingDriver;
import com.nttdata.pagesobjects.InventoryPage;
import com.nttdata.pagesobjects.LoginPage;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    LoginPage loginPage;

    @Steps
    InventoryPage inventoryPage;

    @Step("User login")
    public void login(String user, String password, WebDriver driver){
        loginPage.enterUser(user, driver);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step("Validate login")
    public boolean validateLogin(){
        return inventoryPage.productTitleVisible();
    }
}
