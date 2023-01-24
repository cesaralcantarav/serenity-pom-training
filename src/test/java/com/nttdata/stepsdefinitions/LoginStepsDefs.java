package com.nttdata.stepsdefinitions;

//import com.epam.healenium.SelfHealingDriver;
import com.nttdata.pagesobjects.LoginPage;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefs {
    LoginPage loginPage;
    @Steps
    LoginSteps loginSteps;

   // private SelfHealingDriver driver;
   // private WebDriver delegate;


//    @Before(order=0)
//    public void setUp(){
//        delegate = Serenity.getDriver();
//        driver = SelfHealingDriver.create(delegate);
//    }

    @Given("^que el Cliente se encuentra en la página SauceDemo$")
    public void queElClienteSeEncuentraEnLaPáginaSauceDemo() {
        loginPage.open();
    }

    @When("inicia sesión con las credenciales: {string}, {string}")
    public void iniciaSesiónConLasCredenciales(String user, String password) throws InterruptedException {
     //   Thread.sleep(25000);
       loginSteps.login(user, password);
    }

    @Then("el login es satisfactorio")
    public void el_login_es_satisfactorio() {
        Assert.assertThat(loginSteps.validateLogin(), equalTo(true));
    }
}
