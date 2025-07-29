package com.app.dto.books;

import lombok.Data;

@Data
public class Book {
	int id;
	String title;
	String author;
	int price;
}
