package com.app.controller.books;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.books.Book;
import com.app.service.books.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	//1)목록 확인 페이지 O
	@GetMapping("/books")
	public String books(Model model) {
		
		List<Book> bookList = bookService.findBookList();
		
		model.addAttribute("bookList", bookList);
		
		return "books/bookList";
	}
	
	//2)상세 도서 정보 페이지 O
	@GetMapping("/books/info/{id}")
	public String bookInfo(@PathVariable String id, Model model) {
		
		Book book = bookService.findBookById(Integer.parseInt(id));
		model.addAttribute("book", book);
		
		return "books/bookInfo";
	}
	
	//3)새로운 도서정보 추가 기능 O
	@GetMapping("/books/register")
	public String registerBook() {
		return "books/registerBook";
	}
	
	@PostMapping("/books/register")
	public String registerBookAction(Book book) {
		int result = bookService.saveBook(book);
		
		if(result > 0) {
			return "redirect:/books";
		}
		return "books/registerBook";
	}
	
	
	//4)도서정보 수정 기능
	@GetMapping("/books/modify")
	public String modifyBook(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		
		Book book = bookService.findBookById(Integer.parseInt(id));
		
		request.setAttribute("book", book);
		
		return "books/modifyBook";
	}
	
	@PostMapping("/books/modify")
	public String modifyBookAction(Book book) {
		
		int result = bookService.modifyBook(book);
		
		if(result > 0) {
			return "redirect:/books/info/" + book.getId();
		}
		
		return "redirect:/books/modify?id=" + book.getId();
	}
	
	//5)도서정보 삭제 기능 O
	@GetMapping("/books/remove")
	public String deleteBook(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		
		int result = bookService.removeBook(Integer.parseInt(id));
		//성공하든 실패하든 리스트 보여주기
		return "redirect:/books";
		
	}
}
