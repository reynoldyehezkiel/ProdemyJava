package com.telusko.web.dao;

import java.sql.*;
import com.tutorial.web.model.Alien;

public class AlienDAO 
{	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mario","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return a;
	}
	
	public Alien addAlien(int aid, String aname, String tech)
	{
		Alien a = new Alien();		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mario","root","");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO alien VALUES("+aid+",'"+aname+"','"+tech+"')");

			pstmt.setInt(1, aid);
			pstmt.setString(2, aname);
			pstmt.setString(3, tech);

			int i = pstmt.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return a;
	}
}
