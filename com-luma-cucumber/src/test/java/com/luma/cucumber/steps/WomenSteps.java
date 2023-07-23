package com.luma.cucumber.steps;

import com.luma.cucumber.pages.HomePage;
import com.luma.cucumber.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I mouse hoover on women")
    public void iMouseHooverOnWomen() throws InterruptedException {
        new HomePage().mouserHooverToWomenMenu();
    }

    @And("I mouse hoover on Tops")
    public void iMouseHooverOnTops() throws InterruptedException {
        new HomePage().mouseHooverToTopMenu();
    }

    @And("I click on Jackets")
    public void iClickOnJackets() throws InterruptedException {
        new HomePage().clickOnJacket();
    }
    @And("I select sort by filter {string}")
    public void iSelectSortByFilter(String ProductName) {
    new WomenPage().selectProductNameFilter(ProductName);
    }

    @Then("I should see the products are sorted by product name")
    public void iShouldSeeTheProductsAreSortedByProductName() {
        Assert.assertEquals(new WomenPage().productListAfterSorting().toString(), new WomenPage().productListBeforeSorting(), "Text not verified");
    }
    @And("I select sort filter {string}")
    public void iSelectSortFilter(String Price) {
        new WomenPage().selectSortPrice(Price);
    }

    @Then("I should see the products are sorted by filter Price")
    public void iShouldSeeTheProductsAreSortedByFilterPrice() {
        Assert.assertEquals(new WomenPage().priceListAfterSorting().toString(), new WomenPage().priceListBeforeSorting(), "Text not verified");
    }



}
