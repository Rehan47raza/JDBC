package com;

import java.io.Serializable;

public class Book implements Serializable{
	
	private int Book_id;
	private String Title;
	private double price;
	private int pages;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
