package com.luma.cucumber.pages;


import com.luma.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifySize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyColour;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyBagName;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement verifyThePrice;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement clickUpdate;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyLastPrice;

    public String verifyTextMessage() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyText);
    }

    public String verifyProductName() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyName);
    }

    public String verifyProductSize() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifySize);
    }

    public String verifyProductColour() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyColour);
    }

    public String verifyTheBagName() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyBagName);
    }

    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(500);
        return getAttributeValueFromElement(verifyQty);
    }

    public String verifyTheProductPriceInCart() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyThePrice);
    }

    public void changeQuantity5() throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(changeQty, "5");
    }

    public void clickOnUpdateShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(clickUpdate);
    }

    public String verifyTheUpdateCartPrice() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyLastPrice);

    }

}
