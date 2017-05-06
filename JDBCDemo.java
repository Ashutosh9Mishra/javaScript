package com.ashutosh.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import java.sql.Connection;

public class JDBCDemo {
    @Test(timeout=1)
   public static Connection createCon() throws ClassNotFoundException, SQLException{
	   
	   Class.forName("com.mysql.jdbc.Driver");
	   String url = "jdbc:mysql://localhost:3306/onlineapp";
	   String id = "root";
	   String pass = "ashutosh";
	   Connection con = DriverManager.getConnection(url, id, pass);
	 return con;
   }
   
   public static String addProduct(String name,int id,String date) throws ClassNotFoundException, SQLException{
	   
	   Connection conn = null;
	   Statement st = null;
	 
	   try{
	   conn = createCon();
	   st = conn.createStatement();
	   int row = st.executeUpdate("insert into onlineapp values('"+name+"',"+id+",'"+date+"');");
	   
	   return row>0?"Product added":"Product not added"; 
	   }
	   finally{
		if(st!=null){
			st.close();
		}
		if(conn!=null){
			conn.close();
		}
	   }
   }
	   public static String getProduct(String name,int id,String date) throws ClassNotFoundException, SQLException{
		   
		   Connection conn = null;
		   Statement st = null;
		   ResultSet rs = null;
		   try{
		   conn = createCon();
		   st = conn.createStatement();
		  rs =   st.executeQuery("select 8 from onlineapp where name='"+name+"' AND productid="+id+" AND date='"+date+"';");		   
		   return rs.next()?"WELCOME":"BHAKKK"; 
		   }
		   finally{
			   
			   if(rs!=null){
				   rs.close();
			   }
			if(st!=null){
				st.close();
			}
			if(conn!=null){
				conn.close();
			}
		   }
		   
	   
	   
	   
   }

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
   //   JDBCDemo.createCon();
//		String returntype = JDBCDemo.addProduct("shoes",12, "12/02/2012");
//      System.out.println(returntype);
      System.out.println(JDBCDemo.getProduct("shoes", 12, "12/02/2012"));     
	 }

}
