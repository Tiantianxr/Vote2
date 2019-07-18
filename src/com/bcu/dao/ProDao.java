package com.bcu.dao;
 
import java.util.ArrayList;
import java.util.List;

import com.bcu.DBUtil.DBUtil;
import com.bcu.bean.Pro;

import java.sql.*;
 
public class ProDao {
	DBUtil db=new DBUtil();
	public List<Pro> selectAll() {
		System.out.println("连接");
		Connection con = db.getConnection();
		Statement stmt;
		List<Pro> list = new ArrayList<Pro>();
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM pro");
			while(rs.next()) {
				Pro pro = new Pro();
				pro.setPro_id(rs.getString("pro_id"));
				System.out.println(rs.getString("pro_id"));
				pro.setPro_name(rs.getString("pro_name"));
				System.out.println(rs.getString("pro_name"));
				pro.setPro_type(rs.getString("pro_type"));
				pro.setPro_per(rs.getString("pro_per"));
				pro.setPro_dan(rs.getString("pro_dan"));
				pro.setPro_num(rs.getString("pro_num"));
				pro.setFlag(rs.getInt("flag"));
				list.add(pro);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return list;	
	}

	public int insert(Pro pro){
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		int count =0;
	    try {
	    	ps=con.prepareStatement("insert into pro(pro_id,pro_name,pro_type,pro_per,pro_dan,pro_num) values(?,?,?,?,?,?)");
	    	ps.setString(1, pro.getPro_id());
	    	ps.setString(2, pro.getPro_name());
	    	ps.setString(3, pro.getPro_type());
	    	ps.setString(4, pro.getPro_per());
	    	ps.setString(5, pro.getPro_dan());
	    	ps.setString(6, pro.getPro_num());
			count = ps.executeUpdate();
			/*if(count==0){
				throw new DataAlreadyExistException();
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return count;		
	}
	
	public int update(Pro pro) {
		Connection con = db.getConnection();
		System.out.println(pro.getPro_name());
		PreparedStatement ps = null;
		int affCount = 0;
		try {
			ps = con.prepareStatement("update pro set pro_name=?,pro_type=?,pro_per=?,pro_dan=?,pro_num=?,flag=? where pro_id=?");
			ps.setString(1, pro.getPro_name());
			ps.setString(2, pro.getPro_type());
			ps.setString(3, pro.getPro_per());
			ps.setString(4, pro.getPro_dan());
			ps.setString(5, pro.getPro_num());
			ps.setInt(6, pro.getFlag());
			ps.setString(7, pro.getPro_id());
	  
			affCount = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return affCount;
		
	}
	public int update2(Pro pro) {
		Connection con = db.getConnection();
		System.out.println(pro.getPro_name());
		PreparedStatement ps = null;
		int affCount = 0;
		try {
			ps = con.prepareStatement("update pro set pro_num=?,flag=? where pro_id=?");
			ps.setString(1, pro.getPro_num());
			ps.setInt(2, pro.getFlag());
			ps.setString(3, pro.getPro_id());
	  
			affCount = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return affCount;
		
	}
	public int delete(int pro_id) {
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		int affCount = 0;
		try {
			ps = con.prepareStatement("delete  from pro where pro_id=?");
			ps.setInt(1, pro_id);
			affCount = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return affCount;
	}
}