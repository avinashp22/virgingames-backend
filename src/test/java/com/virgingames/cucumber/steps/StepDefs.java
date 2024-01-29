package com.virgingames.cucumber.steps;

import com.virgingames.info.GameSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefs {

    static ValidatableResponse response;

    @Steps
   GameSteps steps;

    @When("User sends a request to get all GBP data")
    public void userSendsARequestToGetAllGBPData() {
        response=steps.getAllPotsGBPData();
        response.statusCode(200).log().all();
    }

    @Then("Verify Jackpot id is Roxor Progressives")
    public void verifyJackpotIdIsRoxorProgressives() {
       response.body("data.jackpotId", equalTo("Roxor Progressives"));
    }

    @Then("Verify 5th id is play-classic-wilds-progressive")
    public void verify5thIdIsPlayClassicWildsProgressive() {
        response.body("data.pots[4].name", equalTo("play-classic-wilds-progressive"));
    }

    @Then("Verify currency is GBP")
    public void verifyCurrencyIsGBP() {
        response.body("data.pots[0].currency", equalTo("GBP"));
    }

    @When("User sends a request to get all EUR data")
    public void userSendsARequestToGetAllEURData() {
        response = steps.getAllPotsEURData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("EUR"));
    }

    @Then("Verify currency is EUR")
    public void verifyCurrencyIsEUR() {
        response = steps.getAllPotsEURData();
        response.body("data.pots[0].currency", equalTo("EUR"));
    }

    @Then("Verify EUR amount for 2nd index is EUR 65565.9")
    public void verifyEURAmountFor2ndIndexIsEUR() {
        response = steps.getAllPotsEURData();
        response.body("data.pots[2].amount", equalTo(65565.9F));
    }
}
