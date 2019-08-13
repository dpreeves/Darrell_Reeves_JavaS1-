package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class CommentDaoJdbcTemplateImpl implements CommentDao{

    public static final String INSERT_COMMENT = "insert into comment (post_id, create_date, commenter_name, comment) values (?, ?, ?, ?)";
    public static final String SELECT_COMMENT = "select * from comment where comment_id = ?";
    public static final String UPDATE_COMMENT = "update comment set post_id = ?, create_date = ?, commenter_name = ?, comment = ? where comment_id = ?";
    public static final String DELETE_COMMENT = "delete from comment where comment_id = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    public CommentDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}

    @Override
    public Comment createComment(Comment comment) {
        jdbcTemplate.update(INSERT_COMMENT, comment.getPostId(), comment.getCreateDate(), comment.getCommenterName(), comment.getComment());
        int commentId = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);
        comment.setCommentId(commentId);
        return comment;
    }

    @Override
    public Comment getComment(int commentId) {
        try{
            return jdbcTemplate.queryForObject(SELECT_COMMENT, this::mapRowToComment,commentId);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public void updateComment(Comment comment) {
        jdbcTemplate.update(
                UPDATE_COMMENT,
                comment.getPostId(),
                comment.getCreateDate(),
                comment.getCommenterName(),
                comment.getComment(),
                comment.getCommentId()
        );
    }

    @Override
    public void deleteComment(int commentId) {
        jdbcTemplate.update(DELETE_COMMENT, commentId);
    }

    private Comment mapRowToComment(ResultSet rs, int rowNum) throws SQLException{
        Comment comment = new Comment();
        comment.setCommentId(rs.getInt("comment_id"));
        comment.setPostId(rs.getInt("post_id"));
        comment.setCreateDate(rs.getDate("comment_date").toLocalDate());
        comment.setCommenterName(rs.getString("commenter_name"));
        comment.setComment(rs.getString("comment"));
        return comment;
    }
}
