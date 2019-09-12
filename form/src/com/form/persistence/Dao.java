package com.form.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao  {
	
	Connection ondeline;
	
	PreparedStatement stm;
	
	ResultSet rs;
	
	public void abrir() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		ondeline = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/db_clientes?useTimezone=true&serverTimezone=UTC","root","123456");
	}
	
	public void fechar() throws Exception{
		
		ondeline.close();
	}
	public static void main(String[] args) {
		Dao dao = new Dao();
		try {
			dao.abrir();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
