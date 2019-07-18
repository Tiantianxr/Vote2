 package com.bcu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.bcu.DBUtil.DBUtil;
import com.bcu.bean.User;

public class UserDao {
	DBUtil db=new DBUtil();
    //private Map<String,User> users=new HashMap<>();
    public int insertUser(User user){
    	int result=1;
    	Connection conn=db.getConnection();
    	try{
    	User us = queryUser(user.getUser_name(),user.getUser_password());
    	if(us !=null)
    		result=-1;
    	else {
    	PreparedStatement ps=conn.prepareStatement("insert into user(user_name,user_password,user_type) values(?,?,?)");
    	ps.setString(1, user.getUser_name());
    	ps.setString(2, user.getUser_password());
    	ps.setString(3, user.getUser_type());
    	ps.executeUpdate();}
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	/*String username=user.getUsername();
    	if(users.get(username)!=null){
    		 result=0;
    	}else{
    		users.put(username, user);
    	}*/
		return result;
    	
    }
    
    public User queryUser(String user_name,String user_password){
    	User user = null;
    	Connection conn=db.getConnection();
    	PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from user where user_name=? and user_password=?");
			ps.setString(1, user_name);
	    	ps.setString(2, user_password);
	    	ResultSet rs = ps.executeQuery();
	    	while(rs.next()) {
	    		String name = rs.getString("user_name");
	    		String pwd = rs.getString("user_password");
	    		String type = rs.getString("user_type");
	    		user = new User(name,pwd,type);
	    	}
	    	 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null&&user.getUser_name().equals(user_name)&&user.getUser_password().equals(user_password)){
   		 return user;
   	}else{
   		 return null;
   	}  
    }
}
