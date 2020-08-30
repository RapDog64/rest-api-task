package jsonplaceholderTests;

import com.jsonplaceholder.model.api.APIComment;
import com.jsonplaceholder.model.api.APIPost;
import com.jsonplaceholder.model.api.APIUser;
import com.jsonplaceholder.utility.RandomNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Jsonplaceholder extends BaseTest {

    private List<APIComment> listOfComments;
    private APIComment comment;
    private APIPost post;

    @Test(description = "Write a method which will get the list of comments")
    public void getAllComments() {
        listOfComments = commentService.getListOfComments();

        Assert.assertNotNull(listOfComments);
        Assert.assertFalse(listOfComments.isEmpty());
    }

    @Test(description = "Get random comment from the list", dependsOnMethods = "getAllComments")
    public void getRandomComment() {
        int commentId = RandomNumber.getNumber(500);

        comment = commentService.getById(commentId);

        Assert.assertNotNull(comment);
        Assert.assertEquals(commentId, comment.getId());
    }

    @Test(description = "Get post using postId from the comment object", dependsOnMethods = "getRandomComment")
    public void getPostUsingPostId() {
        post = postService.getById(comment.getPostId());

        Assert.assertNotNull(comment);
        Assert.assertNotNull(post);
        Assert.assertEquals(post.getId(), comment.getPostId());
    }


    @Test(description = "Then get user by userId from the post", dependsOnMethods = "getPostUsingPostId")
    public void getUserById() {
        APIUser user = userService.getById(post.getUserId());

        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), post.getUserId());
    }

    @Test(description = "DELETE that post", dependsOnMethods = "getUserById")
    public void deletePost() {
        postService.deleteById(post.getId());

        APIPost deletedPost = postService.getById(post.getId());

        Assert.assertNull(deletedPost);
    }

    @Test(description = "Using PUT change username to one you prefer more and log the result in the console")
    public void changeUsername() {
        int userId = RandomNumber.getNumber(10);

        APIUser user = userService.getById(userId);
        System.out.println("Username before updating: " + user.getName());
        System.out.println("user id:" + user.getId());

        user.setName("Peter Peter dirty sweater");

        APIUser newUser = userService.updateUser(user);
        System.out.println("Username after updating: " + newUser.getName());

        Assert.assertEquals(user.getId(), newUser.getId());
    }
}
