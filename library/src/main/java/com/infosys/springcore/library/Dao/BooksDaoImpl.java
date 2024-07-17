package com.infosys.springcore.library.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.infosys.springcore.library.entity.Books;
@Component("BooksDao")
public class BooksDaoImpl implements BooksDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Books books) {
		String query="insert into books(bid,bname,aname,yr) values(?,?,?,?)";
    	int ans =this.jdbcTemplate.update(query,books.getBid(),books.getBname(),books.getAname(),books.getYr());
		return ans;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int modify(Books books) {
		String query="update books set aname=? where bid=?";
    	int ans =this.jdbcTemplate.update(query,books.getAname(),books.getBid());
		return ans;
	}

	@Override
	public int delete(int bid) {
		// TODO Auto-generated method stub
		String query ="delete from books where bid =?";
		int ans=this.jdbcTemplate.update(query,bid);
		return ans;
	}

	@Override
	public Books getBook(int usn) {
		// TODO Auto-generated method stub
		String query ="select * from books where bid=?";
		RowMapper<Books> rowMapper=new RowMapperImpl();
		Books books=this.jdbcTemplate.queryForObject(query, rowMapper,usn);
		return books;
	}

	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		String query ="select * from books";
		List<Books> books=this.jdbcTemplate.query(query, new RowMapperImpl());
		return books;
	}

}
