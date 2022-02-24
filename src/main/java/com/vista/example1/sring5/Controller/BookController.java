package com.vista.example1.sring5.Controller;

import com.vista.example1.sring5.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    @RequestMapping("/books")
    public String getBooks(Model model){
      model.addAttribute("books",bookRepo.findAll() );
      return "books";
    }
}
