package com.edu;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bookpub")
public class Publisher 
{
	@Id
	private int publisherId;
	private String publisherName;
	@Column(length=30)
	
	@OneToMany(cascade =CascadeType.ALL)//it operate first associative class operations
	@JoinColumn(name="pubid")//it creates the publisher id in book
	
	private Set<Book> booklist;//reference
	
	
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Set<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(Set<Book> booklist) {
		this.booklist = booklist;
	}
	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", booklist=" + booklist
				+ "]";
	}
	

}
