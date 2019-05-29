package org.fasttrackit.olavlad.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.olavlad.pages.SearchResultsPage;
import org.fasttrackit.olavlad.steps.serenity.SearchResultsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchResultsTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    SearchResultsSteps searchResultsSteps;

    @Test
    public void searchWithRandomCredentials(){
        searchResultsSteps.navigateToHomepage();;
        searchResultsSteps.searchField();
    }

}
