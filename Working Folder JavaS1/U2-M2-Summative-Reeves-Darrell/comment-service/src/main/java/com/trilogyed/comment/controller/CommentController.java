package com.trilogyed.comment.controller;

import com.trilogyed.comment.dao.CommentDaoJdbcTemplateImpl;
import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    CommentDaoJdbcTemplateImpl commentDaoJdbcTemplate;

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createComment(@RequestBody Comment comment){
        return commentDaoJdbcTemplate.createComment(comment);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Comment getComment(@PathVariable int commentId){
        return commentDaoJdbcTemplate.getComment(commentId);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateComment(@RequestBody Comment comment, @PathVariable int commentId){
        commentDaoJdbcTemplate.updateComment(comment);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable int commentId){
        commentDaoJdbcTemplate.deleteComment(commentId);
    }
}
