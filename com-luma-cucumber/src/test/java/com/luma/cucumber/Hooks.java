package com.luma.cucumber;


import com.luma.cucumber.propertyreader.PropertyReader;
import com.luma.cucumber.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
