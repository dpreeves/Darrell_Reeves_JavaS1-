package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;

public interface CommentDao {
    public Comment createComment(Comment comment);
    public Comment getComment(int commentId);
    public void updateComment(Comment comment);
    public void deleteComment(int commentId);
}
