package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



@Repository
public class PostDaoJdbcTemplateImpl implements PostDao {

    public static final String INSERT_POST = "insert into post (post_date, poster_name, post) values (?, ?, ?)";
    public static final String SELECT_POST = "select * from post where post_id = ?";
    public static final String SELECT_POST_BY_POSTER = "select * from post where poster_name = ?";
    public static final String UPDATE_POST = "update post set post_date = ?, poster_name = ?, post = ? where post_id = ?";
    public static final String DELETE_POST = "delete from post where post_id = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    public PostDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate ;}

    @Override
    public Post createPost(Post post) {
        jdbcTemplate.update(INSERT_POST, post.getPostDate(), post.getPosterName(), post.getPost());
        int postID = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);
        post.setPostId(postID);
        return post;
    }

    @Override
    public Post getPost(int postID) {
        try{
            return jdbcTemplate.queryForObject(SELECT_POST, this::mapRowToPost, postID);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Post> getPostByPoster(String posterName) {
        try{
            return jdbcTemplate.query(SELECT_POST_BY_POSTER, this::mapRowToPost, posterName);
        } catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public void updatePost(Post post) {
        jdbcTemplate.update(
                UPDATE_POST,
                post.getPostDate(),
                post.getPosterName(),
                post.getPost(),
                post.getPostId());
    }

    @Override
    public void deletePost(int postID) {
        jdbcTemplate.update(DELETE_POST, postID);
    }

    private Post mapRowToPost(ResultSet rs, int rowNum) throws SQLException {
        Post post = new Post();
        post.setPostId(rs.getInt("post_id"));
        post.setPostDate(rs.getDate("post_date").toLocalDate());
        post.setPosterName(rs.getString("poster_name"));
        post.setPost(rs.getString("post"));
        return post;
    }
}
