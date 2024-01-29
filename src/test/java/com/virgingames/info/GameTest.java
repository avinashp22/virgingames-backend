package com.virgingames.info;

import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class GameTest extends TestBase {

    @Steps
    GameSteps gameSteps;

    @Title("Verify jackpotId is Roxor Progressives")
    @Test
    public void test001() {
        ValidatableResponse response = gameSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.jackpotId", equalTo("Roxor Progressives"));
    }

    @Title("Verify pots 5th id is play-classic-wilds-progressive")
    @Test
    public void test002() {
        ValidatableResponse response = gameSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.pots[4].name", equalTo("play-classic-wilds-progressive"));
    }


    @Title("Verify currency is GBP")
    @Test
    public void test003() {
        ValidatableResponse response = gameSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("GBP"));
    }


    @Title("Verify currency is EUR")
    @Test
    public void test004() {
        ValidatableResponse response = gameSteps.getAllPotsEURData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("EUR"));
    }

    @Title("Verify amount for 2nd index is 65565.9")
    @Test
    public void test005() {
        ValidatableResponse response = gameSteps.getAllPotsEURData();
        response.statusCode(200).log().all();
        response.body("data.pots[2].amount", equalTo(65565.9F));
    }



}
