package org.fasttrackit.olavlad.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.olavlad.steps.serenity.CheckOutSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckOutTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    CheckOutSteps checkOutSteps;

    @Before
    public void maximise(){
        driver.manage().window().maximize();

    }
    @Test
    public void checkingOutTheProducts(){
        checkOutSteps.navigateToHomepage();
        checkOutSteps.goToChecoutPage();
    }

}
