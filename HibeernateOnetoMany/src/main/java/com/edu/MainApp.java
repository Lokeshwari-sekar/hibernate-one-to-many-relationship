package com.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class MainApp {

	public static void main(String[] args)
	{
		Configuration conn=new Configuration().configure().addAnnotatedClass(Publisher.class).addAnnotatedClass(Book.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();


		Book b1=new Book(1," java", "kathy",1000 );
		Book b2=new Book(2, "Hibernate", "john", 800);
		Book b3=new Book(3,"Spring" , "rod johnson",900);
		Set<Book> booklist=new HashSet<Book>(Arrays.asList(b1,b2,b3));
		
		Book book1=new Book(4," python", "mary",900 );
		Book book2=new Book(5, "cloudcomputing", "john", 800);
		Book book3=new Book(6,"c program" , "richard",700);
		Set<Book> booklist1=new HashSet<Book>(Arrays.asList(book1,book2,book3));


		Publisher pub=new Publisher();
		pub.setPublisherId(1);
		pub.setPublisherName("xyz");
		pub.setBooklist(booklist);
		
		pub.setPublisherId(2);
		pub.setPublisherName("abc");
	    pub.setBooklist(booklist1);
		
		sess.save(pub);
		tx.commit();
		sess.close();


	}

}
