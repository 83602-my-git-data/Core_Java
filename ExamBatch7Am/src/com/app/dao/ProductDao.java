package com.app.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.pojos.Category;
import com.app.pojos.Product;
import com.app.pojos.Seller;
import com.app.utils.DbUtil;

public class ProductDao implements AutoCloseable{
     private Connection connection;
     private String query;
     
	 public ProductDao() throws SQLException {
		this.connection = DbUtil.getConnection();
	}


	public boolean addSeller(Seller seller) throws SQLException{
		int i = 0;
		 query = "INSERT INTO seller (name, email, password, address) VALUES (?, ?, ?,?);";
		 try (PreparedStatement stmt = connection.prepareStatement(query)) {
				stmt.setString(1, seller.getName());
				stmt.setString(2, seller.getEmail());
				stmt.setString(3, seller.getPassword());
				stmt.setString(4, seller.getAddress());
			 i = stmt.executeUpdate();
			}
		 if(i >0) return true;
		 return false;
	 }
	
	public Seller login(Seller seller) throws SQLException {
		query = "select * from seller where email =? and password = ?";
		 Seller s = null;
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, seller.getEmail());
			stmt.setString(2, seller.getPassword());
		    ResultSet rs = stmt.executeQuery();
		    while(rs.next()) {
		    s = new Seller(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		    }
		}		
		return s;
	}
	
	public boolean addProducts(Product p) throws SQLException{
		int i = 0;
		int a=0;
		 query = "INSERT INTO product (name, category, price, in_stock) VALUES (?, ?, ?,?);";
		 try (PreparedStatement stmt = connection.prepareStatement(query)) {
			if(p.isIs_stock())
				i=1;
				stmt.setString(1, p.getName());
				stmt.setString(2, p.getCategory().name());
				stmt.setDouble(3, p.getPrice());
				stmt.setInt(4, i);
			 a = stmt.executeUpdate();
			}
		 if(a >0) return true;
		 return false;
	 }
	
	public List<Product> allProducts() throws SQLException{
		List<Product> list = new ArrayList<>();
		query = "select * from product;";
		 try (PreparedStatement stmt = connection.prepareStatement(query)) {
			
			 ResultSet rs = stmt.executeQuery();
			 while (rs.next()) {
				 boolean f = false;
				  int i= rs.getInt(5);
				  if(i==1)
					  f=true;
				  list.add(new Product(rs.getInt(1),rs.getString(2),Category.valueOf(rs.getString(3)),rs.getDouble(4),f));
				}
			 return list;
			}
	}


	@Override
	public void close() throws Exception {
		connection.close();
		
	}
	
}
