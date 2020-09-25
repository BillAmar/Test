package com.theInternet.StepDefinitions;

import com.theInternet.Pages.mouseHoverPage;
import com.theInternet.Utilities.ConfigurationReader;
import com.theInternet.Utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class mouseHoverStepDefs {

    mouseHoverPage mouseHoverPage = new mouseHoverPage();
    Actions actions;

    @Given("User on Hovers page")
    public void user_on_Hovers_page() {
        System.out.println("Opening the Hover page");
        Driver.get().get(ConfigurationReader.get("baseURL")+"hovers");
        Driver.get().manage().window().fullscreen();
    }

    @When("User does a mouse hover on each image")
    public void user_does_a_mouse_hover_on_each_image() {
        actions = new Actions(Driver.get());

        actions.moveToElement(mouseHoverPage.firstImage).perform();
        assertTrue(mouseHoverPage.text.isDisplayed());

        actions.moveToElement(mouseHoverPage.secondImage).perform();
        assertTrue(mouseHoverPage.text.isDisplayed());

        actions.moveToElement(mouseHoverPage.thirdImage).perform();
        assertTrue(mouseHoverPage.text.isDisplayed());
    }

    @Then("the additional information is displayed for each image")
    public void the_additional_information_is_displayed_for_each_image() {
        System.out.println("Additional information displayed");

    }
}
