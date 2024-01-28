package com.virgingames.info;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;


public class GameSteps {

    @Step
    public ValidatableResponse getAllData(){
        return SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(EndPoints.GET_BINGO_USER)
                .then().log().all();
    }
}
