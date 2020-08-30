package com.jsonplaceholder.service;

import com.jsonplaceholder.model.api.APIComment;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.when;


public class CommentService implements BaseService<APIComment> {

    public List<APIComment> getListOfComments() {
        Response response = when()
                .get(APIPaths.COMMENTS);

        if (response.statusCode() == 200) {
            return Arrays.asList(response.getBody().as(APIComment[].class));
        }
        return null;
    }

    @Override
    public APIComment getById(int id) {
        Response response = when()
                .get(APIPaths.COMMENTS + id);

        if (response.statusCode() == 200) {
            return response.getBody().as((APIComment.class));
        }
        return null;
    }
}
