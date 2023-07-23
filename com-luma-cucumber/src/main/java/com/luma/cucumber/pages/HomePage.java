package com.luma.cucumber.pages;

import com.luma.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouserHooverToWomenMenu() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(topLink);
    }

    public void clickOnJacket() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHooverToMenMenu() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(menLink);
    }

    public void mouseHooverToBottomsMenu() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(gearLink);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(bags);
    }
}
