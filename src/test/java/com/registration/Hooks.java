package com.registration;

import com.cucumber.listener.Reporter;
import com.registration.propertyreader.PropertyReader;
import com.registration.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    //  @Before annotation will run before every single test
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    //  @After annotation will run before every single test
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screeShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screeShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }
}
