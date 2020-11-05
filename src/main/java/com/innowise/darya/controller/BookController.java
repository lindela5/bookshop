package com.innowise.darya.controller;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.dto.BookDTO;
import com.innowise.darya.entity.Section;

import com.innowise.darya.service.BookService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/book")
@Log
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    @GetMapping(value = {"/", "/index"})
//    public String index(Model model) {
//        model.addAttribute("title", "Book");
//        return "index";
//    }
//
//    @PostMapping("filter")
//    public String filter( @RequestParam String year, Map<String, Object> model) {
//        Set<AuthorDTO> items = new HashSet<>();
//
//        if (year != null && !year.isEmpty()) {
//            items = bookService.getAuthorByYear(year);
//        }
//
//        if (!items.isEmpty()) {
//            model.put("items", items);
//        }
//        model.put("title", "Books");
//        return "index";
//    }


    @PostMapping("/save")
    public BookDTO saveBook(@RequestBody BookDTO bookDto) {
        log.info("Handling save users: " + bookDto);
        return bookService.saveBook(bookDto);
    }


    @GetMapping("/findAll")
    public List<BookDTO> getAllBooks(){
        log.info("Handling find all users request");
        return bookService.getAllBooks();
    }
//
//    @GetMapping("/getbyid/{id}")
//    public BookDTO getBookById(@PathVariable long id) {
//        log.info("Handling find by id request: " + id);
//        return bookService.getBookById(id);
//    }


    @GetMapping("/getbyid")
    public BookDTO getBookById(@RequestParam long id) {
        log.info("Handling find by id request: " + id);
        return bookService.getBookById(id);
    }


    //найти всех авторов, которые издавались в этот год
    @GetMapping("/getauthorbyyear/{year}")
    public Set<AuthorDTO> getAuthorByYear(@RequestParam String year) {
        return bookService.getAuthorByYear(year);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable String id) {
        log.info("Handling delete user request: " + id);
        bookService.deleteBook(Long.valueOf(id));
        return ResponseEntity.ok().build();
    }

    //в каких секциях лежат книги
    @GetMapping("/getbysection/")
    public List<BookDTO> getBySection(@PathVariable long section){
        return bookService.getBySection(section);
    }

//    @GetMapping(value = {"/", "/index"})
//   public String index(Model model) {
//        model.addAttribute("title", "Book");
//        return "index";
//    }
//
//    @PostMapping("filter")
//    public String filter(@RequestParam Integer year, Map<String, Object> model) {
//        Set<AuthorDTO> author = new HashSet<>();
//
//            author = bookService.getAuthorByYear(year);
//
//            model.put("items", author);
//
//        return "index";
//    }
}