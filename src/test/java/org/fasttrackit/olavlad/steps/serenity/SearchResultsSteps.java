package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.olavlad.pages.Homepage;
import org.fasttrackit.olavlad.pages.SearchResultsPage;

public class SearchResultsSteps {

    Homepage homepage;
    SearchResultsPage searchResultsPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void searchField (){
        searchResultsPage.setSearchField("sdfghj");
        searchResultsPage.clickSearchButton();

    }
}
