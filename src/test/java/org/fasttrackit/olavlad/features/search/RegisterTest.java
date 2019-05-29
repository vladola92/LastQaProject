package org.fasttrackit.olavlad.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.olavlad.steps.serenity.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver ;

    @Steps
    RegisterSteps registerSteps;

    @Before
    public void maximise(){
        driver.manage().window().maximize();

    }
    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToHomepage();
        registerSteps.goToRegisterPage();
        registerSteps.registerUser();
    }
}
