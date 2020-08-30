package com.jsonplaceholder.service;

import com.jsonplaceholder.model.api.APIPost;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class PostService implements BaseService<APIPost> {

    @Override
    public APIPost getById(int id) {
        Response response = when()
                .get(APIPaths.POSTS + id);

        if (response.statusCode() == 200) {
            return response.getBody().as((APIPost.class));
        }
        return null;
    }

    public void deleteById(int id) {
        Response response = given()
                .delete(APIPaths.POSTS + id);

        if (response.statusCode() == 200) {
            System.out.println("The post has been removed successfully");
        }
    }
}
