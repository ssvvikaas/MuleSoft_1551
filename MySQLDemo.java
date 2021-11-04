package com.movie.jdbc;
	import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	public class MySQLDemo {
	public static void main(String[] args) throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/my_movie","root","vikaas");
	Statement st=con.createStatement();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("Enter the Table Name : - ");
	String tname=br.readLine();
	String query=" create table"+ tname+" (SNO int (3) primary keyNAME, NAME varchar(45),Lead Actor varchar(45),SNo:, Actress  varchar(45), Year of Release  varchar(45), Director  varchar(45))";
	st.executeUpdate (query);
	System.out.println(tname+"created successfully");
	st.close();
	con.close();

	}

}
