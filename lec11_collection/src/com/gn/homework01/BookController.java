package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;

public class BookController {
	private List<Book> bookList = new ArrayList<Book>();
	public void BookController() {
		bookList.add(new Book());
		bookList.add(new Book());
		bookList.add(new Book());
		bookList.add(new Book());
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
		
	}
	public List<Book> selectList() {
		return bookList;
	}
	public List<Book> searchBook(String keyword) {
		List<Book> searchBook = new ArrayList<>();
		for(Book book : bookList ) {
			if (book.toString().contains(keyword)) {
				searchList.add(book);
			}
		}return searchList;
	}
	public void deleteBook() {
		
	}
	public void asdBook() {
		
	}
	
}
