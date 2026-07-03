package com.dao.imple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoclass.UserDAO;
import com.dao.model.User;

public class UserDAOImple implements UserDAO {
	private static Connection con;
	ArrayList<User> al = new ArrayList<User> ();
	private static String delete_user_by_id = "delete from user where user_id=?";
	private static String get_user_by_id = "select * from user where user_id = ?";
	private static String gell_all_data = "select * from user";
	private static String insert_data  ="insert user (user_name,password,email,address) values(?,?,?,?)";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_app","root","root");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet res;
	@Override
	public int insertUser(User user) {
		int x = -1;
		try {
			pstmt = con.prepareStatement(insert_data);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			
			x = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}

	@Override
	public List<User> getAllUser() {
		
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(gell_all_data);
			while(res.next()) {
				al.add( new User(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)));
			}
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public User getUserById(int id) {
		User u = null;
		try {
			pstmt = con.prepareStatement(get_user_by_id);
			pstmt.setInt(1,id);
			
			res = pstmt.executeQuery();
			if(res.next()) {
				 u = new User(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public int deleteUserById(int id) {
		int x = -1;
		try {
			pstmt = con.prepareStatement(delete_user_by_id);
			pstmt.setInt(1, id);
			
			x = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}

	@Override
	public int updatedUserById(int id, String address) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
