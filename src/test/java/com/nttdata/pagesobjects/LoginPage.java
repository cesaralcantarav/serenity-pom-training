package com.nttdata.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    public WebElementFacade userNameInput;

    @FindBy(css="#password")
    public WebElementFacade passwordInput;

    @FindBy(id="login-button")
    public WebElementFacade loginButton;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")
    public WebElementFacade errorText;

    @WhenPageOpens
    public void waitUntilUserInputVisible(){
        element(userNameInput).waitUntilVisible();
    }

    public void enterUser(String user){
        userNameInput.sendKeys(user);
       //driver.findElement(By.id("user-name")).sendKeys(user);
    }

    public void enterPassword (String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }


}
