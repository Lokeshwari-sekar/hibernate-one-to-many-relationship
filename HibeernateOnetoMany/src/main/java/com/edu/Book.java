package com.edu;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Bookdet")
public class Book
{
	@Id
	private int bookid;
	@Column(length=40)
	private String bookname;
	@Column(length=30)
	private String authorname;
	private double bookprice;
	
	public Book(int bookid, String bookname, String authorname, double bookprice) 
	{
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.bookprice = bookprice;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", bookprice="
				+ bookprice + "]";
	}
	
	
	
	
	
	

}
