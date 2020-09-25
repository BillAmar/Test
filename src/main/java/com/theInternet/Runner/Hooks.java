package com.theInternet.Runner;

import com.theInternet.Utilities.Driver;
import io.cucumber.java.*;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before()
    public void setUpScenario() {
        Driver.get().manage().window().maximize();
      //  Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDownScenario() {
        Driver.closeDriver();
    }
}
