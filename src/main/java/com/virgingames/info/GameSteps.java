package com.virgingames.info;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GameSteps {

    //Enter reusable steps here

    @Step("Get All GBP data")
    public ValidatableResponse getAllPotsGBPData() {
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCYGBP)
                .then();
    }

    @Step("Get All EUR data")
    public ValidatableResponse getAllPotsEURData() {
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCYEUR)
                .then();
    }
}
