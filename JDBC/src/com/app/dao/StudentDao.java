package com.app.dao;

import java.security.PublicKey;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.app.entity.Student;
import com.app.utils.DbUtil;

public class StudentDao implements AutoCloseable {

	private Connection connection;

	private String query;

	public StudentDao() throws SQLException {
		connection = DbUtil.getConnection();
	}

	public void insertStudent(Student s) throws SQLException {

		query = "INSERT INTO student(name,marks,mobile) VALUES(?,?,?)";

		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, s.getName());
			stmt.setDouble(2, s.getMarks());
			stmt.setString(3, s.getMobile());
			int i = stmt.executeUpdate();
			if (i == 1)
				System.out.println("insert is done.");
			else
				System.out.println("insert is not done.");
		}
	}

	public List<Student> allStudent() throws SQLException {
		query = "select * from student";
		// sqlinjection
		List<Student> list = new ArrayList<>();

		try (PreparedStatement p1 = connection.prepareStatement(query)) {

			// dml - insert update delete -- excuteUpdate select --excuteQuery

			ResultSet data = p1.executeQuery(query);

			while (data.next()) {
				Student s = new Student();
				s.setRollno(data.getInt(1));
				s.setName(data.getString(2));
				s.setMarks(data.getDouble(3));
				s.setMobile(data.getString(4));

				list.add(s);
			}

			return list;
		}

	}

	public void deleteStudentById(int id) throws SQLException {
		query = "delete from student where rollno = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, id);
			int row = ps.executeUpdate();

			if (row > 0)
				System.out.println("delete student who has roll no is " + id);
			else
				System.out.println("id is not in tables");

		}
	}

	public Student studentById(int id) throws SQLException {

		query = "select * from student where rollno = ?";
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			return new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
			return null;
		}
	}

	@Override
	public void close() throws Exception {
		connection.close();
	}
}
