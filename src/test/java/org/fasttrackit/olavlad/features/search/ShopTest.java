package org.fasttrackit.olavlad.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.olavlad.steps.serenity.ShopSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ShopTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    ShopSteps shopSteps;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
    }

    @Test
    public void checkingTheShopPage(){
        shopSteps.navigateToHomepage();
        shopSteps.goToShopPage();
    }
}
