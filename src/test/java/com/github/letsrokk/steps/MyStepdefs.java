package com.github.letsrokk.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Attachment;
import org.junit.Assert;

public class MyStepdefs {

    @Given("^question asked$")
    public void questionAsked() throws Throwable {
        // Do nothing
        attachment("hello");
    }

    @When("^answered correctly$")
    public void answeredCorrectly() throws Throwable {
        // Do nothing
    }

    @Then("^mark as accepted$")
    public void markAsAccepted() throws Throwable {
        // Do nothing
    }

    @When("^something went wrong$")
    public void somethingWentWrong() throws Throwable {
        // Do nothing
    }

    @Then("^fail scenario$")
    public void failScenario() throws Throwable {
        //Assert.fail();
    }

    @Attachment(value = "attachment", type = "text/json")
    public String attachment(String str) {
        return str;
    }
}
