package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;

import java.util.List;

public interface PostDao {
    public Post createPost(Post post);
    public Post getPost(int postID);
    public List<Post> getPostByPoster(String posterName);
    public void updatePost(Post post);
    public void deletePost(int postID);
}
