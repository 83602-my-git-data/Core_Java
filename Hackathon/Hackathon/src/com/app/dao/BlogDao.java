package com.app.dao;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.pojos.Blogs;
import com.app.pojos.User;
import com.app.utils.DbUtils;

public class BlogDao {

	private Connection connection;
	private String query;

	public BlogDao() throws SQLException {

		this.connection = DbUtils.getConnection();
	}

	// 3. create Blogs
	public int addBlogs(Blogs b) throws SQLException {
		query = "INSERT INTO blogs(title,contents,created_time,user_id,category_id) VALUES(?,?,?,?,?);";
		int i = 0;
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, b.getTitle());
			stmt.setString(2, b.getContents());
			stmt.setTimestamp(3, new Timestamp(b.getCreated_date().getTime()));
			stmt.setInt(4, b.getUser_id());
			stmt.setInt(5, b.getCategoryid());
			i = stmt.executeUpdate();
		}
		return i;
	}

	//// 6.delete blogs.

	public int deleteBlogs(int id, int userid) throws SQLException {
		query = "delete from blogs where id =? and user_id= ?";
		boolean flag = false;
		int rs = 0;
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, id);
			stmt.setInt(2, userid);
			rs = stmt.executeUpdate();

		}
		return rs;
	}

	// 7.read blog contents.//5.show my blogs//4.all blogs
	public List<Blogs> AllBlog() throws SQLException {
		query = "select * from blogs";
		List<Blogs> list = new ArrayList<>();
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Blogs s = new Blogs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getInt(5),
						rs.getInt(6));
				list.add(s);
			}
		}
		return list;
	}

	// 8.edit blogs

	public boolean editsBlogs(int id, User user, Scanner sc) throws SQLException {
		sc.nextLine();
		query = "update blogs set contents = ? where id =? and user_id= ?";
		boolean flag = false;
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			System.out.println("Writes new contents in blogs ::");
			String newContents = sc.nextLine();
			stmt.setString(1, newContents);
			stmt.setInt(2, id);
			stmt.setInt(3, user.getUserId());
			int rs = stmt.executeUpdate();
			if (rs > 0)
				flag = true;
		}
		return flag;
	}

}
