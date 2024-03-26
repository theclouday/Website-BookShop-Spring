package com.BookShop.WepAppBookShop.Page.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
    public String getStartPage() {
        return "index.html";
    }

    @GetMapping("/listOfBooks")
    public String listOfBooks() {
        return "listOfBooks.html";
    }

    @GetMapping("/findBooks")
    public String findBooks() {
        return "findBooks.html";
    }

//    @GetMapping("/admin_panel")


}

