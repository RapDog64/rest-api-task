package com.jsonplaceholder.service;

import com.jsonplaceholder.model.api.APIUser;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class UserService implements BaseService<APIUser> {

    @Override
    public APIUser getById(int id) {
        Response response = when()
                .get(APIPaths.USERS + id);

        if (response.statusCode() == 200) {
            return response.getBody().as(APIUser.class);
        }
        return null;
    }

    public APIUser updateUser(APIUser user) {
        Response response = given().header("Content-type", "application/json; charset=UTF-8")
                .body(user)
                .put(APIPaths.USERS + user.getId());

        if (response.statusCode() == 200) {
            return response.getBody().as(APIUser.class);
        }
        return null;
    }
}
