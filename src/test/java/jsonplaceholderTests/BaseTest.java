package jsonplaceholderTests;

import com.jsonplaceholder.service.CommentService;
import com.jsonplaceholder.service.PostService;
import com.jsonplaceholder.service.UserService;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected UserService userService;
    protected CommentService commentService;
    protected PostService postService;

    @BeforeClass
    public void setUp() {
        userService = new UserService();
        commentService = new CommentService();
        postService = new PostService();

        RestAssured.baseURI = "http://localhost:3000/";
    }
}
