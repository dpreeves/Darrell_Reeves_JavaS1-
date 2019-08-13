package com.trilogyed.post.controller;

import com.trilogyed.post.dao.PostDaoJdbcTemplateImpl;
import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostDaoJdbcTemplateImpl postDaoJdbcTemplate;

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody Post post) {
        return postDaoJdbcTemplate.createPost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Post getPost(@PathVariable int postId) {
        return postDaoJdbcTemplate.getPost(postId);
    }

    @RequestMapping(value = "/posts/user/{posterName}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getPostByPoster(@PathVariable String posterName) {
        return postDaoJdbcTemplate.getPostByPoster(posterName);
    }


    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(@RequestBody Post post, @PathVariable int postId) {
        postDaoJdbcTemplate.updatePost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable int postId) {
        postDaoJdbcTemplate.deletePost(postId);
    }
}
