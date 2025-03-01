package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.TShirt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TShirtDaoJdbcTemplateImpl implements TShirtDao{

    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_TSHIRT_SQL = "insert into t_shirt(size, color, description, price, quantity) values (?, ?, ?, ?, ?)";
    private static final String SELECT_TSHIRT_SQL = "select * from t_shirt where t_shirt_id = ?";
    private static final String SELECT_ALL_TSHIRTS_SQL = "select * from t_shirt";
    private static final String UPDATE_TSHIRT_SQL = " update t_shirt set size = ?, color = ?, description = ?, price = ?, quantity = ? where t_shirt_id = ?";
    private static final String DELETE_TSHIRT_SQL = "delete from t_shirt where t_shirt_id = ?";
    private static final String SELECT_TSHIRT_BY_COLOR_SQL = "select * from t_shirt where color = ?";
    private static final String SELECT_TSHIRT_BY_SIZE_SQL = "select * from t_shirt where size = ?";


    @Autowired
    public TShirtDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}
    private int tShirtId;
    private String size;
    private String color;
    private String description;
    private BigDecimal price;
    private int quantity;
    @Override
    @Transactional
    public TShirt addTShirt(TShirt tShirt) {
        jdbcTemplate.update(
                INSERT_TSHIRT_SQL,
                tShirt.getSize(),
                tShirt.getColor(),
                tShirt.getDescription(),
                tShirt.getPrice(),
                tShirt.getQuantity());

        int tShirtId = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        tShirt.settShirtId(tShirtId);

        return tShirt;
    }

    @Override
    public TShirt getTShirt(int tShirtId) {
        try {
            return jdbcTemplate.queryForObject(SELECT_TSHIRT_SQL, this::mapRowToTShirt, tShirtId);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<TShirt> getAllTShirts() {
        return jdbcTemplate.query(SELECT_ALL_TSHIRTS_SQL, this::mapRowToTShirt);
    }

    @Override
    public void updateTShirt(TShirt tShirt) {
        jdbcTemplate.update(
                UPDATE_TSHIRT_SQL,
                tShirt.getSize(),
                tShirt.getColor(),
                tShirt.getDescription(),
                tShirt.getPrice(),
                tShirt.getQuantity(),
                tShirt.gettShirtId());
    }

    @Override
    public void deleteTShirt(int tShirtId) {
        jdbcTemplate.update(DELETE_TSHIRT_SQL, tShirtId);
    }

    @Override
    public List<TShirt> getTShirtsByColor(String color) {
        return jdbcTemplate.query(SELECT_TSHIRT_BY_COLOR_SQL, this::mapRowToTShirt, color);
    }

    @Override
    public List<TShirt> getTShirtsBySize(String size) {
        return jdbcTemplate.query(SELECT_TSHIRT_BY_SIZE_SQL, this::mapRowToTShirt, size);
    }

    private TShirt mapRowToTShirt(ResultSet rs, int rowNum) throws SQLException{
        TShirt tShirt = new TShirt();

        tShirt.settShirtId(rs.getInt("t_shirt_id"));
        tShirt.setSize(rs.getString("size"));
        tShirt.setColor(rs.getString("color"));
        tShirt.setDescription(rs.getString("description"));
        tShirt.setPrice(rs.getBigDecimal("price"));
        tShirt.setQuantity(rs.getInt("quantity"));

        return tShirt;
    }
}
