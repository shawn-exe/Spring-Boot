package com.infosys.springcore.library.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.springcore.library.entity.Books;


public class RowMapperImpl implements RowMapper<Books>{

	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Books books=new Books();
		books.setBid(rs.getInt(1));
		books.setBname(rs.getString(2));
		books.setAname(rs.getString(3));
		books.setYr(rs.getString(4));
		return books;
	}

}
