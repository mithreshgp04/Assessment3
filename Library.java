package com.prodapt.Assessment3;

public class Library {
	
	int id;
	String book;
	String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Library(int id, String book, String author) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", book=" + book + ", author=" + author + "]";
	}
	
	

}
