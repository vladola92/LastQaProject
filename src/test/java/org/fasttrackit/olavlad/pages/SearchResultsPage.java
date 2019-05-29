package org.fasttrackit.olavlad.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")


public class SearchResultsPage extends PageObject {

    @FindBy(css = "label input[name='s'].search-field")
    private WebElementFacade searchField;

    @FindBy(css = "input.search-submit")
    private WebElementFacade searchButton;

    public void setSearchField(String words ){
        typeInto(searchField, words);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

}
