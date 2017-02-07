package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class TestProcedure {
	
	
	
	public static HashMap<Integer, Book> getMapbybookId(DbTransaction db) 
	{
		HashMap<Integer, Book> hm = new HashMap<Integer,Book>();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try
		{
			cn=db.getConnection();
			st=cn.createStatement();
			String sql="SELECT * FROM " +db.getTableName();
			
			rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				Book b = new Book();
				b.setBook_id(rs.getInt("BOOK_ID"));
				b.setPages(rs.getInt("PAGES"));
				b.setPrice(rs.getDouble("PRICE"));
				b.setTitle(rs.getString("TITLE"));
				/*System.out.println(b.getBook_id());*/
				
				hm.put(b.getBook_id(), b);
				/*System.out.println(hm.get(b.getBook_id()).getBook_id());*/
			}
			
			return hm;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	
	public static ArrayList<Author> getBookscountbyAuthor(DbTransaction db) 
	{
		ArrayList<Author> ar = new ArrayList<Author>();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try
		{
			cn=db.getConnection();
			st=cn.createStatement();
			String sql="SELECT "+db.getTableName1()+".AUTHOR_NAME, COUNT("+db.getTableName2()+".AUTHOR_ID) FROM "+db.getTableName1()+" , "+db.getTableName2()+" WHERE "+db.getTableName1()+".AUTHOR_ID="+db.getTableName2()+".AUTHOR_ID GROUP BY "+db.getTableName1()+".AUTHOR_NAME";
			
			rs = st.executeQuery(sql);
			System.out.println(rs.getFetchSize());
			while(rs.next())
			{
				Author a = new Author();
				a.setAuthorName(rs.getString(1));
				/*System.out.println(rs.getString(1));*/
				a.setCount(rs.getInt(2));
				/*System.out.println(rs.getInt(2));*/
				
				
				ar.add(a);
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		return ar;
	}
	

}
