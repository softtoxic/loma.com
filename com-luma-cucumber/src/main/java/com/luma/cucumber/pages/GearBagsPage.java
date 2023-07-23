package com.luma.cucumber.pages;

import com.luma.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearBagsPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearBagsPage.class.getName());

    public GearBagsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffle;

    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(overNightDuffle);
    }
}
