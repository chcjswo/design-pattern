package com.mocadev.fastcampus.prototype;

import java.util.ArrayList;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-09
 **/
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(new Book("조정래", "태백산맥"));
		bookShelf.addBook(new Book("박완서", "나목"));
		bookShelf.addBook(new Book("박경리", "토지"));

		System.out.println("bookShelf = " + bookShelf);

		BookShelf bookShelf1 = (BookShelf) bookShelf.clone();

		System.out.println("bookShelf1 = " + bookShelf1);

		bookShelf.getShelf().get(0).setAuthor("조정래");
		bookShelf.getShelf().get(0).setTitle("한글");

		System.out.println("bookShelf = " + bookShelf);
		System.out.println("bookShelf1 = " + bookShelf1);
	}

}

class Book {

	private String author;
	private String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book{" +
			"author='" + author + '\'' +
			", title='" + title + '\'' +
			'}';
	}

}

class BookShelf implements Cloneable {

	private ArrayList<Book> shelf;

	public BookShelf() {
		this.shelf = new ArrayList<>();
	}

	public ArrayList<Book> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}

	public void addBook(Book book) {
		shelf.add(book);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		BookShelf another = new BookShelf();
		for (Book book : shelf) {
			another.addBook(new Book(book.getAuthor(), book.getTitle()));
		}
		return another;
	}

	@Override
	public String toString() {
		return "BookShelf{" +
			"shelf=" + shelf +
			'}';
	}

}
